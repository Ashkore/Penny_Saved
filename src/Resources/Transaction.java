package Resources;

public class Transaction {
	public static int lastId = 1;
	private String Day = null;
	private int id = 0;
	private String type = null;
	private String Time_Of_Day = null;
	private String Description = null;
	private float Amount = 0;
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day = day.toUpperCase();;
	}
	public int getId() {
		return id;
	}
	public void setId() {
		//find a way to create a new id
		this.id = GlobalUtils.getInstance().getNewTransactionId();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTime_Of_Day() {
		return Time_Of_Day;
	}
	public void setTime_Of_Day(String time_Of_Day) {
		//Convert to 12hour/ 24 hour format
		Time_Of_Day = time_Of_Day;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public float getAmount() {
		return Amount;
	}
	public void setAmount(float amount) {
		Amount = amount;
	}
	
}
