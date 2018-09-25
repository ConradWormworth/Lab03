<%-- 
    Document   : editNote
    Created on : Sep 25, 2018, 9:51:12 AM
    Author     : 612944
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
      <form action="note" method="POST">
          
        <h1>Title: </h1><input type="text" id="title" name="title" value="${note.title}" />
        <br>
        Contents: <br>
        <TEXTAREA name="noteEntry" ROWS="8" COLS="120" style="resize:none">${note.noteEntry}</TEXTAREA>
      
        <br><br><input type="submit" value="Confirm Edit" />
      </form>
        
        
    </body>
</html>
