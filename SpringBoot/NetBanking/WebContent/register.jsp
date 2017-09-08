<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<link type="text/css" rel="stylesheet" href="styles/register.css">
</head>
<body>

<section>

<fieldset>
<legend>Trader Registration</legend>

<form:form name="Cutomer" commandName="customer" action="process" method="POST">


<form:label path="firstName">First Name</form:label>
<form:input path="firstName"/>
<form:errors path="firstName"> </form:errors><br>
<form:label path="lastName">Last Name </form:label>
<form:input path="lastName"/>
<form:errors path="lastName"> </form:errors><br>
<form:label path="address">Address </form:label>
<form:input path="address"/>
<form:errors path="address"> </form:errors><br>
<form:label path="email">Email</form:label>
<form:input path="email" />
<form:errors path="email"> </form:errors><br>
<input type="submit" value="submit">
</form:form>

</fieldset>
</section>
</body>
</html>