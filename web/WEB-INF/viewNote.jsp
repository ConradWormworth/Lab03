<%-- 
    Document   : viewNote
    Created on : Sep 25, 2018, 11:57:46 AM
    Author     : 612944
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Title: ${note.title}</h1><br>
        Contents: ${note.noteEntry}<br><br>
        
        <a href="note?edit">Edit</a>
    </body>
</html>
