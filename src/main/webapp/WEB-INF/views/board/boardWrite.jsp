<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">

input {

display: block;
margin-bottom: 10px;
padding: 10px 0;
}

</style>
</head>
<body>
<h1>Board Write</h1>

<form action="./noticeWrite" method="post">
<input type="text" name="num" placeholder="num">
<input type="text" name="title" placeholder="title">
<textarea rows="" cols="" name="contents"></textarea>
<input type="text" name="writer" placeholder="writer">
<button type="submit">click</button>
</form>

</body>
</html>