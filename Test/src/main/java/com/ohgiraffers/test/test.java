package com.ohgiraffers.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gameMenu/order")
public class test extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String gameMenu = req.getParameter("gameMenu");
        int amount = Integer.parseInt(req.getParameter("amount"));

        int orderPrice = 0;
        String order = "패키지 유료 게임";

        switch (gameMenu){
            case "디아블로" : orderPrice = 10000 * amount;
            break;
            case "스타크래프트" : orderPrice = 5000 * amount;
            break;
            case "로스트아크" : order = "부분 유료 온라인 게임";
            break;
        }

        req.setAttribute("gameMenu", gameMenu);
        req.setAttribute("amount",amount);
        req.setAttribute("orderPrice",orderPrice);
        req.setAttribute("order",order);

        RequestDispatcher rd= req.getRequestDispatcher("/jsp/Page.jsp");
        rd.forward(req,resp);
    }
}
