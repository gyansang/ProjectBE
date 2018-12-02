package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(value="Customer_Detail")
public class Customer {
	@Id
	@
	public int cId;
	@Column(value="Customer_Age")
	public int cAge;
	@Column(value="Customer_Name")
	public String cName;
	@Column(value="Contact_Number")
	public String cContact;
	
	
	public Customer() {
		super();
	}
	public Customer(int cAge, String cName, String cContact) {
		super();
		this.cAge = cAge;
		this.cName = cName;
		this.cContact = cContact;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getcAge() {
		return cAge;
	}
	public void setcAge(int cAge) {
		this.cAge = cAge;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcContact() {
		return cContact;
	}
	public void setcContact(String cContact) {
		this.cContact = cContact;
	}

}
