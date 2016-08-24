<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title> .:: UNIPE JET ::. </title>
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="<c:url value='/static/bootstrap/css/bootstrap.min.css' /> ">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <link rel="stylesheet" href="<c:url value='/static/plugins/datatables/dataTables.bootstrap.css' />">
  <link rel="stylesheet" href="<c:url value='/static/css/AdminLTE.min.css' /> ">
  <link rel="stylesheet" href="<c:url value='/static/css/skins/_all-skins.min.css' /> ">
  <link rel="stylesheet" href="<c:url value='/static/plugins/datepicker/datepicker3.css' /> ">
  <style>
    body.modal-open .datepicker {
      z-index: 1050 !important;
    }
    body.modal-open .bootstrap-timepicker-widget {
      z-index: 1050 !important;
    }
  </style>

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">
	<header class="main-header">
    <!-- Logo -->
    <a href="#" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>U</b>JET</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><i class="fa fa-shopping-basket" aria-hidden="true"></i><b> UNIPE</b> JET</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </a>

      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
        	<li class="dropdown user user-menu">
		        <a href="<c:url value="/logout" />">
		        	<i class="fa fa-sign-in"></i> <span>Logout</span> 
	        	</a>
			</li>
        </ul>
      </div>
    </nav>
  </header>

  <!-- =============================================== -->

  <!-- Left side column. contains the sidebar -->
  <aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MENU</li>
        <li class="treeview">
          <c:url var="homePanel" value="/panel/index" />
          <a href="${homePanel}">
            <i class="fa fa-dashboard"></i> <span>Home</span>
          </a>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-pie-chart"></i>
            <span>Viagens</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="<c:url value='/panel/travel/new' />"><i class="fa fa-plus"></i> Adicionar </a></li>
            <li><a href="<c:url value='/panel/travel/list' />"><i class="fa fa-list"></i> Listar</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-bars"></i>
            <span>Passageiros</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="<c:url value='/panel/passenger/list' />"><i class="fa fa-list"></i> Listar</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-user"></i>
            <span>Usuário</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="<c:url value='/panel/user/new' />"><i class="fa fa-plus"></i> Adicionar </a></li>
            <li><a href="<c:url value='/panel/user/list' />"><i class="fa fa-list"></i> Listar</a></li>
          </ul>
        </li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>