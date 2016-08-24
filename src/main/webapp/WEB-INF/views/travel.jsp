<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <link href="<c:url value='/static/bootstrap/css/bootstrap.min.css' />" rel="stylesheet"><
    <link href="<c:url value='/static/plugins/iCheck/square/blue.css' />" rel="stylesheet">
    <link href="<c:url value='/static/css/AdminLTE.min.css' />" rel="stylesheet">

    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <a href="#"><b>UNIPE</b> JET</a>
    </div>
    <div class="login-box-body">
        <p class="login-box-msg">Escolha uma poutrona</p>
            <c:forEach items="${seats}" var="seats">

                <c:if test="${!seats.isBusy}">
                    <a href="<c:url value='/travel/buy/${seats.id}/travel/${travelId}' />"
                       class="btn btn-box-tool center-block bg-green" title="Comprar"
                       data-toggle="tooltip"> ${seats.seatNumber}
                    </a>
                </c:if>

                <c:if test="${seats.isBusy}">
                    <a href="<c:url value='#' />"
                            class="btn btn-box-tool center-block bg-red disabled" title="Comprar"
                            data-toggle="tooltip"> ${seats.seatNumber}
                    </a>
                </c:if>
            </c:forEach>
    </div>
</div>

<script src="<c:url value='/static/plugins/jQuery/jQuery-2.1.4.min.js' />"></script>
<script src="<c:url value='/static/bootstrap/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/static/plugins/iCheck/icheck.min.js' />"></script>
</body>
</html>