package Servlets;

import java.io.IOException;
import java.util.ArrayList;
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

@WebServlet("/commissionServlet")
public class commissionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int minLock = 1;
			int maxLock = 60;
			Value lock = new Value();
			lock.setNumbers(maxLock, minLock);

			int minStock = 1;
			int maxStock = 70;
			Value stock = new Value();
			stock.setNumbers(maxStock, minStock);

			int minBarrel = 1;
			int maxBarrel = 80;
			Value barrel = new Value();
			barrel.setNumbers(maxBarrel, minBarrel);

			String type = req.getParameter("type");
			List<CommissioningProblem> list = new ArrayList<>();

			if (type.equals("5")) {
				int[] locks = lock.getbvaValue();
				int[] stocks = stock.getbvaValue();
				int[] barrels = barrel.getbvaValue();

				int l, s, b;
				for (int i = 0; i < 5; i++) {
					l = locks[2];
					s = stocks[2];
					b = barrels[i];

					CommissioningProblem commiss = new CommissioningProblem();
					commiss.setInput(l, s, b);
					double sale = commiss.calSale();
					commiss.calCommission(sale);
					list.add(commiss);
				}

				for (int i = 0; i < 5; i++) {
					l = locks[2];
					s = stocks[i];
					b = barrels[2];

					CommissioningProblem commiss = new CommissioningProblem();
					commiss.setInput(l, s, b);
					double sale = commiss.calSale();
					commiss.calCommission(sale);
					if (s != stocks[2]) {
						list.add(commiss);
					}
				}

				for (int i = 0; i < 5; i++) {
					l = locks[i];
					s = stocks[2];
					b = barrels[2];

					CommissioningProblem commiss = new CommissioningProblem();
					commiss.setInput(l, s, b);
					double sale = commiss.calSale();
					commiss.calCommission(sale);
					if (l != locks[2]) {
						list.add(commiss);
					}
				}
			} else {
				int[] locks = lock.getrbvaValue();
				int[] stocks = stock.getrbvaValue();
				int[] barrels = barrel.getrbvaValue();

				int l, s, b;

				for (int i = 0; i < 7; i++) {
					l = locks[3];
					s = stocks[3];
					b = barrels[i];

					CommissioningProblem commiss = new CommissioningProblem();
					commiss.setInput(l, s, b);
					double sale = commiss.calSale();
					commiss.calCommission(sale);
					list.add(commiss);
				}

				for (int i = 0; i < 7; i++) {
					l = locks[3];
					s = stocks[i];
					b = barrels[3];

					CommissioningProblem commiss = new CommissioningProblem();
					commiss.setInput(l, s, b);
					double sale = commiss.calSale();
					commiss.calCommission(sale);
					if (s != stocks[3]) {
						list.add(commiss);
					}
				}

				for (int i = 0; i < 7; i++) {
					l = locks[i];
					s = stocks[3];
					b = barrels[3];

					CommissioningProblem commiss = new CommissioningProblem();
					commiss.setInput(l, s, b);
					double sale = commiss.calSale();
					commiss.calCommission(sale);
					if (l != locks[3]) {
						list.add(commiss);
					}
				}
			}
			req.getSession().setAttribute("list", list);
		} catch (Exception e) {
		}
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("tableCommission.jsp");
		requestDispatcher.forward(req, resp);
	}

}
