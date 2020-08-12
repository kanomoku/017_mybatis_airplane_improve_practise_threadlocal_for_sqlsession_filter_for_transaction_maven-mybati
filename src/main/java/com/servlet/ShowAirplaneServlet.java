package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Airplane;
import com.service.AirplaneService;
import com.service.impl.AirplaneServiceImpl;

@WebServlet("/showairplane")
public class ShowAirplaneServlet extends HttpServlet {
	AirplaneService airplaneService = new AirplaneServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int takeid = 0;
		int landid = 0;
		String takeidStr = req.getParameter("takeid");
		String landidStr = req.getParameter("landid");
		if (takeidStr != null && !"".equals(takeidStr)) {
			takeid = Integer.parseInt(takeidStr);
		}
		if (landidStr != null && !"".equals(landidStr)) {
			landid = Integer.parseInt(landidStr);
		}

		List<Airplane> showAirplaneList = airplaneService.show(takeid, landid);
		req.setAttribute("showAirplaneList", showAirplaneList);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
