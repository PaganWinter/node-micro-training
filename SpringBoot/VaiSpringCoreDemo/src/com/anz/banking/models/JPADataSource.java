package com.anz.banking.models;

import org.springframework.stereotype.Component;

@Component(value="jpadsComp")
public class JPADataSource extends DataSource {
	private int connectionPoolSize;
	private boolean ddl;
	private boolean showSQL;

	public JPADataSource() {
		super();
	}
	/* Constructor */
	public JPADataSource(String url, int port, String userName, String password, String dbName) {
		super(url, port, userName, password, dbName);
	}

	/* Getters and Setters */
	public int getConnectionPoolSize() {
		return connectionPoolSize;
	}
	public void setConnectionPoolSize(int connectionPoolSize) {
		this.connectionPoolSize = connectionPoolSize;
	}
	public boolean isDdl() {
		return ddl;
	}
	public void setDdl(boolean ddl) {
		this.ddl = ddl;
	}
	public boolean isShowSQL() {
		return showSQL;
	}
	public void setShowSQL(boolean showSQL) {
		this.showSQL = showSQL;
	}
}
