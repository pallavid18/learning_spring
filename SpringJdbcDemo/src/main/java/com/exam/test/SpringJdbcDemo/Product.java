package com.exam.test.SpringJdbcDemo;

public class Product {
	
	private int id;
	private String pname;
    private double pprice;
    private String pquality;
    
    public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, double pprice, String pquality) {
		super();
		this.pname = pname;
		this.pprice = pprice;
		this.pquality = pquality;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public String getPquality() {
		return pquality;
	}

	public void setPquality(String pquality) {
		this.pquality = pquality;
	}
    
    

}
