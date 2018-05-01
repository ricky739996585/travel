var InterValObj; //timer变量，控制时间
var count = 60; //间隔函数，1秒执行
var curCount;//当前剩余秒数

function login() {
    var email=$("#email").val();
    var code=$("#code").val();
    var sessionId=$("#sessionId").val();
    if(!checkEmail(email)){
        alert("请输入正确邮箱格式！");
        return false;
    }
    if(isNull(code)){
        alert("请填写完整内容！");
        return false;
    }
    if(isNull(sessionId)){
        alert("请点击验证码发送！");
        return false;
    }

    //向后台发送处理数据
    $.ajax({
        type: "POST", //用POST方式传输
        dataType: "json", //数据格式:JSON
        url: '/userWeb/login.do', //目标地址
        data: {"email":email,"code":code,"sessionId":sessionId},
        error: function (){
            window.location.href="/admin/error.do";
        },
        success: function (data){
            var result=data.result;
            if(result==1){
                alert(data.msg);
                window.location.href=data.url;
            }else {
                alert(data.msg);
            }
        }
    });
}

function cancel() {
    //向后台发送处理数据
    $.ajax({
        type: "POST", //用POST方式传输
        dataType: "json", //数据格式:JSON
        url: '/userWeb/cancel.do', //目标地址
        data: {},
        error: function (){
            window.location.href="/admin/error.do";
        },
        success: function (data){
            var result=data.result;
            if(result==1){
                alert(data.msg);
                window.location.href=data.url;
            }else {
                alert(data.msg);
            }
        }
    });
}



function sendMessage() {
    curCount = count;
    var email=$("#email").val();
    if(!checkEmail(email)){
        alert("请输入正确邮箱格式！");
        return false;
    }

    //设置button效果，开始计时
    $("#btnSendCode").attr("disabled", "true");
    $("#btnSendCode").val(curCount + "秒");
    InterValObj = window.setInterval(SetRemainTime, 1000); //启动计时器，1秒执行一次
    //向后台发送处理数据
   $.ajax({
       type: "POST", //用POST方式传输
       dataType: "json", //数据格式:JSON
       url: '/userWeb/sendEmail.do', //目标地址
       data: {"email":email},
       error: function (){
           window.location.href="/admin/error.do";
       },
       success: function (data){
           var result=data.result;
           if(result==1){
               var sessionId=data.data.sessionId;
               $("#sessionId").val(sessionId);
               alert(data.msg);
           }else {
               alert(data.msg);
           }
       }
   });
}

//timer处理函数
function SetRemainTime() {
    if (curCount == 0) {
        window.clearInterval(InterValObj);//停止计时器
        $("#btnSendCode").removeAttr("disabled");//启用按钮
        $("#btnSendCode").val("重新发送验证码");
    }
    else {
        curCount--;
        $("#btnSendCode").val(curCount + "秒");
    }
}

//判断用户输入的电子邮箱格式是否正确
function checkEmail(email){
    var myReg=/^[a-zA-Z0-9_-]+@([a-zA-Z0-9]+\.)+(com|cn|net|org)$/;

    if(myReg.test(email)){
        return true;
    }else{
        return false;
    }
}

function isNull (str) {
    if(str==null||str==""){
        return true;
    }
}