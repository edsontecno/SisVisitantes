angular.module('Usuario', [])

	.controller('CadastroUsuario', function($scope, $http) {
		
		//CARREGANDO PERFIS
		$http.get("http://localhost:8080/perfil/todos"). then(function(value) {
			$scope.perfis = value.data;

		}, function(reason) {
			
		}, function(value) {
			
		})
		
		
		$scope.salvarUsuario = function() {
			
			$http.post("http://localhost:8080/usuario/salvar", angular.toJson($scope.usuario)).then(function(value) {
				alert(value.data);
			}, function(reason) {
				
			}, function(value) {
				
			});
		};	
	});