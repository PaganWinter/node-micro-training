<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="styles/register.css">
</head>
<body>
<section>
<fieldset>
<legend>Trader Registration</legend>


<form:form name="Cutomer" commandName="customer" method="POST"  action="traderRegister.htm">

<form:errors path="traderName" class="errors"/>
<form:errors path="address" class="errors"/>
<form:errors path="email" class="errors"/>

<form:label path="traderId">Trader Id</form:label>
<form:input path="traderId"/>

<form:label path="traderName">Trader Name </form:label>
<form:input path="traderName"/>

<form:label path="address">Address </form:label>
<form:input path="address"/>

<form:label path="email">Email</form:label>
<form:input path="email" />

<form:label path="password">Password</form:label>
<form:input path="password"/>

<form:label path="bankId">Bank Id</form:label>
<form:select path="bankId">
<form:options items="${bankList}" itemValue="bankId" itemLabel="bankName" />
</form:select>
<input type="submit" value="submit" />
</form:form>
</fieldset>
</section>
</body>
</html>