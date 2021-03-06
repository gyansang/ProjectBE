package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int pId;
	private String pName;
	@Column(name="Product_Cost")
	private String pCost;
	
	public Product(String pName, String pCost) {
		super();
		//this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCost() {
		return pCost;
	}
	public void setpCost(String pCost) {
		this.pCost = pCost;
	}
}
