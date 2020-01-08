package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import dao.UserDao;
import dao.UserDaoImpl; 
//import db.DB;
import models.User; 

public class UserService { 
	
	public static UserDao userdao = new UserDaoImpl();

	public static boolean addUser(User u) { 
//		 DB.users.put(u.getUserId(), u);
//		return null;
			System.out.println("Passing UserService class ...");
		 return userdao.addUser(u);
	}
	
	public static User getUser(int id) {
//		return DB.users.get(id);
		System.out.println("Passing UserService class ...");
		return userdao.getUser(id); 
		
	}  
	public static User getUser(String username) {
//		return DB.users.get(username);
		System.out.println("Passing UserService (uname) ...");
		return userdao.getUser(username);
		
	} 
	public static  List<User> listUser() {  
//		List<User> userList = new ArrayList<User>();
//		Set<Integer> keys = DB.users.keySet();
//		for(Integer k: keys)
//			userList.add(DB.users.get(k));
//		return userList;
		System.out.println("Passing UserService class ...");
		return userdao.listUser();
	}
	

}
