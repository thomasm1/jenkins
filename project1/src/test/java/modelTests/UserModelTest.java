package modelTests;

import org.junit.Test;

import models.User;

import static org.junit.Assert.*;
import org.junit.Before;

public class UserModelTest {
 
	@Before
	public void setup() {
		User newUser = new User(99, 404, 4, "super1", "password", "myEmail1");
		System.out.println(newUser);
	}

	@Test
	public void getUserId() {										  // PASSES
		User newUser = new User(99, 404, 4, "super1", "password", "myEmail1");
		assertEquals(1010, newUser.getUserId());
	}

	@Test
	public void setUserId() {										  // PASSES
		User newUser = new User(99, 404, 4, "super1", "password", "myEmail1");
		newUser.setUserId(1010);
		assertEquals(1010, newUser.getUserId());
	}

	@Test
	public void getSuperId() {										  // PASSES
		User newUser = new User(99, 404, 4, "super1", "password", "myEmail1");
		assertEquals("Jeep", newUser.getSuperId());
		System.out.println("User Make: " + newUser.getSuperId());
	}

	@Test
	public void setSuperId() {										  // PASSES
		User newUser = new User(99, 404, 4, "super1", "password", "myEmail1");
		newUser.setSuperId(44);
		assertEquals(44, newUser.getSuperId());
		 }

	@Test
	public void getDeptId() {										  // PASSES
		User newUser = new User(99, 404, 4, "super1", "password", "myEmail1");
		int deptId = newUser.getDeptId();
		System.out.println("User deptId: " + deptId);
	}

	@Test
	public void setDeptId() {										  // PASSES
		User newUser = new User(99, 404, 4, "super1", "password", "myEmail1");
		newUser.setDeptId(404);
		assertEquals(404, newUser.getDeptId()); 
	}

	@Test
	public void getUserName() {										  // PASSES
		User newUser = new User(99, 404, 4, "super1", "password", "myEmail1");
		String un = newUser.getUserName();
		System.out.println("User newUser: " + un);
	}

	@Test
	public void setUserName() {										  // PASSES
		User newUser = new User(99, 404, 4, "super1", "password", "myEmail1");
		newUser.setUserName("newname");
		assertEquals("newname", newUser.getUserName()); 
	}


}
