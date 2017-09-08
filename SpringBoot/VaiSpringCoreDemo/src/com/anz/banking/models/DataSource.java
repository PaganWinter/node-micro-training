package com.anz.banking.models;

import org.springframework.stereotype.Component;

@Component(value="dsComp")
public class DataSource {
	private String url;
	private int port;
	private String userName;
	private String password;
	private String dbName;

	/* Constructor */
	public DataSource() {
	}
	public DataSource(String url, int port, String userName, String password, String dbName) {
		super();
		this.url = url;
		this.port = port;
		this.userName = userName;
		this.password = password;
		this.dbName = dbName;
	}

	/* Getters and Setters */
	public String getUrl() {
		return url;
	}
	public int getPort() {
		return port;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getDbName() {
		return dbName;
	}
}
