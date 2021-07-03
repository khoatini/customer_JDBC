package cybersoft.java12.jsp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java12.jsp.dbconnection.MysqlConnection;

@WebServlet(name = "healthCheckServlet", urlPatterns = "/health")
public class healthCheckServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection testConnection = MysqlConnection.getConnection();
		if (testConnection != null) {
			resp.getWriter().append("Data connection has been created success");
		} else {
			resp.getWriter().append("Data connection has been created fail");
		}
	}
}
