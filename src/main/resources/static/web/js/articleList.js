$(document).ready(function () {

    $.ajax({
        url:"/articleWeb/getList.do",
        type:"POST",
        dataType:'JSON',
        data:{"search":$("#search").val(),"offset":0,"limit":6},
        error:function(){
            window.location.href="/admin/error.do";
        },
        success:function(data){
            $("#content").text("");
            var content="";
            var arr=data.articleList;
            var total=data.total;
            var sum=0;
            content+='<h3>Article</h3>';
            for(var i=0;i<arr.length;i+=3){
                content+='<div class="services-grd">';
                for(var j=0;j<3&&sum<arr.length;j++){
                    content +=''
                        +'<div class="col-md-4 services-grd1">'
                        +'<div class="col-xs-3 services-grd1-left">'
                        +'<span class="glyphicon glyphicon-send" aria-hidden="true"></span>'
                        +'</div>'
                        +'<div class="col-xs-9 banner-bottom-grid-left banner-bottom-grid-l">'
                        +'<h4>'+arr[sum].title+'</h4>'
                        +'<ul>'
                        +'<li><a><span class="glyphicon glyphicon-heart" aria-hidden="true"></span>'+arr[sum].like+'人 喜欢 </a></li>'
                        +'<li><a><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>笔者：'+arr[sum].author+'</a></li>'
                        +'<li><a><span class="glyphicon glyphicon-tag" aria-hidden="true"></span>'+arr[sum].tag+'</a></li>'
                        +'<li><a><span class="glyphicon glyphicon-time" aria-hidden="true"></span>'+arr[sum].time+'</a></li>'
                        +'</ul></div>'
                        +'<div class="clearfix"> </div>'
                        +'</div>';
                    sum++;
                }
                content+='<div class="clearfix"> </div>';
                content+='</div>';
            }
            $("#content").html(content);
        }
    });
    $("#doSearch").click(function () {
        $.ajax({
            url:"/articleWeb/getList.do",
            type:"POST",
            dataType:'JSON',
            data:{"search":$("#search").val(),"offset":0,"limit":6},
            error:function(){
                window.location.href="/admin/error.do";
            },
            success:function(data){
                $("#content").text("");
                var content="";
                var arr=data.articleList;
                var total=data.total;
                var sum=0;
                content+='<h3>Article</h3>';
                for(var i=0;i<arr.length;i+=3){
                    content+='<div class="services-grd">';
                    for(var j=0;j<3&&sum<arr.length;j++){
                        content +=''
                            +'<div class="col-md-4 services-grd1">'
                            +'<div class="col-xs-3 services-grd1-left">'
                            +'<span class="glyphicon glyphicon-send" aria-hidden="true"></span>'
                            +'</div>'
                            +'<div class="col-xs-9 banner-bottom-grid-left banner-bottom-grid-l">'
                            +'<h4>'+arr[sum].title+'</h4>'
                            +'<ul>'
                            +'<li><a><span class="glyphicon glyphicon-heart" aria-hidden="true"></span>'+arr[sum].like+'人 喜欢 </a></li>'
                            +'<li><a><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>笔者：'+arr[sum].author+'</a></li>'
                            +'<li><a><span class="glyphicon glyphicon-tag" aria-hidden="true"></span>'+arr[sum].tag+'</a></li>'
                            +'<li><a><span class="glyphicon glyphicon-time" aria-hidden="true"></span>'+arr[sum].time+'</a></li>'
                            +'</ul></div>'
                            +'<div class="clearfix"> </div>'
                            +'</div>';
                        sum++;
                    }
                    content+='<div class="clearfix"> </div>';
                    content+='</div>';
                }
                $("#content").html(content);
            }
        });
    });


});