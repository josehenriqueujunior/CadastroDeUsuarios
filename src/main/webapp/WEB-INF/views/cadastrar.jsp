<!DOCTYPE html>
<html>
<head >
<link href="${pageContext.request.contextPath}/resources/style/style.css" rel="stylesheet">
</head>
<body ng-app="Usuario">
<div ng-controller= "appController as controller">
<a class="botao2" href="/Cadastro">Pagina Inicial</a>
<a class="botao2" href="/Cadastro/listar">Lista de Usuarios</a>
<div align="center" class="content">
<h4>Cadastrar Novo Usuário</h4>
			<input type="text" class="css-input" ng-model="nome"><br/><br/>
<input type = "button" value="Salvar Usuário" class="botao" ng-click ="salvarUsuario()">
</div>
<script src="${pageContext.request.contextPath}/resources/javascript/angular.js"></script>
<script src="${pageContext.request.contextPath}/resources/javascript/controller.js"></script>
</body>
</html>