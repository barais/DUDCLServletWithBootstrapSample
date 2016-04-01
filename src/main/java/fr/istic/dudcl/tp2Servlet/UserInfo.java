package fr.istic.dudcl.tp2Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Person;

@WebServlet(name = "userinfo", urlPatterns = { "/addPerson" })
public class UserInfo extends HttpServlet {

	MyService serv = null;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		serv =  MyService.getInstance();
	}


	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		
		String name = request.getParameter("name");
		String firstname = request.getParameter("firstname");

		Person person = new Person(name, firstname, null, null, null);
		serv.addPerson(person);
		PrintWriter p = new PrintWriter(response.getOutputStream());
		p.print("Nombre de Person : " + serv.getAllPersons().size());
		p.flush();
	}
}
