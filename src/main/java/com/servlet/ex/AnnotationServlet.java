package com.servlet.ex;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/demo")
public class AnnotationServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) {
		try {
			PrintWriter pw = res.getWriter();
			pw.println("welcome to ...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}