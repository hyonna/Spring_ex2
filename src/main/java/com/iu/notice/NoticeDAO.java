package com.iu.notice;

import java.sql.Connection;

import com.iu.s2.util.DBConnector;

public class NoticeDAO {
	
	private DBConnector dbConnector;
	
	public NoticeDAO() {
		// TODO Auto-generated constructor stub
		dbConnector = new DBConnector();
	}
	
	public int insert() throws Exception {
		
		Connection con = dbConnector.getConnect();
		System.out.println(con);
		
		return 0;
	}
	

}
