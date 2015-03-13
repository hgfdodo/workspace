package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Project: CyberSpeedTest_ivce
 * @Author: Guangfu He
 * @Date: 2015-3-11
 * @Copyright: 2015 cyber Inc. All rights reserved.
 */

public class DB {

	private Connection con;
	private String driver;
	private String url;
	private int port;
	private String user;
	private String password;

	/**
	 * 初始化链接参数
	 */
	public DB() {
		// get database property file and configure database connenction info.
		PropertiesUtils pro = new PropertiesUtils("database.properties");
		this.driver = pro.getProperty("driver");
		this.url = pro.getProperty("url");
		this.port = Integer.parseInt(pro.getProperty("port"));
		this.user = pro.getProperty("user");
		this.password = pro.getProperty("password");
	}

	/**
	 * 建立数据库链接
	 * 
	 * @throws Exception
	 */
	private void getConn() throws Exception {
		Connection con = null;
		try {
			Class.forName(driver);
			this.con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (this.con == null) {
			System.out
					.println("Connection is null, cannot establish connection!!!");
			throw new Exception();
		}
	}

	public boolean truncateTable(String tablename) {
		boolean flag = false;

		try {
			Statement stat = this.con.createStatement();
			String sql = "truncate " + tablename + ";";

			flag = stat.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return flag;
	}

	/**
	 * 插入或删除数据表
	 * @param sql
	 * @return
	 */
	public boolean execute(String sql){
		boolean flag = false;
		//TODO 插入数据库
		return flag;
	}
	
	/**
	 * 获取statement对象，查询和修改数据库
	 * @return
	 */
	public Statement getStatement(){
		Statement st = null;
		try {
			st = this.con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return st;
	}
	
	
	
}
