//服务层
app.service('companyinfoService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../companyinfo/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../companyinfo/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../companyinfo/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../companyinfo/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../companyinfo/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../companyinfo/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../companyinfo/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
