<%-- 
    Document   : PatronProfile
    Created on : Nov 16, 2014, 3:34:17 PM
    Author     : RachithaSrinath
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>

    <!-- Website Title & Description for Search Engine purposes -->
    <title>Raven's Library | Home Page</title>
    <meta name="description" content="">

    <!-- Mobile viewport optimized -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <!-- Bootstrap CSS -->
    <link href="assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/includes/css/bootstrap-glyphicons.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery.js"></script>

    <!-- If no online access, fallback to our hardcoded version  of jQuery -->
    <script>window.jQuery || document.write('<script src="../../assets/includes/js/jquery-1.8.2.min.js"><\/script>');</script>

    <!-- Bootstrap JS -->
    <script src="../assets/bootstrap/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.css" type="text/css"/>

    <!-- Include Modernizr in the head, before any other Javascript -->
    <script src="assets/includes/js/modernizr-2.6.2.min.js"></script>
    <script type="text/javascript" src="assets/js/jquery.i18n.properties-min-1.0.9.js"></script>
    <script src="//ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"></script>
    <script src="assets/includes/js/additional-methods.js"></script>

</head>



<script>

        $(document).ready(function() {
            // Set a timeout...
            setTimeout(function() {
                // Hide the address bar!
                window.scrollTo(0, 1);
            }, 0);
        });
</script>
<style>
    .navbar-fixed-top {
        background: #428bca;
    }
    .brand {
        margin: auto auto;
        float: none;
        padding-top: 10px;
        max-width:250px;
        width:250px;
    }

    .brand {
        margin: auto auto;
        float: none;
        padding-top: 20px;
        max-width:250px;
        width:250px;
    }
    body {
        padding-top: 30px;
        padding-bottom: 20px;
        background-color:#428bca;
        min-height: 700px;
        position: absolute;
        width: 100%;

    }   
    .navbar-brand:hover{
        color: #000000;
    }
    #main_form{
        text-align: center;
        padding-left: 20px;
        padding-right: 20px;
    }
    .btn-small{
        color: #fff;
        border: none;
    }
    .input-group{
        color: #727375;
    }
    @font-face {
        font-family: MYRIAD-PRO;
        font-style: regular;
        font-weight: normal;
        src: url('assets/includes/fonts/myriad-pro/MYRIADPRO-REGULAR.OTF') format('opentype');
    }

    @font-face {
        font-family: MYRIADPRO;
        font-style: bold;
        src: url("assets/includes/fonts/myriad-pro/MYRIADPRO-BOLD.OTF") format("opentype");
    }
    .input
    {
        font-family: MYRIADPRO;
    }
    #main_form .error {
        padding:5px;
        margin:5px 0;
        border:1px solid #d43f3a;
    }
    .navbar-fixed-bottom {
        background: #993333;
    }
</style>

<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="nav navbar-brand brand center-block" id="nav" href="" style="color:#428bca;font-style: italic">

            </a>
        </div> 
    </div>
</div>
<div class="form-group" style="height: 350px;max-width: 500px; margin: 50px auto 30px;background-color:#fff;
     border: 1px solid #000;-webkit-border-radius: 5px; -moz-border-radius: 5px;border-radius: 5px;-webkit-box-shadow: none; -moz-box-shadow: none;
     box-shadow: none;margin-top: 50px;padding-top: 60px">
    <form id="main_form" name="main_form" accept-charset="UTF-8" action="api/Admin/login" method="GET" novalidate>
        <h1 class="text-center" style="font-size: 30px; font-family:MYRIAD-PRO;margin-top: 0px;color: #000;">Raven's E-Library</h1>
        <div style="padding-top:10px">
            <button type="submit" id="submit_btn" class="button btn-danger btn-large " style="font-family:MYRIAD-PRO;"value="AdminLogin">Admin Login</button>
        </div>
    </form>
    <form id="main_form" name="main_form" accept-charset="UTF-8" action="api/Patron/login" method="GET" novalidate>
        <div style="padding-top:10px">
            <button type="submit" id="submit_btn" class="button btn-success btn-large" style="font-family:MYRIAD-PRO;"value="PatronLogin">Patron Login</button>
        </div>
    </form>
</div>

</body>
</html>





