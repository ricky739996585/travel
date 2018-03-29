//提交表单前，对表单进行校验
$("#save").click(function(){
    var listObj=$("input:checkbox[name='perimission']");
    var newAuths=new Array(listObj.length);
    var listObj2=$("input:checkbox[name='oldAuths']");
    var oldAuths=new Array(listObj2.length);
    for(var i=0;i<listObj.length;i++){
        if(listObj[i].checked==true){
            newAuths[i]=1;
        }else {
            newAuths[i]=0;
        }
    }
    for(var i=0;i<listObj2.length;i++){
        oldAuths[i]=listObj2[i].value;
    }
    $.ajax({
        url:"/adminUser/divideAuth.do",
        type:"POST",
        data:{"newAuths":newAuths,"oldAuths":oldAuths,"adminId":$("#adminId").val()},
        error:function () {
            $('#myModal').modal('show');
        },
        success:function (data) {
            if(data["result"]==1){
                 window.location.href=data["url"];
            }else {
                $('#myModal').modal('show');
            }
        }
    });
});

//提交景点表单的操作，配置
$("#CateForm").submit(function(e){
    e.preventDefault();
    $.ajax({
        url:"/cate/update.do",
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