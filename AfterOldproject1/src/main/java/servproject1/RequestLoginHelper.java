package servproject1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import javax.servlet.http.HttpSession;

public class RequestLoginHelper {

	public static void process(HttpServletRequest request, HttpServletResponse response) {
		// This method will delegate other methods
		// on a different layer of our application
		// to process the request.

//		HttpSession sess = request.getSession();
//		System.out.println("Session ID: " + sess.getId());
//	
//		sess.setMaxInactiveInterval(3600); 
//		System.out.println("RequestHelperLogin Login: " + sess.getAttribute("user"));
// 

	}
}
