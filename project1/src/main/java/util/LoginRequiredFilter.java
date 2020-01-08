package util;

import java.io.IOException;

//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;

@WebFilter(urlPatterns = "*.do")
public class LoginRequiredFilter implements Filter {

	@Override
	public void destroy() {

	}
 
	@Override
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException { 
		HttpServletRequest request = (HttpServletRequest) servletRequest;  
//		HttpSession session = request.getSession(true); 
//		(ShoppingCart)session.getValue("shoppingCart");
//		if (cart == null) { // No cart already in session
//		cart = new ShoppingCart();
//		session.putValue("shoppingCart", cart);
//		}
//		doSomethingWith(cart); 
		 
		String sess = request.getRequestedSessionId();  
		System.out.println("username validated: " +sess);

		if (true) {
			System.out.println("sessId filtered: "+sess);   
			chain.doFilter(servletRequest, servletResponse);
		} else {
//			System.out.println("didn't pass filter");
////			request.getRequestDispatcher("/project1/login.html").forward(servletRequest,
////					servletResponse);
		}
	}
 

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
