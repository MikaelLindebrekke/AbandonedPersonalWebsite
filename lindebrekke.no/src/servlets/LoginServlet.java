package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import userHandler.User;
import userHandler.UserDAO;
import utils.PwdUtil;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	UserDAO UDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String errorMessage = "";
		
		if (request.getParameter("invalidUsername") != null) {
			errorMessage = "Invalid Username!";
		}
		if (request.getParameter("invalidPassword") != null) {
			errorMessage = "Invalid Password!";
		}
		
		request.setAttribute("errorMessage", errorMessage);
		
		request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PwdUtil pu = new PwdUtil();
		
		User currentUser = UDAO.findUser(username);
		
		//Validate username and password in this section
		
		if (currentUser == null) {
			response.sendRedirect("login" + "?invalidUsername");
		} else {
			if (!pu.validatePassword(password, currentUser.getPassword().getPwd_salt(), currentUser.getPassword().getPwd_hash())) {
				response.sendRedirect("login" + "?invalidPassword");
			} else {
				HttpSession session = request.getSession(false);
				if (session != null) {
					session.invalidate();
				}
				session = request.getSession(true);
				session.setMaxInactiveInterval(120);
				
				response.sendRedirect("main");
			}
		}
	}
}
