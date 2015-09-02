<%-- 
    Document   : AdminLoginForm
    Created on : Nov 15, 2014, 5:10:12 PM
    Author     : pratibhakakarla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
    </head>
    <body>
        <h1>Admin Login</h1>
        
        <div class="container">
        
        <form class="form-horizontal" action="../api/Admin/adminLogin" method="post" role="form">
            <div class="form-group">
                <label for="username" class="col-sm-2 control-label">User Name</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="username" id="username" placeholder="User Name">
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">Status</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control"  name="password" id="password" placeholder="Password">
                </div>
                
                <button class="btn btn-primary" type="submit" style="font-family: sans-serif" value="Login">Sign in</button>
            </div>
            </form>
            
    </div>

        
        
    </body>
</html>
