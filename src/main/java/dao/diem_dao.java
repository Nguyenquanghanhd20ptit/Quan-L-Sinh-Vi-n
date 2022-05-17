package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.catalina.connector.Response;
import org.apache.catalina.core.JniLifecycleListener;

import connection_javasql.connection_jdbc;
import controller.diem;
import controller.student;


public class diem_dao implements daointerface<diem>{
	public static diem_dao getInstance() {
		return new diem_dao();
	}


	@Override
	public int insert(diem t) {
		int kq = 0;
		try {
			//b1 ketnoi voi sql
			Connection connection = connection_jdbc.getConnection();
			//b2 tao statement
			String sql = "INSERT INTO diem (id, hoten, ctdlgt, trr2, lttt, ktmt, tthcm, tAnh) "+
					" VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement pStatement = connection.prepareStatement(sql);
			//b3 thuc thi statement;
			     pStatement.setString(1, t.getId());
			     pStatement.setString(2,t.getHoten());
			     pStatement.setDouble(3,t.getCtdlgt());
			     pStatement.setDouble(4,t.getTrr2());
			     pStatement.setDouble(5,t.getLttt());
			     pStatement.setDouble(6,t.getKtmt());
			     pStatement.setDouble(7,t.getTthcm());
			     pStatement.setDouble(8,t.gettAnh());
			     
//			     if(t.getId() != null && t.getHoten()!=null && t.getCtdlgt() && t.getTrr2() && t.getLttt() && t.getKtmt() && t.getTthcm() && t.gettAnh()){
//			    	 kq = pStatement.executeUpdate();
//			     }
			     kq = pStatement.executeUpdate();
				
				//b4: tra ve kq
				System.out.println("ban da thuc thi: "+sql);
				System.out.println("co "+kq+" dong bi thay doi");
				
				//b5: ngat connection
				connection_jdbc.closeconnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public int update(diem t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(diem t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<diem> selectALL() {
		ArrayList<diem> kq = new ArrayList<diem>();
		//b1 ket noi voi sql
		try {
			Connection connection=connection_jdbc.getConnection();
			//b2 tao doi tuong statement;
			String sql = "select *from diem";
			PreparedStatement pStatement = connection.prepareStatement(sql);
			
			//b3: thuc thi statement
			System.out.println(sql);
		    ResultSet resultSet = pStatement.executeQuery();
		    while (resultSet.next()){
		    	String id = resultSet.getString("id");
		    	String hoten = resultSet.getString("hoten");
		    	Double ctdlgt = resultSet.getDouble("ctdlgt");
		    	Double trr2 = resultSet.getDouble("trr2");
		    	Double lttt = resultSet.getDouble("lttt");
		    	Double ktmt = resultSet.getDouble("ktmt");
		    	Double tthcm = resultSet.getDouble("tthcm");
		    	Double tAnh = resultSet.getDouble("tAnh");
		    	diem diem = new diem(id, hoten, ctdlgt, trr2, lttt, ktmt, tthcm, tAnh);
		    	kq.add(diem);
		    }
		    
			//b5: ngat connection
			connection_jdbc.closeconnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return kq;
	}

	@Override
	public diem selectById(diem t) {
		diem kq=null;
		try {
			//b1 tao ket noi den sql
			Connection connection = connection_jdbc.getConnection();
			
			//b2 tao ra doi tuong statememt
			String sql = "select *from diem where id=?";
			PreparedStatement pStatement = connection.prepareStatement(sql);
			
			//b3: thuc thi cau lenh sql
			pStatement.setString(1, t.getId());
		    ResultSet resultSet = pStatement.executeQuery();//lay du lieu 
		    while(resultSet.next()) {
		    	String id = resultSet.getString("id");
		    	String hoten = resultSet.getString("hoten");
		    	Double ctdlgt = resultSet.getDouble("ctdlgt");
		    	Double trr2 = resultSet.getDouble("trr2");
		    	Double lttt = resultSet.getDouble("lttt");
		    	Double ktmt = resultSet.getDouble("ktmt");
		    	Double tthcm = resultSet.getDouble("tthcm");
		    	Double tAnh = resultSet.getDouble("tAnh");
		    	kq = new diem(id, hoten, ctdlgt, trr2, lttt, ktmt, tthcm, tAnh);
		    }
		    
			//b5: ngat connection
			connection_jdbc.closeconnection(connection);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public ArrayList<diem> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
