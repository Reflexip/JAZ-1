<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Engine" method="get" enctype="text/plain">

Imię<br/>
	<input name="name" placeholder="Imię:"/><br>
Nazwisko<br/>
	<input name="surname" placeholder="Nazwisko:"/><br/>
Email<br/>
	<input name="email" placeholder="Email:"/><br/>
Pracodawca<br/>
	<input name="employer" placeholder="Pracodawca:"/><br/>


<h3>Skąd dowiedziałeś się o konferencji:</h3>

<input type="radio" name="radio" value="1"/>	Ogłoszenie w pracy<br/>
<input type="radio" name="radio" value="2"/>	Ogłoszenie na uczelni<br/>
<input type="radio" name="radio" value="3"/>	Facebook<br/>
<input type="radio" name="radio" value="4"/>	Znajomi<br/>
<input type="radio" name="radio" value="5"/>	Inne (jakie?)<br/>

<input name="other" placeholder="Inne"/><br/><br/>


<input name="whatYouDo" placeholder="Czym się zajmujesz"/>Czym się zajmujesz<br/><br/>

<input type="submit" value="Wyślij formularz"/>
<input type="reset" value="Czyść formularz"/>

</form>
</body>
</html>