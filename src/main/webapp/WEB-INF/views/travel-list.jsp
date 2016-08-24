<%@ page language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%@ include file="header.jsp"%>

<div class="content-wrapper">
	<!-- Main content -->
	<section class="content">
		<div class="box">
			<div class="box-header">
				<h3 class="box-title">Lista de Viagens</h3>
			</div>
			<!-- /.box-header -->
			<div class="box-body">
				<table id="table-list"
					class="table table-bordered table-striped">
					<thead>
						<tr>
							<th></th>
							<th>Saida</th>
							<th>Destino</th>
							<th>Valor</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${travels}" var="travels">
							<tr>
								<td></td>
								<td>${ travels.leaving }</td>
								<td>${ travels.destiny }</td>
								<td>${ travels.exitTime }</td>
								<td>${ travels.value }</td>
								<td><a
									href="<c:url value='/travel/show/${travels.id}' />"
									class="btn btn-box-tool center-block bg-blue" title="Visualizar"
									data-toggle="tooltip"> <i class="glyphicon glyphicon-edit"></i>
								</a></td>
								<td><a
									href="<c:url value='/travel/delete/${travels.id}' />"
									class="btn btn-box-tool center-block bg-red"
									data-toggle="tooltip" title="Excluir"> <i class="glyphicon glyphicon-trash"></i>
								</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<!-- /.box-body -->
		</div>
	</section>
</div>

<%@ include file="footer.jsp"%>