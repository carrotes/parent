<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ut" uri="/WEB-INF/tlds/ut.tld" %>
<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static"/>
<c:set var="productName" value="${ut:getProp('productName')}" />
<c:set var="name" value="${ut:getProp('name')}" />
<c:set var="co" value="${ut:getProp('co')}" />
<c:set var="year" value="${ut:getProp('year')}" />
<c:set var="email" value="${ut:getProp('email')}" />