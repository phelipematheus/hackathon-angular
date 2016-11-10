App.factory('AgenteService', function($http, API){
	return {
		list: function(){
			return $http.get(API+'agente');
		},
		create: function(item){
			return $http.post(API+'agente', item);
		},
		delete: function(item){
			return $http.post(API+'agente/excluir', item);
		}
	}
})