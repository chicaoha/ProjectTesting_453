package Servlets;

import java.io.IOException;

import BoundaryValue.Value;
import Model.CommissioningProblem;
import Model.TriangleClassify;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/functionServlet")
public class functionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String function = req.getParameter("function");
			String type = req.getParameter("type");
			String page = "";
			if (function.equals("triangle")) {
				req.getSession().setAttribute("type", type);
				resp.sendRedirect("triangleServlet?type=" + type);
			} else {
				req.getSession().setAttribute("type", type);
				resp.sendRedirect("commissionServlet?type=" + type);
			}
			req.getSession().setAttribute("type", type);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher(page);
			requestDispatcher.forward(req, resp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
