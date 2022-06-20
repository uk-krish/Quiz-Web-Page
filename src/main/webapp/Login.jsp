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
            <a href="index.html"><img src="Image/logo.png" alt=""></a>
            <div class="nav-links" id="navLinks">
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
                <form class="form" action=loginserver method=post>
                    <div class="name box">
                        <p>User Name</p>
                        <input type="text" required name=txtName></div>
                        <!-- ----- -->
                        <div class="password box">
                            <p>Password</p>
                            <input type="password" required name=txtPwd></div>
                            <div class="forgot">
                            
                                <a href="">Forgot Password?</a>
                            </div>
                <div class="inbox">
                    <a href=""><input class="sign" type="Submit" value="SIGN IN"></a>
                    <!-- <input class="rest" type="reset" value="Reset"> -->
                       
                </div>
        <!-------------------------------- forot -------------------------------->
        <div class="create">
            <p>Don't Have a Account ?<a href="SignUp.jsp">Create a Account</a></p>
        </div>
                </form>
    <!-------------------------------- create -------------------------------->
   
            </div>
   <!-------------------------------- Right -------------------------------->
            <div class="left">
                    <div class="image">
                        <img width="400" src="Image/right.png" alt="">
                    </div>                
            </div>
        </div>
    </div>
    </div>
</body>
</html>