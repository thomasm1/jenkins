package db;

import java.util.HashMap;
import java.util.Map;

import models.Task;

import models.Dept;
import models.User;
import models.Request;

public class  DB { 
	public static Map<Integer, Task> tasks = new HashMap<Integer, Task>();  
	public static Map<Integer, Dept> depts = new HashMap<Integer, Dept>();
	public static Map<Integer, User> users = new HashMap<Integer, User>();
	public static Map<Integer, Request> requests = new HashMap<Integer, Request>();
	 
	static {
		////////////////////// Task 
		Task d1 = new Task(1, 1, 1,"1-20-20", "URL" , "newRules", "newConf", "numeric", "70%", 300.99, 1);
		Task d2 = new Task(2, 2, 1,"2-20-20", "form data" , "newRules", "newConf", "numeric", "80%", 250.00, 1); 
		Task d3 = new Task(3, 3, 4,"12-21-19", "  data" , "newRules", "newConf", "numeric", "90%", 450.00, 1); 
		Task d4 = new Task(4, 4, 3,"12-6-19", "PDF upload data" , "newRules", "newConf", "numeric", "80%", 450.00, 1);
		Task d5 = new Task(5, 5, 3,"12-9-19", "form data" , "newRules", "newConf", "numeric", "80%", 750.00, 1);  
		
//		private int taskId;
//		private int reqId;
//		private int currUserId;
//		private String timeStamp;
//		private String currDocs;
//		private String updateReason;
//	
//		private String updateReqType;
//		private String updateGradeType;
//		private String updateGradePass;
//		private double updateAmt;
//		private int updateStage;
		
		System.out.println(d1);
		tasks.put(1, d1);
		tasks.put(2, d2); 
		tasks.put(3, d3);  
		tasks.put(4, d4);  
		tasks.put(5, d5); 

		/////////////////////// Dept
		Dept templateDept1 = new Dept(1, 24, "Business Dept.");
		Dept templateDept2 = new Dept(2, 12, "Arts & Science Dept.");
		Dept templateBenco = new Dept(3, 52, "Benefits Coordination");

		System.out.println(templateDept1);
		depts.put(1, templateDept1);
		depts.put(2, templateDept2);
		depts.put(3, templateBenco);
		 
		/////////////////////// User
//		int userId, int deptId, int superId, String userName, String password, String email) {
		User templateUserSup1 = new User(1, 1, 4, "super1", "password", "myEmail1");
		User templateUserReq1 = new User(2, 2, 1, "u", "p", "myEmail2");
		User templateUserSup2 = new User(3, 3, 2, "super2", "password", "myEmail3");
		User templateUserReq2 = new User(4, 2, 3, "user2", "password", "myEmail4");
		User templateUserReq3 = new User(5, 1, 3, "user3", "password", "myEmail5");

		System.out.println(templateUserSup1);
		users.put(1, templateUserSup1);
		users.put(2, templateUserReq1); 
		users.put(3, templateUserSup2);
		users.put(4, templateUserReq2);
		users.put(5, templateUserReq3);

		////////////////////// Request 
//int reqId, int userId, String reqName, String reqType, String reqDesc, String reqJustify,
//		String reqDatetime, String reqPlace, String gradeType, String gradePass, double reqAmt, int reqStage) {

//		Request empRequest1 = new Request(1, 1, "Oracle", "certification", "Java Oracle Pro-1", "Java proficiency", "1-21-20", "Pitt", "numeric", "80%", 349.99, 1);
//		Request empRequest2 = new Request(2, 2, "AWS", "certification", "Assoc Dev", "cloud", "3-20-20", "Morgantown", "numeric", "720", 150.00, 1);
//		Request empRequest3 = new Request(3, 3, "MongoWorld", "conference", "Industry News", "no-sql", "2-20-20", "Dallas", "presentation", "present", 750.00, 1);
//		 
//		System.out.println(empRequest1);
//		requests.put(1, empRequest1); 
//		requests.put(2, empRequest2); 
//		requests.put(3, empRequest3); 
		Request empRequest1 = new Request(1, 1, "Oracle", "certification", "Java Oracle Pro-1", "Java proficiency", "1-21-20", "Pitt", "numeric", "80%", 349.99, 1, "superText", "dheadText", "bencoText", "reqText");
		Request empRequest2 = new Request(2, 2, "AWS", "certification", "Assoc Dev", "cloud", "3-20-20", "Morgantown", "numeric", "720", 150.00, 1, "superText", "dheadText", "bencoText", "reqText");
		Request empRequest3 = new Request(3, 3, "MongoWorld", "conference", "Industry News", "no-sql", "2-20-20", "Dallas", "presentation", "present", 750.00, 1, "superText", "dheadText", "bencoText", "reqText");
		 
		System.out.println(empRequest1);
		requests.put(1, empRequest1); 
		requests.put(2, empRequest2); 
		requests.put(3, empRequest3); 
		
		// static block is code that executes the very
		// first time a class is loaded. Therefore this
		// will be pre-populated cars for testing purposes.

		
		
		
	}
}
