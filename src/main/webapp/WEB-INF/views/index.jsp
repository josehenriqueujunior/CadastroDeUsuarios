
<html>
<head>

<link
	href="${pageContext.request.contextPath}/resources/style/style.css"
	rel="stylesheet">
</head>
<body ng-app="Usuario">
	<div ng-controller="appController as controller" class="content">
		<a class="botao" href="/Cadastro/listar">Listar Usuarios</a><br />
		<br /> <a class="botao" href="/Cadastro/cadastrar">Cadastrar Novo
			Usuario</a>
	</div>
	<script
		src="${pageContext.request.contextPath}/resources/javascript/angular.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/javascript/controller.js"></script>
</body>
</html>

