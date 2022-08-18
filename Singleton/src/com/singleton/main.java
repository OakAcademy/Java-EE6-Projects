package com.singleton;

public class main {

	public static void main(String[] args) {
	  DatabaseConnection MySQL;
	  MySQL=DatabaseConnection.getInstance();
	  MySQL.getDatabaseConnection();

	}

}
