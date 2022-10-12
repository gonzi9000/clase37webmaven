package com.proyecto.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FormController
 */
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		pw.write("<h1>Gracias por el contacto web</h1>");
		pw.write("Nombre: " + request.getParameter("name"));
		pw.write("Apellido: " + request.getParameter("surname"));
		pw.write("Email: " + request.getParameter("email"));
		String name = request.getParameter("name"); 
		System.out.println(name);
		String surname = request.getParameter("surname");
		System.out.println(surname);
		String email = request.getParameter("email");
		System.out.println(email);
		String lenguaje[] = request.getParameterValues("lenguaje");
		System.out.println(lenguaje);
		for (String x : lenguaje) {
			System.out.println(x);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
