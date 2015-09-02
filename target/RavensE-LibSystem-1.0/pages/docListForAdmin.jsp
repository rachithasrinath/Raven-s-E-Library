<%-- 
    Document   : documentList
    Created on : Nov 15, 2014, 7:13:12 PM
    Author     : RachithaSrinath
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>


    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <!-- Website Title & Description for Search Engine purposes -->
    <title>Document List</title>
    <meta name="description" content="">

    <!-- Mobile viewport optimized -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <!-- Bootstrap CSS -->
    <link href="../../assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../assets/includes/css/bootstrap-glyphicons.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery.js"></script>

    <!-- If no online access, fallback to our hardcoded version  of jQuery -->
    <script>window.jQuery || document.write('<script src="../../assets/includes/js/jquery-1.8.2.min.js"><\/script>');</script>

    <!-- Bootstrap JS -->
    <script src="../../assets/bootstrap/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="../../assets/bootstrap/css/bootstrap.css" type="text/css"/>

    <!-- Include Modernizr in the head, before any other Javascript -->
    <script src="../../assets/includes/js/modernizr-2.6.2.min.js"></script>
    <script type="text/javascript" src="../../assets/js/jquery.i18n.properties-min-1.0.9.js"></script>
    <script src="//ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"></script>
    <script src="../../assets/includes/js/additional-methods.js"></script>

</head>
<style>
    .navbar-fixed-top {
        background: #428BCA;
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
        background-color:#428BCA;
        min-height: 60px;
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
    .btn-large{
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
        src: url('../../assets/includes/fonts/myriad-pro/MYRIADPRO-REGULAR.OTF') format('opentype');
    }

    @font-face {
        font-family: MYRIADPRO;
        font-style: bold;
        src: url("../../assets/includes/fonts/myriad-pro/MYRIADPRO-BOLD.OTF") format("opentype");
    }
    .input
    {
        font-family: MYRIADPRO;
    }
    #main_form .error {
        padding:5px;
        margin:5px 0;
        border:1px solid #000;
    }
</style>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a class="nav navbar-brand brand center-block" id="nav" href="" style="color:#fff;font-style: italic">
                    RAVEN'S E-Library
                </a>
            </div> 
        </div>
    </div>
    
  
        <div class="container">
            <div class="col-md-6">
                <div class="pull-left">
                    <h5 class="lg-title mb5" style="color:#fff">Document List</h5>
                </div>
            </div>
            
            
            <div class="table-responsive col-md-12">
                <table class="table table-hidaction table-hover mb30" style="color:#000;background-color: #fff">
                    <thead>
                        <tr>
 
                            <th style="display: table-cell; font-weight: bold;font-size:14px;padding-top: 8px; line-height: 1.42857143;text-align: center">Document Name</th>
                            <th style="display: table-cell; font-weight: bold;font-size:14px;padding-top: 8px; line-height: 1.42857143;text-align: center">Author Name</th>
                            <th style="display: table-cell; font-weight: bold;font-size:14px;padding-top: 8px; line-height: 1.42857143;text-align: center">Edition</th>
                            <th style="display: table-cell; font-weight: bold;font-size:14px;padding-top: 8px; line-height: 1.42857143;text-align: center">Published Date</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr <c:forEach items="${listofdoc}" var="listofdoc"> >
                                
                                <td style="font-size:12px;text-align: center">${listofdoc.title}</td>
                                <td style="font-size:12px;text-align: center">${listofdoc.author}</td>
                                <td style="font-size:12px;text-align: center">${listofdoc.edition}</td>
                                <td style="font-size:12px;text-align: center">${listofdoc.publishedDate}</td>
                            </tr>
                        </c:forEach>
                    </tbody> 
                </table>        
            </div>
            
        </div>
  
</body>
</html>
