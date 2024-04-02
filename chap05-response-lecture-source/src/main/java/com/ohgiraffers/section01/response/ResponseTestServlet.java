package com.ohgiraffers.section01.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 서블릿이 하는 역할은 크게 3가지이다.
        * 1. 요청 받기 - HTTP method GET/POST 요청에 따라 parameter 로 전달받은 데이터를 꺼내올 수 있다.
        * 2. 비지니스 로직 처리 - DB 접속과 CRUD 에 대한 로직 처리 -> 서비스를 호출하는 쪽으로 해결(MVC)한다.
        * 3. 응답하기 - 문자열로 동적인 웹(HTML 태그) 페이지를 만들고 스트림을 이용해 내보낸다.
        * */

        /* 사용자 브라우저에 응답하기 위해서는 HttpServletResponse 의 getWriter() method 로
         PrintWriter 인스턴스를 반환 받는다.
         PrintWriter 는 BufferedWriter 와 형제격인 클래스이지만 더 많은 형태의 생성자를 제공하고 있는
         범용성으로 인해 더 많이 사용된다.
         */

        PrintWriter out = resp.getWriter();

        StringBuilder responseBuilder = new StringBuilder();
        responseBuilder.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>안녕 servlet response</h1>\n")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html");

        out.print(responseBuilder.toString());

        out.flush();

        out.close();
    }
}
