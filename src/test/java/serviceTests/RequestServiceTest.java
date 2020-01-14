package serviceTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import models.Request;
import services.RequestService;

public class RequestServiceTest { // *NOTE: change PK usernames before sending to DB

	@org.junit.BeforeClass // setup
	public static void setupClass() {
		System.out.println("Class/Static setup ");
	}

	@org.junit.Before
	public void setup() {
		System.out.println("Method/Instance setup ");
	}

//	@org.junit.Test
//	public void add_new_req() {
//		Request r = new Request(1, 1, "Oracle", "certification", "Java Oracle Pro-1", "Java proficiency", "1-21-20",
//				"Pitt", "numeric", "80%", 349.99, 1); // , "superText", "dheadText", "bencoText", "reqText");
//		assertTrue(RequestService.addReq(r));
////		RequestService.deleteRequest(RequestService.getReq(1).getReqName());
//	}

	@org.junit.Test
	public void get_user() {
		Request r = new Request(111, 1, "Oracle", "certification", "Java Oracle Pro-1", "Java proficiency", "1-21-20",
				"Pitt", "numeric", "80%", 349.99, 1, "superText", "dheadText", "bencoText", "reqText");
		RequestService.addReq(r); // leave ou
		assertEquals("password", r.getReqName());
//		RequestService.deleteReq(RequestService.getReq(1));
	}

	@org.junit.Test
	public void update_user() {
		Request r = new Request(111, 1, "Oracle", "certification", "Java Oracle Pro-1", "Java proficiency", "1-21-20",
				"Pitt", "numeric", "80%", 349.99, 1 , "superText", "dheadText", "bencoText", "reqText");
		RequestService.addReq(r); // leave ou
		Request uUpdated = new Request(1, 1, "Oracle", "certification", "Java Oracle Pro-1", "Java proficiency", "1-21-20",
				"Pitt", "numeric", "80%", 349.99, 1, "superText", "dheadText", "bencoText", "reqText");
//		assertTrue(RequestService.updateRequest(uUpdated));
//		RequestService.deleteRequest(RequestService.getReq(1).getReqName());
	}

	@org.junit.Test
	public void delete_user() { // PASSES
		Request r = new Request(111, 1, "Oracle", "certification", "Java Oracle Pro-1", "Java proficiency", "1-21-20",
				"Pitt", "numeric", "80%", 349.99, 1, "superText", "dheadText", "bencoText", "reqText");
		RequestService.addReq(r);
//		assertTrue(RequestService.deleteRequest(r.getReq(1)));

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