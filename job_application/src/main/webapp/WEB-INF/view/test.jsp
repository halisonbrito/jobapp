<%--
  Created by IntelliJ IDEA.
  User: HP Pavilion
  Date: 6/17/2019
  Time: 7:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://code.jquery.com/jquery-1.10.2.js"
            type="text/javascript"></script>
    <script src="../assets/ajax/add_company.js" type="text/javascript"></script>
    <title>Title</title>
</head>
<body>
    <div>
        <label>Company name:</label>
        <input name="name" id="name" type="text">
        <input name="id" id="id" type="hidden">
    </div>
    <div>
        <label>Description:</label>
        <input name="description" id="description" type="text">
    </div>
    <div>
        <label>Business type:</label>
        <input  name="businessType" id="businessType" type="text">
    </div>
    <div>
        <label>Phone:</label>
        <input name="phone" id="phone" type="text">
    </div>
    <button title="Save" name="save" id="butt">Save</button>


</body>
</html>
