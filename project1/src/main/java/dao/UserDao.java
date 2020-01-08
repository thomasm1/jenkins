package dao;

import java.util.List;

import models.User;

public interface UserDao {
	public boolean addUser(User u); 
	public User getUser(int id); 
	public User getUser(String username); 
	public List<User> listUser(); 
	public boolean updateUser(User change);
	public boolean deleteUser(String username);
	 
}
