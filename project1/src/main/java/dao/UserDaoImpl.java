package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

//import db.DB;
import dao.UserDao;
import models.User;
import util.JDBCConnection;

//can't make static, so use the service layer 
public class UserDaoImpl implements UserDao {
	public static Connection conn = JDBCConnection.getConnection();

	@Override
	public boolean addUser(User u) {
//		DB.users.put(u.getUserId(), u);
//		return true;
		System.out.println("Submitting to UserDaoImpl: "+u);
		String sql = "CALL add_new_requser(?,?,?,?,?)";
		try {
			CallableStatement cs = conn.prepareCall(sql);
//			cs.setString(1, Integer.toString(u.getUserId()));
			cs.setString(1, Integer.toString(u.getDeptId()));
			cs.setString(2, Integer.toString(u.getSuperId()));
			cs.setString(3, u.getUserName());
			cs.setString(4, u.getPassword());
			cs.setString(5, u.getEmail());

			System.out.println(u.getEmail());

			cs.execute();
			return true;

		} catch (SQLException e) {
			System.out.println("Double Check add_new_user DB SQL");
			System.out.println(e);
		}
		return false;
	}

	@Override
	public User getUser(int userid) {
//		return DB.users.get(id);
		try {
			String sql = "SELECT * FROM requsertable WHERE userid = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(userid));
			ResultSet rs = ps.executeQuery();

			while (rs.next())
			{
				return new User(rs.getInt("userid"),
						rs.getInt("deptid"), 
						rs.getInt("superid"), 
				rs.getString("username"),  
				rs.getString("password"),  
				rs.getString("email"));
			}
	}		catch (Exception e) {
		System.out.println("SQL issue with getting USER: \n"+e);
	}
			return null;
		}; 
		

	@Override
	public User getUser(String username) {
//		return DB.users.get(username);
		try {
			String sql = "SELECT * FROM requsertable WHERE username = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();

			while (rs.next())
			{
				return new User(rs.getInt("userid"),
						rs.getInt("deptid"), 
						rs.getInt("superid"), 
				rs.getString("username"),  
				rs.getString("password"),  
				rs.getString("email"));
			}

			System.out.println("returning (username)");
		
	}		catch (Exception e) {
		System.out.println("SQL issue with getting USER: \n"+e);
	}
			return null;
	};
 
	@Override
	public List<User> listUser() {
//		List<User> userList = new ArrayList<User>();
//		Set<Integer> keys = DB.users.keySet();
//		for (Integer k : keys)
//			userList.add(DB.users.get(k));
//		return userList;
		String sql = "SELECT * FROM requsertable";
		List<User> userArr = new ArrayList<User>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			// preparedStatements are safe from SQL injection & sanitize inputs
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				userArr.add(new User(rs.getInt("userid"),
					rs.getInt("deptid"), 
					rs.getInt("superid"), 
					rs.getString("username"),  
					rs.getString("password"),  
					rs.getString("email")));
			}
			System.out.println("SQL is All Good!");
			
		} catch (SQLException e) {
			System.out.println("SQL issue with getting All USER:\n "+e);
		}
		return userArr;
	}

	@Override
	public boolean updateUser(User u) {
//		DB.users.replace(change.getUserId(), change);
//		return true;
		String sql = "UPDATE usertable SET password=?, fullname=?, iscust=?, isowner=? WHERE username = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql); 
//	cs.setString(1, Integer.toString(u.getUserId()));
			ps.setString(1, Integer.toString(u.getDeptId()));
			ps.setString(2, Integer.toString(u.getSuperId()));
			ps.setString(3, u.getUserName());
			ps.setString(4, u.getPassword());
			ps.setString(5, u.getEmail());

			ps.executeQuery();
		
			return true;
		} catch (SQLException e) {
			System.out.println("SQL issue with updating USER:\n "+e);
		}
		return false;
	}

	@Override
	public boolean deleteUser(String username) {
//		DB.users.remove(username);
		String sql = "DELETE usertable WHERE username = ?";
		
	try {
		PreparedStatement ps = conn.prepareStatement(sql); 
		ps.setString(1, username);
		
//		int var = 1;
//		System.out.println(var);
//		System.out.println("never delete ... ");
		
		return true;
	} catch (Exception e) {
 System.out.println("doublecheck deletions: \n"+e);
	}
	return false;
	}

}
