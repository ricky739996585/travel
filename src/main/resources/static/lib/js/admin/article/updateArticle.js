//提交表单前，对表单进行校验
$("#pass").click(function(){
    $.ajax({
        url:"/article/pass.do",
        type:"POST",
        data:{"articleId":$("#articleId").val()},
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

$("#notPass").click(function(){
    $.ajax({
        url:"/article/notPass.do",
        type:"POST",
        data:{"articleId":$("#articleId").val()},
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
