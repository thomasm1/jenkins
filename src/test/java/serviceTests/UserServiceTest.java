package serviceTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import models.User;
import services.UserService;

public class UserServiceTest { // *NOTE: change PK usernames before sending to DB

	@org.junit.BeforeClass // setup
	public static void setupClass() {
		System.out.println("Class/Static setup ");
	}

	@org.junit.Before
	public void setup() {
		System.out.println("Method/Instance setup ");
	}

	@org.junit.Test
	public void add_new_user() {
		User u = new User(99, 404, 4, "super1", "password", "myEmail1");
		assertTrue(UserService.addUser(u));
		UserService.deleteUser(UserService.getUser("super1").getUserName());
	}

	@org.junit.Test
	public void get_user() {
		User u = new User(99, 404, 4, "super1", "password", "myEmail1");
		UserService.addUser(u); // leave ou
		assertEquals("password", u.getPassword());
		UserService.deleteUser(UserService.getUser("super1").getUserName());
	}

	@org.junit.Test
	public void update_user() {
		User u = new User(99, 404, 4, "super1", "password", "myEmail1");
		UserService.addUser(u); // leave ou
		User uUpdated = new User(99, 477, 4, "super1", "password", "myEmail1");
		assertTrue(UserService.updateUser(uUpdated));
		UserService.deleteUser(UserService.getUser("super1").getUserName());
	}

	@org.junit.Test
	public void delete_user() { // PASSES
		User u = new User(99, 404, 4, "super1", "password", "myEmail1");
		UserService.addUser(u);
		assertTrue(UserService.deleteUser(u.getUserName()));

	}

	@org.junit.After
	public void tearDown() {
		System.out.println("After Class executing ...");
	} // teardown

	@org.junit.AfterClass
	public static void tearDownClass() {
		System.out.println("After Class executing ...");
	} // teardown

//////Teardown delete p1;
////		 delete p2;
////		 delete user from add_user test

}