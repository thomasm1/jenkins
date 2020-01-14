package daoTests;

//import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import models.User;
import services.UserService;

//int userId, int deptId, int superId, String userName, String password, String email) {
//	User templateUserSup1 = new User(1, 1, 4, "super1", "password", "myEmail1");

public class UserDAOTesting {
	@Test
	public void add_User() {

		User u = new User(99, 404, 4, "super1", "password", "myEmail1");
		assertTrue(UserService.addUser(u));
		assertTrue(UserService.deleteUser(UserService.getUser("super1").getUserName()));
	}
}
