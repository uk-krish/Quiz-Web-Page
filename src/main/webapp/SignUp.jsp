<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="homescreen">
        <nav>
            <a href="index.html"><img src="image/logo.png" alt=""></a>
            <div class="nav-links" id="navLinks">
                <i class="fa fa-times-circle" onclick="hidemenu()"></i>
                <ul>
                    <li><a href="#">HOME</a></li>
                    <li><a href="#">ABOUT</a></li>
                    <li><a href="#">Sign up</a></li>
                    <li><a href="#">Sign in</a></li>
                </ul>
            </div>
        </nav>
    </div>
    <div class="container">
        <div class="content">
   <!-------------------------------- Left -------------------------------->
            <div class="right">
                <form class="form" action=SignUp method=post>
                    <div class="name box">
                        <p>User Name</p>
                        <input type="text" required name=txtName1 ></div>
                    <div class="name box">
                        <p>Email</p>
                        <input type="text" required name=txtemail></div>
                        <!-- ----- -->
                        <div class="password box">
                            <p>Password</p>
                            <input id="pass" type="password" required></div>
                        <div class="password box">
                            <p>Confirm Password</p>
                            <input id="cpass" type="password" required name=txtPwd1></div>
                <div class="inbox">
                    <a href="Login.jsp"><input class="sign" type="Submit" value="SIGN IN"></a>
                       
                </div>
        <!-------------------------------- forot -------------------------------->
        <div class="create">
            <p>Already Have a Account ?<a href="Login.jsp">Sign in</a></p>
        </div>
                </form>
    <!-------------------------------- create -------------------------------->
   
            </div>
   <!-------------------------------- Right -------------------------------->
            <div class="left">
                    <div class="image">
                        <img width="800" src="Image/Quiz.png" alt="">
                    </div>                
            </div>
        </div>
    </div>
</body>
<script type="text/javascript">
    window.onload = function () {
        var txtPassword = document.getElementById("pass");
        var txtConfirmPassword = document.getElementById("cpass");
        txtPassword.onchange = ConfirmPassword;
        txtConfirmPassword.onkeyup = ConfirmPassword;
        function ConfirmPassword() {
            txtConfirmPassword.setCustomValidity("");
            if (txtPassword.value != txtConfirmPassword.value) {
                txtConfirmPassword.setCustomValidity("Passwords do not match.");
            }
        }
    }
</script>
</html>