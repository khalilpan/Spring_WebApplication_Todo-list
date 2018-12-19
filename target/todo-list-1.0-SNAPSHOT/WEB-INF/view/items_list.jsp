<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.khalilpan.Util.Mappings" %>
<html>
<head>
    <title>Todo Items</title>
</head>
<body>
    <div align="center">
    <c:url var="addurl" value="${Mappings.ADD_ITEM}"/>
    <a href="${addurl}">New Item</a>

    <c:url var="addurl2" value="${Mappings.HOME}"/>
    <a href="${addurl2}">Home</a>

        <table border="1" cellpadding="5">

        <caption><h2>Todo Items</h2></caption>

        <tr>
            <th>Title</th>
            <th>Deadline</th>
            <th>View</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

        <c:forEach var="item" items="${todoData.items}">

        <c:url var="viewUrl" value="${Mappings.VIEW_ITEM}">
            <c:param name="id" value="${item.id}"/>
        </c:url>

        <c:url var="editUrl" value="${Mappings.ADD_ITEM}">
            <c:param name="id" value="${item.id}"/>
        </c:url>

        <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
            <c:param name="id" value="${item.id}"/>
        </c:url>

        <tr>
            <td><c:out value="${item.title}"/></td>
            <td><c:out value="${item.deadLine}"/></td>
            <td><a href="${viewUrl}">View</a></td>
            <td><a href="${editUrl}">Edit</a></td>
            <td><a href="${deleteUrl}">Delete</a></td>
        </tr>

        </c:forEach>

        </table>
    </div>
</body>
</html>