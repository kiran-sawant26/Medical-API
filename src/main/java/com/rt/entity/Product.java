package com.rt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product")
public class Product {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
    private String brand;
    private String category;
    private String batchNo;
    private String mfgDate;       
    private String expDate;
    private String purchaseRate;
    private String sellingRate;
    private String quantity;
    private String gst;
    private String rackNo;
    public Product() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getPurchaseRate() {
		return purchaseRate;
	}
	public void setPurchaseRate(String purchaseRate) {
		this.purchaseRate = purchaseRate;
	}
	public String getSellingRate() {
		return sellingRate;
	}
	public void setSellingRate(String sellingRate) {
		this.sellingRate = sellingRate;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public String getRackNo() {
		return rackNo;
	}
	public void setRackNo(String rackNo) {
		this.rackNo = rackNo;
	}
	public Product(int id, String name, String brand, String category, String batchNo, String mfgDate, String expDate,
			String purchaseRate, String sellingRate, String quantity, String gst, String rackNo) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.batchNo = batchNo;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.purchaseRate = purchaseRate;
		this.sellingRate = sellingRate;
		this.quantity = quantity;
		this.gst = gst;
		this.rackNo = rackNo;
	}
    
}
