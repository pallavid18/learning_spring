package com.model;

public class MyDao {

	private String dbServer, dbName, dbUser, dbPass;

	public MyDao(String dbServer, String dbName, String dbUser, String dbPass) {
		super();
		this.dbServer = dbServer;
		this.dbName = dbName;
		this.dbUser = dbUser;
		this.dbPass = dbPass;
	}

	@Override
	public String toString() {
		return "MyDao [dbServer=" + dbServer + ", dbName=" + dbName + ", dbUser=" + dbUser + ", dbPass=" + dbPass + "]";
	}

}
