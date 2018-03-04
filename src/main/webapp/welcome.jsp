<%--
  Created by IntelliJ IDEA.
  User: payal
  Date: 22/2/18
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p> welcome user! </p>
<br /><br />

<form action = "HelloForm" method = "POST">
    Blog ID : <input type = "number" name = "blog_id">
    <br /><br />
    Blog Content:
    <br />
    <textarea rows="4" cols="50" name="content">
    </textarea>
    <br /><br />
    <input type = "submit" value = "Save" />
</form>


</body>
</html>
