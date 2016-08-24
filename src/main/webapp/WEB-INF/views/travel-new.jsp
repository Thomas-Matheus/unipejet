<%@ page language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

 <%@ include file="header.jsp" %>
 
 	<div class="content-wrapper">
	    <!-- Main content -->
	    <section class="content">
	    	<section class="content">
			    	<div class="row">
				        <div class="col-xs-12">
				
				            <div class="box">
				                <div class="box-header">
				                    <h3 class="box-title">Adicionar Viagem</h3>
				                </div>
				                <!-- /.box-header -->
				                <div class="box-body">
				                    <form:form method="POST" modelAttribute="travel" class="form-horizontal">

										<form:input type="hidden" path="seats" id="seats" />

				                        <div class="form-group">
				                        	<label class="col-sm-2 control-label" for="leaving">Saida</label>
				                            <div class="col-sm-10">
				                            	<form:input type="text" path="leaving" id="leaving" />
				                            	<div class="has-error">
						                            <form:errors path="leaving" class="help-inline"/>
						                        </div>
				                            </div>
				                        </div>
				                        <div class="form-group">
				                        	<label class="col-sm-2 control-label" for="destiny">Destino</label>
				                            <div class="col-sm-10">
				                            	<form:input type="text" path="destiny" id="destiny"/>
				                            	<div class="has-error">
						                            <form:errors path="destiny" class="help-inline"/>
						                        </div>
				                            </div>
				                        </div>
				                        <div class="form-group">
				                        	<label class="col-sm-2 control-label" for="value">Valor</label>
				                            <div class="col-sm-10">
				                            	<form:input type="text" path="value" id="value" />
				                            	<div class="has-error">
						                            <form:errors path="value" class="help-inline"/>
						                        </div>
				                            </div>
				                        </div>
				                        <div class="form-group">
				                        	<label class="col-sm-2 control-label" for="exitTime">Data de Saida</label>
				                            <div class="col-sm-10">
				                            	<form:input type="text" path="exitTime" id="exitTime" />
				                            	<div class="has-error">
						                            <form:errors path="exitTime" class="help-inline"/>
						                        </div>
				                            </div>
				                        </div>
				                        <div class="form-group">
				                            <div class="col-sm-offset-2 col-sm-6">
				                                <a href="<c:url value='/panel/user/list' />" class="btn btn-danger" >
				                                    <i class="fa fa-close"></i>
				                                    Cancelar
				                                </a>
				                                <button type="submit" class="btn btn-success">
				                                    <i class="fa fa-check"></i>
				                                    Salvar
				                                </button>
				                            </div>
				                        </div>
				                    </form:form>
				                </div>
				            </div>
				        </div>
				    </div>
			    </section>
	    </section>
    </div>
 
 <%@ include file="footer.jsp" %>