$.ajax({
	url:"/err/getAjaxerror",
	type:"post",
	async:false,
	success:function(data){
		if(data.status==200 && data.msg == "OK"){
			alert("success");
		}else{
			alert("发生异常"+data.msg);
		}
	},
	error:function(){
		alert("error");
	}
})