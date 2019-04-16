//服务层
app.service('graduateinfoService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../graduateinfo/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../graduateinfo/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../graduateinfo/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../graduateinfo/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../graduateinfo/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../graduateinfo/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../graduateinfo/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
