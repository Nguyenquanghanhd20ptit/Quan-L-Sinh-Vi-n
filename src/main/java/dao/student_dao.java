package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import org.apache.catalina.connector.Response;

import connection_javasql.connection_jdbc;
import controller.student;


public class student_dao implements daointerface<student>{
	public static student_dao getInstance() {
		return new student_dao();
	}


	@Override
	public int insert(student t) {
		int kq = 0;
		try {
			//b1 ketnoi voi sql
			Connection connection = connection_jdbc.getConnection();
			//b2 tao statement
			String sql = "INSERT INTO insertstudent ( id,hoten,nganhhoc,ngaysinh,gioitinh,diachi,sdt) "+
					" VALUES (?,?,?,?,?,?,?)";
			PreparedStatement pStatement = connection.prepareStatement(sql);
			//b3 thuc thi statement;
			    pStatement.setString(1, t.getId());
			    pStatement.setString(2,t.getHoten());
			     pStatement.setString(3, t.getNganhhoc());
			     pStatement.setString(4,t.getNgaysinh());
			     pStatement.setString(5, t.getGioitinh());
			     pStatement.setString(6, t.getDiachi());
			     pStatement.setString(7, t.getSdt());
			     
			     
			     if(t.getId() != null && t.getHoten()!=null && t.getNganhhoc()!=null && t.getNgaysinh()!= null && t.getGioitinh()!=null && t.getDiachi()!=null && t.getSdt()!=null) {
			    	 kq = pStatement.executeUpdate();
			     }
			 
				
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
	public int update(student t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(student t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<student> selectALL() {
		ArrayList<student> kq = new ArrayList<student>();
		//b1 ket noi voi sql
		try {
			Connection connection=connection_jdbc.getConnection();
			//b2 tao doi tuong statement;
			String sql = "select *from insertstudent";
			PreparedStatement pStatement = connection.prepareStatement(sql);
			
			//b3: thuc thi statement
			System.out.println(sql);
		    ResultSet resultSet = pStatement.executeQuery();
		    while (resultSet.next()){
		    	String id = resultSet.getString("id");
		    	String hoten = resultSet.getString("hoten");
		    	String nganhhoc = resultSet.getString("nganhhoc");
		    	String ngaysinh = resultSet.getString("ngaysinh");
		    	String gioitinh = resultSet.getString("gioitinh");
		    	String diachi = resultSet.getString("diachi");
		    	String sdt = resultSet.getString("sdt");
		    	student student = new student(id, hoten, nganhhoc, ngaysinh, gioitinh,diachi, sdt);
		    	kq.add(student);
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
	public student selectById(student t) {
		student kq=null;
		try {
			//b1 tao ket noi den sql
			Connection connection = connection_jdbc.getConnection();
			
			//b2 tao ra doi tuong statememt
			String sql = "select *from insertstudent where id=? and hoten=? ";
			PreparedStatement pStatement = connection.prepareStatement(sql);
			
			//b3: thuc thi cau lenh sql
			pStatement.setString(1, t.getId());
			pStatement.setString(2, t.getHoten());
		    ResultSet resultSet = pStatement.executeQuery();//lay du lieu 
		    while(resultSet.next()) {
		    	String id = resultSet.getString("id");
		    	String  hoten = resultSet.getString("hoten");
		    	String nganhhoc = resultSet.getString("nganhhoc");
		    	String ngaysinh = resultSet.getString("ngaysinh");
		    	String gioitinh = resultSet.getString("gioitinh");
		    	String diachi = resultSet.getString("diachi");
		    	String sdt = resultSet.getString("sdt");
		    	kq = new student(id, hoten, nganhhoc, ngaysinh, gioitinh, diachi, sdt);
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
	public ArrayList<student> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
