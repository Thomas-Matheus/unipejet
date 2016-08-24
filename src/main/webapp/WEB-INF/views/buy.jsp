<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link href="<c:url value='/static/bootstrap/css/bootstrap.min.css' />" rel="stylesheet">
<link href="<c:url value='/static/plugins/iCheck/square/blue.css' />" rel="stylesheet">
<link href="<c:url value='/static/css/AdminLTE.min.css' />" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">

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
			<p class="login-box-msg">Comprar Passagem</p>
			<div class="box-body">
                    <form:form method="POST" modelAttribute="passenger" class="form-horizontal">

                    	<form:input type="hidden" path="seatsId" id="seatsId" />
                    	<form:input type="hidden" path="travelId" id="travelId" />
										                    	
                        <div class="form-group">
                        	<label class="col-sm-2 control-label" for="name">Nome</label>
                            <div class="col-sm-10">
                            	<form:input type="text" path="name" id="name" />
                            	<div class="has-error">
		                            <form:errors path="name" class="help-inline"/>
		                        </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-6">
                                <button type="submit" class="btn btn-success">
                                    <i class="fa fa-check"></i>
                                    Comprar
                                </button>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
		</div>
	</div>

	<script src="<c:url value='/static/plugins/jQuery/jQuery-2.1.4.min.js' />"></script>
	<script src="<c:url value='/static/bootstrap/js/bootstrap.min.js' />"></script>
</body>
</html>
