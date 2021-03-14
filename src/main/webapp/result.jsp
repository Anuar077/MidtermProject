<%@ page import ="java.util.*" %>
<body>
<center>
    <a href="book.jsp">Select Book</a>|
    <a href="login.jsp">Login</a>|
    <a href="logout">Logout</a>|
    <a href="Profile">Profile</a>|
    <h1>
        Show book list in terminal
    </h1>
        <%
    List result= (List) request.getAttribute("brands");
    Iterator it = result.iterator();
    System.out.println("We have ");
    while(it.hasNext()){
        System.out.println(it.next()+" ");
    }
%>
</body>