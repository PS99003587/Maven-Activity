<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">

                <table align="center">
                    <tr>
                        <td>
                            <form:label path="name">Name:</form:label>
                        </td>
                        <td>
                            <form:input path="name" name="name" id="name" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password:</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="fname">FirstName:</form:label>
                        </td>
                        <td>
                            <form:input path="fname" name="fname" id="fname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="lname">LastName:</form:label>
                        </td>
                        <td>
                            <form:input path="lname" name="lname" id="lname" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="mob">Mobile:</form:label>
                        </td>
                        <td>
                            <form:input path="mob" name="mob" id="mob" />
                        </td>
                    </tr>

                    <tr>
                        <td></td>
                        <td>
                            <form:button id="register" name="register">Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="home.jsp">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
</body>
</html>