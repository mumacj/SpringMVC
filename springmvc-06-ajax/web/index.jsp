<%--
  Created by IntelliJ IDEA.
  User: Ncj
  Date: 2019/12/24
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.min.js"></script>

    <script>
      function fun() {
        $.ajax({
          type:"POST",
          url:"${pageContext.request.contextPath}/a1",
          data:{"name":$("#username").val()},
          success:function (data) {
            alert(data)
          }
        })
      }
    </script>
  </head>
  <body>

  <input type="text" id="username" onblur="fun()">
  </body>
</html>
