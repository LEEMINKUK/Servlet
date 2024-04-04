
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center;background-color: aliceblue; height: 1200px;">
    <h1 style="color: #890240 ">게임 구매 선택</h1>
    <form action="/gameMenu/order" method="post">
        <div>
        <select style="height: 50px;width: 100px;border-radius: 20px;font-size: 20px" name="gameMenu" id="menu">
            <option style="color: white;background-color: red;font-size: 20px" value="디아블로">디아</option>
            <option style="color: white;background-color: black;font-size: 20px" value="스타크래프트">스타</option>
            <option style="color: white;background-color: blueviolet;font-size: 20px" value="로스트아크">로아</option>
        </select>
        <input style="height: 50px;width: 200px; font-size: 20px;border-radius: 20px" placeholder="수 량" type="number" min="0" step="1" name="amount"> 개
        </div>
        <button style="margin-top: 100px;height: 50px;width: 200px;background-color: black;color: white;font-size: 20px;border-radius: 20px" type="submit">선택 완료</button>
    </form>
</div>
</body>
</html>
