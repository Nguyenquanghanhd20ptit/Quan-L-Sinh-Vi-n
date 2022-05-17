package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import connection_javasql.connection_jdbc;
import controller.teacher;
import controller.teacher;

public class user_dao implements daointerface<teacher> {
	public static user_dao getInstance() {
		return new user_dao();
	}

	@Override
	public int insert(teacher t) {
		int kq=0;
		try {
			//b1 tao ket noi
			Connection connection = connection_jdbc.getConnection();
			//b2 tao doi tuong statement
			String sql = "INSERT INTO user (username, password) "+
					" VALUES (?,?)";
			PreparedStatement pStatement = connection.prepareStatement(sql);
			
			//b3: thuc thi sql
			pStatement.setString(1, t.getUsername());
			pStatement.setString(2, t.getPassword());
			//b4: tra ve kq
			System.out.println("ban da thuc thi: "+sql);
			System.out.println("co "+kq+" dong bi thay doi");
			
			//b5: ngat connection
			connection_jdbc.closeconnection(connection);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public int update(teacher t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(teacher t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<teacher> selectALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public teacher selectById(teacher t) {
		teacher kq=null;
		try {
			//b1 tao ket noi den sql
			Connection connection = connection_jdbc.getConnection();
			
			//b2 tao ra doi tuong statememt
			String sql = "select *from user where username=? and password=?";
			PreparedStatement pStatement = connection.prepareStatement(sql);
			
			//b3: thuc thi cau lenh sql
			pStatement.setString(1, t.getUsername());
			pStatement.setString(2, t.getPassword());
		    ResultSet resultSet = pStatement.executeQuery();//lay du lieu 
		    while(resultSet.next()) {
		    	String username = resultSet.getString("username");
		    	String password = resultSet.getString("password");
		    	
		    	
		    	kq = new teacher(username, password);
		    }
		    System.out.println("thuc thi cau leng "+sql);
		    System.out.println(kq);
			//b5: ngat connection
			connection_jdbc.closeconnection(connection);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public ArrayList<teacher> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
