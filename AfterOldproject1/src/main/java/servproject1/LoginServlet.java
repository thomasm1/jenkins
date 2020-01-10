package servproject1;

import java.io.IOException;

//import javax.servlet.ServletConfig;
//import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// HOW to get the Servlet Config
		response.getWriter().append("\n\n\n Welcome to Login. You are accessing .do File"); // ("Served at: ").append(request.getContextPath());
		System.out.println("Config not in this servlet");
		  
		// Can access a property like this:
//		ServletConfig scon = this.getServletConfig();
//		String configstring = scon.getInitParameter("Pokemon");
//		System.out.println(configstring);
//
//		ServletContext scontext = this.getServletContext();
//		String scontextstring = scontext.getInitParameter("Sports");
//		System.out.println(scontextstring);

		RequestLoginHelper.process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
