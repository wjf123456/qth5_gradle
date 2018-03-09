<%--
  Created by IntelliJ IDEA.
  User: 10626
  Date: 2017/12/3
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
    <title>Title</title>
    <%--最终布局方式--%>
</head>
<body>
<%--引入的是tiles.jsp中的header body footer--%>
<div id="header">
    <t:insertAttribute name="header" />
</div>
<div id="content">
    <t:insertAttribute name="body" />
</div>
<div id="footer">
    <t:insertAttribute name="footer" />
</div>

</body>
</html>
