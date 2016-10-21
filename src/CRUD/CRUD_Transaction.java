package CRUD;
import java.util.*;

import Resources.Transaction;
import Resources.GlobalUtils;
public class CRUD_Transaction {
	public void Create(String day, int id, Double type, Date time_Of_Day, String description, float amount) {
		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		transaction.setDay(day);
		transaction.setDescription(description);
		transaction.setId(id);
		transaction.setTime_Of_Day(time_Of_Day);
		transaction.setType(type);
		GlobalUtils.getInstance().AddTransaction(transaction);
	}
	public Transaction Retrieve(int id) {
		Transaction transaction = GlobalUtils.getInstance().GetTransactionforID(id);
		return transaction;
	}
	public String Update(int oldID, String day, int id, Double type, Date time_Of_Day, String description, float amount) {
		Transaction newtransaction = new Transaction();
		newtransaction.setAmount(amount);
		newtransaction.setDay(day);
		newtransaction.setDescription(description);
		newtransaction.setId(id);
		newtransaction.setTime_Of_Day(time_Of_Day);
		newtransaction.setType(type);
		 return GlobalUtils.getInstance().UpdateTransactionforID(oldID, newtransaction);
	
	}
	public void Delete(int id) 
	{
		GlobalUtils.getInstance().RemoveTransactionByID(id);	
	}
}
