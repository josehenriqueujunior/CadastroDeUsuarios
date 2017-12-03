<!DOCTYPE html>
<html>
<head>
<link
	href="${pageContext.request.contextPath}/resources/style/style.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/style/table.css"
	rel="stylesheet">
</head>
<body ng-app="Usuario">
	<div ng-controller="appController as controller">
		<a class="botao2" href="/Cadastro">Pagina Inicial</a> <a
			class="botao2" href="/Cadastro/cadastrar">Cadastro de Usuarios</a> <br />
		<br />
		<div align="center">
			<input type="text" ng-model="criteria" placeholder="Pesquisar"
				class="css"></label> <br /> <br />
			<table data-ng-init="init()" id="customers">
				<thead>
					<tr>
						<th>Nome</th>
					</tr>
				</thead>
				<tbody>
					<tr ng-repeat="usuario in usuarios | filter:criteria">
						<td>{{usuario}}</td>
				</tbody>
			</table>
		</div>
	</div>
	<script
		src="${pageContext.request.contextPath}/resources/javascript/angular.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/javascript/controller.js"></script>
</body>
</html>