package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import BoundaryValue.Value;
import Model.CommissioningProblem;
import Model.TriangleClassify;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import BoundaryValue.Value;
import Model.CommissioningProblem;
import Model.TriangleClassify;

@WebServlet("/triangleServlet")
public class triangleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String type = req.getParameter("type");
			int min = 10;
			int max = 220;

			
			List<TriangleClassify> listTr = new ArrayList<>();

			Value numbers = new Value();
			numbers.setNumbers(max, min);
			if (type.equals("5")) {
				int[] list = numbers.getbvaValue();
				int a, b, c;
				int normal = (list[list.length - 1]) / 2;
				for (int i = 0; i < 5; i++) {
					a = normal;
					b = normal;
					c = list[i];

					TriangleClassify tria = new TriangleClassify();
					tria.setSide(a, b, c);
					tria.classify(min, max);
					listTr.add(tria);
				}

				for (int i = 0; i < 5; i++) {
					a = normal;
					b = list[i];
					c = normal;

					TriangleClassify tria = new TriangleClassify();
					tria.setSide(a, b, c);
					tria.classify(min, max);
					if (b != normal) {
						listTr.add(tria);
					}
				}

				for (int i = 0; i < 5; i++) {
					a = list[i];
					b = normal;
					c = normal;

					TriangleClassify tria = new TriangleClassify();
					tria.setSide(a, b, c);
					tria.classify(min, max);
					if (a != normal) {
						listTr.add(tria);
					}
				}
			} else {
				int[] list = numbers.getrbvaValue();
				int normal = list[list.length - 1] / 2;
				int a, b, c;
				for (int i = 0; i < 7; i++) {
					a = normal;
					b = normal;
					c = list[i];

					TriangleClassify tria = new TriangleClassify();
					tria.setSide(a, b, c);
					tria.classify(min, max);
					listTr.add(tria);
				}

				for (int i = 0; i < 7; i++) {
					a = normal;
					b = list[i];
					c = normal;

					TriangleClassify tria = new TriangleClassify();
					tria.setSide(a, b, c);
					tria.classify(min, max);
					if (b != normal) {
						listTr.add(tria);
					}
				}

				for (int i = 0; i < 7; i++) {
					a = list[i];
					b = normal;
					c = normal;

					TriangleClassify tria = new TriangleClassify();
					tria.setSide(a, b, c);
					tria.classify(min, max);
					if (a != normal) {
						listTr.add(tria);
					}
				}
			}
			req.getSession().setAttribute("list", listTr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("tableTriangle.jsp");
		requestDispatcher.forward(req, resp);
	}

}
