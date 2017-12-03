angular.module("Usuario", [])
	.controller("appController", function($scope, $window, $http) {

		$scope.init = function() {
			$http({
				method : 'GET',
				url : 'listaUsuarios',
			}).then(function successCallback(response) {
				$scope.usuarios = response.data;
			}, function errorCallback(response) {
				$window.alert(data);
			});
		}


		$scope.nome = null;
		$scope.salvarUsuario = function() {
			var usuario = new Object();
			usuario.nome = $scope.nome;
			$http({
				method : 'POST',
				url : 'salvaDados',
				data : usuario
			}).then(function successCallback(response) {
				$window.alert(response.data.mensagem);
				$scope.nome = null;
				console.log("aqui2");
			}, function errorCallback(response) {
				$window.alert(response.data.mensagem);
			});


		}
	})