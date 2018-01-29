//提交表单前，对表单进行校验
$("#add").click(function(){
	if(checkInput("cateName")){
		return;
	}
    $("#CateForm").submit();
});

//提交景点表单的操作，配置
$("#CateForm").submit(function(e){
    e.preventDefault();
    $.ajax({
        url:"/cate/insert.do",
        type:"POST",
        data:$("#CateForm").serialize(),
        error:function(){
            $('#myModal').modal('show');
        },
        success:function(data){
            if(data["result"]==1){
                window.location.href=data["url"];
            }else {
                $('#myModal').modal('show');
            }
        }

    });

});


//检验元素的文字长度
function checkInput(inputId){
	var len=$("#"+inputId).val().length;
	if(len>200){
		alert("文字太长!");
		return true;
	}
}
