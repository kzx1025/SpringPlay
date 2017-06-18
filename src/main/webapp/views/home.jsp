<%--
  Created by IntelliJ IDEA.
  User: iceke
  Date: 17/6/8
  Time: 下午5:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Home</title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js">
    </script>
    <script type="text/javascript">
        $(document).ready(function(){
            var i =1;
            $("button#1").click(function(){
                if(i%2==0) {
                    $("p").hide(2000,function(){
                        alert("The paragraph is now hidden");
                    });
                }else{
                    $("p").show();
                }
                $("h1").text("Welcome to home page ${message},${user.userName}");

                i++;
               // $("div").animate({height:'+550px'});
            });

            $("button#3").click(function(){
                $.getJSON("/users/4.json",function(data){
                    alert("Data: " + data.user.age);});
            });
        });
    </script>
</head>
<body>
<div>
<h1>2333welcome to home page ${message},${user.userName} </h1>
</div>
<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
<button id="1">Click me</button>
<button id="3">get data</button>
</body>
</html>
