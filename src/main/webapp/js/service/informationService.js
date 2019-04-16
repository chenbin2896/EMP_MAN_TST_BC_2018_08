//服务层
app.service('informationService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../information/findAll');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../information/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../information/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../information/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../information/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../information/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../information/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
