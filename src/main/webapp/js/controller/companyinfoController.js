 //控制层 
app.controller('companyinfoController' ,function($scope,$http,$controller   ,companyinfoService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		companyinfoService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		companyinfoService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		companyinfoService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=companyinfoService.update( $scope.entity ); //修改  
		}else{
			serviceObject=companyinfoService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		companyinfoService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		companyinfoService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}

    //查询详情
    $scope.findInfo = function (id) {
        location.href='/page/companyInfos.html?id='+id;
    }

    $scope.findInfo = function () {
        $http.get('/companyinfo/findAll').success(
            function (response) {
                $scope.list = response;
            }
        );
        $http.get('/information/findAll').success(
            function (response) {
                $scope.informationlist = response;
            }
        )
    }

    $scope.findCompanyInfo = function (id) {
        location.href='/page/companyInfos.html?id='+id;
    }
    $scope.findInformationInfo = function (id) {
        location.href='/page/informationInfos.html?id='+id;
    }
    
});	
