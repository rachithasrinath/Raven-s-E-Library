<%-- 
    Document   : docList
    Created on : Nov 20, 2014, 1:21:03 PM
    Author     : pratibhakakarla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${success} </h1>
        <h1>${error} </h1>
         
        
            <form id="main_form" name="main_form" accept-charset="UTF-8" action="../Admin/displayCatalogue" method="post" novalidate>
        <div style="padding-top:10px">
            <button type="submit" id="submit_btn" class="button btn-success btn-large" style="font-family:MYRIAD-PRO;"value="Subscribe">Click here to view catalogue</button>
        </div>
    </form>
        
        
    </body>
</html>
