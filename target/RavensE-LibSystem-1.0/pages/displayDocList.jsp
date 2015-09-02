<%-- 
    Document   : searchCatalogue
    Created on : Nov 15, 2014, 7:17:43 PM
    Author     : RachithaSrinath
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>

    <!-- Website Title & Description for Search Engine purposes -->
    <title>Raven's Admin | Catalogue</title>
    <meta name="description" content="">

    <!-- Mobile viewport optimized -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <!-- Bootstrap CSS -->
    <link href="../assets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="../assets/includes/css/bootstrap-glyphicons.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery.js"></script>

    <!-- If no online access, fallback to our hardcoded version  of jQuery -->
    <script>window.jQuery || document.write('<script src="../assets/includes/js/jquery-1.8.2.min.js"><\/script>');</script>

    <!-- Bootstrap JS -->
    <script src="../assets/bootstrap/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="../assets/bootstrap/css/bootstrap.css" type="text/css"/>

    <!-- Include Modernizr in the head, before any other Javascript -->
    <script src="../assets/includes/js/modernizr-2.6.2.min.js"></script>
    <script type="text/javascript" src="../assets/js/jquery.i18n.properties-min-1.0.9.js"></script>
    <script src="//ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"></script>
    <script src="../assets/includes/js/additional-methods.js"></script>

</head>

<script>
        $(document).ready(function() {
            // Set a timeout...
            setTimeout(function() {
                // Hide the address bar!
                window.scrollTo(0, 1);
            }, 0);

            // Setup form validation on the #main_form element
            $("#main_form").validate({
                // Specify the validation rules
                rules: {
                    document_Title: "required",
                    author_Name: "required",
                    edition:"required",
                    publication_Date:"required"
                    
                },
                errorLabelContainer: '#errors',
                messages: {
                    document_Title: "Enter your Document Title",
                    author_Name: "Enter Author Name",
                    edition: "Enter Edition",
                    publication_Date:"Enter Published Date"
                },
                submitHandler: function(form) {
//                    if (checkAccept(form)) {
                        form.submit();
//                    }
                },
                focusInvalid: false,
            });
            $('#lang_en').click(function() {
                load_lang('en');
            });
        });
</script>
<style>
    .navbar-fixed-top {
        background: #F0AD4E;
    }
    .brand {
        margin: auto auto;
        float: none;
        padding-top: 10px;
        max-width:250px;
        width:250px;
    }
    .navbar-fixed-top {
        background: #f0ad4e;
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
        /*            background-color: #428BCA;*/
        background-color:#f0ad4e;
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
    src: url('../assets/includes/fonts/myriad-pro/MYRIADPRO-REGULAR.OTF') format('opentype');
}

@font-face {
    font-family: MYRIADPRO;
    font-style: bold;
    src: url("../assets/includes/fonts/myriad-pro/MYRIADPRO-BOLD.OTF") format("opentype");
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
        background: #F0AD4E;
    }
</style>

<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a class="nav navbar-brand brand center-block" id="nav" href="" style="color:#444;font-style: italic">
                    RAVEN'S E-Library Catalogue 
                </a>
            </div> 
        </div>
    </div>
    
    
    <div class="form-group" style="height: 650px;max-width: 600px; margin: 50px auto 30px;background-color:#fff;
         border: 1px solid #000;-webkit-border-radius: 5px; -moz-border-radius: 5px;border-radius: 5px;-webkit-box-shadow: none; -moz-box-shadow: none;
         box-shadow: none;margin-top: 50px;padding-top: 30px">
        <form id="main_form" name="main_form" accept-charset="UTF-8" action="" method="post" novalidate>
            <h1 class="text-center" style="font-size: 30px; font-family:MYRIAD-PRO;margin-top: 0px;color: #000;">Fill in the form to add new documents to Catalogue</h1>
            <div style="padding-top:10px;margin-bottom: 15px;" class="form-group">
                <label for="documentName" class='pull-left'>Document Name</label>
                    <input type="document_Title" name="document_Title" class="form-control" id="document_Title" value="" required="true"  placeholder="Document Title" style="max-width: 100%" />
            </div>
            <div style="padding-top:10px;margin-bottom: 15px;" class="form-group">
                <label for="authorName" class='pull-left'>Author Name</label>
                <input type="text" name="author_Name" id="author_Name" class="form-control" value="" required="true" placeholder="Author Name" style="background-color: white" />
            </div>
             <div style="padding-top:10px;margin-bottom: 15px;" class="form-group">
                <label for="edition" class='pull-left'>Edition</label>
                <input type="edition" name="edition" id="edition" class="form-control" value="" required="true" placeholder="Edition" style="background-color: white" />
            </div>
             <div style="padding-top:10px;margin-bottom: 15px;" class="form-group">
                <label for="publicationDate" class='pull-left'>Published Date</label>
                <input type="publication_Date" name="publication_Date" id="publication_Date" class="form-control" value="" required="true" placeholder="Published Date" style="background-color: white" />
            </div>
            <div id="errors" style="color:#000;border-color:#d43f3a"></div>
            <div style="padding-top:10px">
                <button type="submit" id="submit_btn" class="button btn-success btn-large btn-block " style="font-family:MYRIAD-PRO;"value="Sign In">Add</button>
            </div>
        </form>
    </div>
   
</body>
</html>




