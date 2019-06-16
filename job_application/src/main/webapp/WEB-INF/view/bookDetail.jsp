<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${msg} a Book</title>
</head>

<body>

<form:errors path="*" class="has-error" />

<c:if test="${msg == 'Update'}">
    <form:form modelAttribute="book" action="../books/update" method="post">

        <table>
            <tr>
                <td>Title:</td>
                <td>
                    <form:input path="title" name="title"/>
                    <form:errors path="title" cssClass="has-error"/>
                </td>
            </tr>
            <tr>
                <td>ISBN:</td>
                <td>
                    <form:input path="ISBN" name="ISBN"/>
                    <form:errors path="ISBN" cssClass="has-error"/>
                </td>
            </tr>
            <tr>
                <td>Author:</td>
                <td>
                    <form:input path="author" name="author"/>
                    <form:errors path="author" cssClass="has-error"/>
                </td>
            </tr>
            <tr>
                <td>Price:</td>
                <td>
                    <form:input path="price" name="price"/>
                    <form:errors path="price" cssClass="has-error"/>
                </td>
            </tr>
        </table>
        <input type="submit"/>
        <form:hidden path="id"/>
    </form:form>
</c:if>
<c:if test="${msg == 'Add'}">
    <form:form modelAttribute="book" action="../books/" method="post">

        <table>
            <tr>
                <td>Title:</td>
                <td>
                    <form:input path="title"/>
                    <form:errors path="title" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td>ISBN:</td>
                <td>
                    <form:input path="ISBN"/>
                    <form:errors path="ISBN" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td>Author:</td>
                <td>
                    <form:input path="author"/>
                    <form:errors path="author" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td>Price:</td>
                <td>
                    <form:input path="price"/>
                    <form:errors path="price" cssClass="error" />
                </td>
            </tr>
        </table>
        <input type="submit"/>
    </form:form>
</c:if>
<c:if test="${msg == 'Update'}">
    <form:form action="delete?bookId=${book.id}" method="post">
        <button type="submit">Delete</button>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form:form>
</c:if>
</body>

</html>