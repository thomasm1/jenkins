package servproject1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MasterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MasterServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		setAccessControlHeaders(response);
//		PrintWriter writer = response.getWriter();
//		writer.write("test response from myServlet");
		HttpSession sess = request.getSession();
		sess.setMaxInactiveInterval(3600); 
//		sess.setAttribute("m-owner", "{'username', 'tom'},{'ordernum','222'}"); 
		System.out.println("MasterServlet: " + sess.getAttribute("m-owner"));
		 
		RequestHelper.process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	// for Preflight
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		setAccessControlHeaders(resp);
		addCorsHeader(resp);
		resp.setStatus(HttpServletResponse.SC_OK);
	}
	private void addCorsHeader(HttpServletResponse resp) {
//	    log.trace("adding headers");
		resp.addHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		resp.addHeader("Vary", "Origin");
		// if I don't care about getting my cookie, this will work
		 resp.addHeader("Access-Control-Allow-Origin", "*");
		resp.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, PUT, DELETE, HEAD");
		resp.addHeader("Access-Control-Allow-Headers", "X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
		resp.addHeader("Access-Control-Allow-Credentials", "true");
		resp.addHeader("Access-Control-Max-Age", "1728000");
		resp.addHeader("Produces", "application/json");
	}
//	private void setAccessControlHeaders(HttpServletResponse resp) {
//		resp.setHeader("Access-Control-Allow-Origin", "http://localhost:8090");
//		resp.setHeader("Access-Control-Allow-Methods", "GET");
//	}

}
