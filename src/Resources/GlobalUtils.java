package Resources;

import java.util.ArrayList;

public class GlobalUtils 
{
	private static GlobalUtils _instance = null;
	private ArrayList<Transaction> transactionArray = null;
	
	private void GlobalUtils()
	{
		_instance.transactionArray = new ArrayList<Transaction>();
	}
	public ArrayList<Transaction> getAllTransactions() {
		return transactionArray;
	}
	public int getNewTransactionId(){
		int returnid = Transaction.lastId;
		Transaction.lastId = Transaction.lastId+1;
		return returnid;
	}
	public double getTotalRevenue(){
		float total = 0;
		for (Transaction eachTransaction : transactionArray) {
			float amount = eachTransaction.getAmount();
			String type = eachTransaction.getType();
			if (type.toLowerCase() == "revenue"){
				total += amount;
			}
			else {total -=amount;}
		}
		return total;
		
	}
	public void AddTransaction(Transaction transaction) 
	{
		if (_instance == null)
		{
			System.out.print("AYYO");
		}
		transactionArray.add(transaction);
	}
	
	public Transaction GetTransactionforID(int transactionID) 
	{
		for (Transaction eachTransaction : transactionArray) 
		{
			if (eachTransaction.getId() == transactionID)
			{
				return eachTransaction;
			}
		}
		return null;
	};
	public String UpdateTransactionforID(int oldTransactionID, Transaction newTransaction) 
	{
		for (Transaction eachTransaction : transactionArray) 
		{
			if (eachTransaction.getId() == oldTransactionID)
			{
				_instance.RemoveTransactionByID(oldTransactionID);
				_instance.AddTransaction(newTransaction);
				return "Sucessfully Updated: "+Integer.toString(oldTransactionID)+" to "+Integer.toString(newTransaction.getId());
			}
		}
		return "Failure: "+Integer.toString(oldTransactionID)+" does not exist.";
	};
	public String RemoveTransactionByID(int transactionID) {
		
		Transaction transAction = GetTransactionforID(transactionID);
		if (transAction != null) {
			transactionArray.remove(transAction);
			return "Sucessfully: "+Integer.toString(transactionID)+" removed.";
		}
		else {
			return "Failure: "+Integer.toString(transactionID)+" does not exist.";
		}
	}
	public static GlobalUtils getInstance() 
	{
		if (_instance == null) 
		{
			_instance = new GlobalUtils();
		}
		return _instance;
	
	}
}
