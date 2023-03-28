package com.examples.springdemos;

public class EmployeeDAO {

	private String dbserver;
	private String dbport;
	private String dbuser;
	private String dbpassword;
	public EmployeeDAO(String dbserver, String dbport, String dbuser, String dbpassword) {
		super();
		this.dbserver = dbserver;
		this.dbport = dbport;
		this.dbuser = dbuser;
		this.dbpassword = dbpassword;
	}
	
//	public Employee getEmployee(int id) {
//		//get the db connection using server
//		Connection conn;
//		return null;
//	}
	
	@Override
	public String toString() {
		return "EmployeeDAO [dbserver=" + dbserver + ", dbport=" + dbport + ", dbuser=" + dbuser + ", dbpassword="
				+ dbpassword + "]";
	}
}
