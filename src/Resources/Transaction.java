package Resources;

import java.util.*;

public class Transaction {
	private String Day = null;
	private int id = 0;
	private Double type = 0.0;
	private Date Time_Of_Day = null;
	private String Description = null;
	private float Ammount = 0;
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day = day;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getType() {
		return type;
	}
	public void setType(Double type) {
		this.type = type;
	}
	public Date getTime_Of_Day() {
		return Time_Of_Day;
	}
	public void setTime_Of_Day(Date time_Of_Day) {
		//Convert to 12hour/ 24 hour format
		Time_Of_Day = time_Of_Day;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public float getAmmount() {
		return Ammount;
	}
	public void setAmmount(float ammount) {
		Ammount = ammount;
	}

}
