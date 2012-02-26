package ru.shangin.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.shangin.beans.Hello;


public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final String CONTENT_TYPE="text/html; charset=UTF-8";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Hello hw = (Hello) ctx.getBean("hello");
		resp.setContentType(CONTENT_TYPE);
		req.setCharacterEncoding("UTF8");
		PrintWriter out = resp.getWriter();
		StringBuffer sb = new StringBuffer();
		sb.append("<html><head></head><body><hr/>" + hw.printHello() + "<hr/></body></html>");
		out.println(sb);
		out.close();
	}
	
}
