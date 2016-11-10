App.controller('AgenteCtrl', function($scope, AgenteService, $route,$routeParams,$location,EnvioService){
	$scope.agente = [];
	$scope.agenteEditar = {};

	$scope.notFound = false;
	AgenteService.list().then(function(data){
		$scope.agente = data.data;
		if(data.data.length == 0){
			$scope.notFound = true;
		}
	},function(data){
		console.log("data", data);
	});
	$scope.agenteEditar = EnvioService.getParametro();
	
	$scope.deletar = function(item){
		AgenteService.delete(item).then(function(data){
			$route.reload();
		});	
	}

	$scope.atualizar = function(item){
		AgenteService.create(item).then(function(data){
				$location.path('/');
			});
	}
	
	$scope.editar = function(item){
		$scope.agenteEditar = {};
		EnvioService.addParametro(item);
		$location.path('/editarAgente');
	}
	
});