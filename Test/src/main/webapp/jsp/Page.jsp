
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String gameMenu = (String) request.getAttribute("gameMenu");
        int amount = (Integer) request.getAttribute("amount");
        int orderPrice = (Integer) request.getAttribute("orderPrice");
        String order = (String) request.getAttribute("order");
    %>
    <div style="font-size: 30px;height: 800px;width: 600px;text-align: center;margin: 0 auto;border: black solid 1px">
        <h1 style="font-family: 궁서체">영 수 증</h1>
        <hr>
        <h3>주문하신 게임 : <%= gameMenu %></h3>
        <h3>주문하신 수량 : <%= amount %></h3>
        <h3>결제하실 금액 : <%= orderPrice %></h3>
        <h3>유료 여부 : <%= order %></h3>
        <br>
        <h1>||||||||||</h1>
        <h5 style="margin-top: -40px">28325720</h5>
    </div>
</body>
</html>
