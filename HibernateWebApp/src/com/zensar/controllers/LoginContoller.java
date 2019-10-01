package com.zensar.controllers;

/**
 * @author Rohini Ahirrao
 * @version 2.0
 * @creation_date 21st sep 2019 5.30
 * @modification_date 28th sep 2019 11:53AM
 * @copyright Zensar Technologies.All rights reserved.
 * @description This is servlet to connect eith database.
 *             
 *
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.daos.UserDao;
import com.zensar.daos.UserDaoImpl;
import com.zensar.entities.User;
import com.zensar.exception.ServiceExceptions;
import com.zensar.services.UserService;
import com.zensar.services.UserServiceImpl;

/**
 * Servlet implementation class LoginContoller
 */
@WebServlet("/checkuser")
public class LoginContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl();
		((UserServiceImpl) userService).setUserDao(userDao);
		setUserService(userService);
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("passwd");
		User clientUser = new User();
		clientUser.setUsername(username);
		clientUser.setPassword(password);
		PrintWriter out = response.getWriter();
		try {
			if (userService.validateUser(clientUser)) {
				// out.println("<p>Dear " + username + "Welcome to online shopping </p> ");
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			} else {
				out.println("<p>sorry!! invalid username or password</p>");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.include(request, response);
			}
		} catch (ServiceExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
