<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ut" uri="/WEB-INF/tlds/ut.tld" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static/aceadmin"/>
<c:set var="ctxBase" value="${pageContext.request.contextPath}/base-js"/>
<c:set var="ctxImage" value="${pageContext.request.contextPath}/image"/>
<c:set var="productName" value="${ut:get('productName')}" />
<c:set var="copyright" value="${ut:get('copyright')}" />