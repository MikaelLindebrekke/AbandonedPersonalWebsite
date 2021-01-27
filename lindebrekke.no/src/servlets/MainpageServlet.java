package servlets;


import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import userHandler.User;
import userHandler.UserDAO;


@WebServlet("/main")
public class MainpageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	UserDAO UDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<User> allUsers = UDAO.getAllUsers();
		
		request.setAttribute("allUsers", allUsers);
		
		request.getRequestDispatcher("WEB-INF/jsp/mainpage.jsp").forward(request, response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
