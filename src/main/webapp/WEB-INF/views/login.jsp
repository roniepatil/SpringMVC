<head>

    <%@ page isELIgnored="false" %>

</head>
<html>
<body>
<form action="/helloworld" method="GET" modelAttribute="mi5">

<label for="name"><b>Email</b></label>
  <input type="text" placeholder="Enter your name" name="name" required>

  <label for="pass"><b>Password</b></label>
  <input type="password" placeholder="Enter Password" name="pass" required>

  <button type="submit">Register</button>

</body>
</html>
