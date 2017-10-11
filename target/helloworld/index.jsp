<html>
  <head>
    <title>Sample "Hello, World" Application</title>
  </head>
  <body bgcolor=white>

    <table border="0" cellpadding="10">
      <tr>
        <td>
          <img src="images/Pivotal_Logo.png">
        </td>
        <td>
          <h1>Sample "Hello, World" Application</h1>
        </td>
      </tr>
    </table>

    <p>This is the home page for the HelloWorld Web application. </p>
    <p>To prove that they work, you can execute either of the following links:
    <ul>
      <li>To a JSP page: <a href="hello.jsp">hello.jsp</a>.
      <li>To a servlet: <a href="/hello">hello</a>.
    </ul>

  </body>
</html>



<!-- <%--
  Copyright (c) Microsoft Corporation. All rights reserved.
  Licensed under the MIT License. See License.txt in the project root for
  license information.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  import="java.util.Date" %>
<html>
<head>
  <title>Samples Hello World</title>
</head>
<body>
  <H1>Hello Walmart!</H1>
   Current time is: <%= new Date() %>
</body>
</html> -->
