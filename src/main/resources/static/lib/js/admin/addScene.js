//提交表单前，对表单进行校验
$("#add").click(function(){
	if(checkInput("scenicName")){
		return;
	}
    $("#SceneForm").submit();
});

//提交景点表单的操作，配置
$("#SceneForm").submit(function(e){
    e.preventDefault();
    $.ajax({
        url:"/scene/insert.do",
        type:"POST",
        data:$("#SceneForm").serialize(),
        error:function(){
            $('#myModal').modal('show');
        },
        success:function(data){
            if(data["result"]==1){
                uploadPic(data["scenicId"]);
            }else {
                $('#myModal').modal('show');
            }
        }

    });

});

//提交照片表单的操作，配置
function uploadPic(scenicId) {
    var formData = new FormData($("#Form1")[0]);
    formData.append("scenicId",scenicId);
    $.ajax({
        url:"/scene/insertPic.do",
        type:"POST",
        async: false,
        cache: false,
        contentType: false,
        processData: false,
        data:formData,
        error:function(){
            window.location.href="/admin/error.do";
        },
        success:function(data){
            if(data["result"]==1){
                window.location.href=data["url"];
            }else {
                $('#myModal').modal('show');
            }
        }

    });

}


//检验元素的文字长度
function checkInput(inputId){
	var len=$("#"+inputId).val().length;
	if(len>200){
		alert("文字太长!");
		return true;
	}
}
