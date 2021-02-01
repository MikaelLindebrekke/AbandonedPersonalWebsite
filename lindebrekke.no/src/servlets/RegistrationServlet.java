package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import userHandler.Password;
import userHandler.User;
import userHandler.UserDAO;
import utils.Validator;

/**
 * A servlet that handles registration of a new user. 
 * 
 * @author Mikael Lindebrekke
 */
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserDAO userDAO;
	private Validator validate;
	private boolean complete;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("WEB-INF/jsp/registration.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		validate = new Validator();
		complete = false;
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("newUsername");
		String password = request.getParameter("newPassword");
		String passwordRepeated = request.getParameter("passwordRepeated");
		
		//Checking all the user input. If all the input checks out, complete will be set to true. 
		//Also have to store any input that is correct so the user don't have to add it again.
		if (validate.name(firstname)) {
			request.setAttribute("keepFN", firstname);
			complete = true;
		} else {
			request.setAttribute("errorFN", "Invalid firstname");
			complete = false;
		}
		
		if (validate.name(lastname)) {
			request.setAttribute("keepLN", lastname);
			complete = true;
		} else {
			request.setAttribute("errorLN", "Invalid lastname");
			complete = false;
		}
		
		if (validate.name(username)) {
			request.setAttribute("keepUN", username);
			complete = true;
		} else {
			request.setAttribute("errorUN", "Invalid username");
			complete = false;
		}
		
		Password pwd = new Password();
		if (validate.password(password)) {
			pwd = Password.makePassword(password);
			request.setAttribute("keepPWD", password);
			complete = true;
		} else {
			request.setAttribute("errorPWD", "Invalid password");
		}
		
		if (validate.matchPassword(password, passwordRepeated)) {
			request.setAttribute("keepPWDRep", passwordRepeated);
			complete = true;
		} else {
			request.setAttribute("errorPWDRep", "Passwords don't match");
			complete = false;
		}
		
		if (complete) {
			
			HttpSession sesjon = request.getSession(false);
            if (sesjon != null) {
                sesjon.invalidate();
            }
            sesjon = request.getSession(true);
            sesjon.setMaxInactiveInterval(120);
            
            userDAO.create(new User (username, pwd, firstname, lastname));
           
            response.sendRedirect("main");
		} else { 
			request.getRequestDispatcher("WEB-INF/jsp/registration.jsp").forward(request, response);
		}
	}
}
