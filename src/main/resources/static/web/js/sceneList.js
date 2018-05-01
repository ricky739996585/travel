$(document).ready(function () {

    $.ajax({
        url:"/sceneWeb/getList.do",
        type:"POST",
        dataType:'JSON',
        data:{"search":$("#search").val(),"offset":0,"limit":5},
        error:function(){
            window.location.href="/admin/error.do";
        },
        success:function(data){
            $("#content").text("");
            var content="";
            var arr=data.sceneList;
            var total=data.total;
            var sum=0;
            content+='<h3>Scene</h3>';
            for(var i=0;i<arr.length;i+=3){
                content+='<div class=\"services-overview-grids\">';
                for(var j=0;j<3&&sum<arr.length;j++){
                    content +=''
                        +'<div class="col-md-4 services-overview-grid">'
                        +'<div class="services-overview-grd">'
                        +'<img src="'+arr[sum].photoUrl+'" alt=" " class="img-responsive" style="height:190px;width: 100% "/>'
                        +'<div class="services-overview-gd">'
                        +'<h4>'+arr[sum].scenicName+'</h4>'
                        +'<p>'+arr[sum].scenicDescription+'</p>'
                        +'<ul class="social-icons">'
                        +'<li><a href="/sceneWeb/detail.do?sceneId='+arr[sum].scenicId+'" class="p"></a></li>'
                        +'<li><a href="/sceneWeb/detail.do?sceneId='+arr[sum].scenicId+'" class="in"></a></li>'
                        +'<li><a href="/sceneWeb/detail.do?sceneId='+arr[sum].scenicId+'" class="v"></a></li>'
                        +'<li><a href="/sceneWeb/detail.do?sceneId='+arr[sum].scenicId+'" class="facebook"></a></li>'
                        +'</ul></div></div></div>';
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
            url:"/sceneWeb/getList.do",
            type:"POST",
            dataType:'JSON',
            data:{"search":$("#search").val(),"offset":0,"limit":5},
            error:function(){
                window.location.href="/admin/error.do";
            },
            success:function(data){
                $("#content").text("");
                var content="";
                var arr=data.sceneList;
                var total=data.total;
                var sum=0;
                content+='<h3>Scene</h3>';
                for(var i=0;i<arr.length;i+=3){
                    content+='<div class=\"services-overview-grids\">';
                    for(var j=0;j<3&&sum<arr.length;j++){
                        content +=''
                            +'<div class="col-md-4 services-overview-grid">'
                            +'<div class="services-overview-grd">'
                            +'<img src="'+arr[sum].photoUrl+'" alt=" " class="img-responsive" style="height:190px;width: 100% "/>'
                            +'<div class="services-overview-gd">'
                            +'<h4>'+arr[sum].scenicName+'</h4>'
                            +'<p>'+arr[sum].scenicDescription+'</p>'
                            +'<ul class="social-icons">'
                            +'<li><a href="/sceneWeb/detail.do?sceneId='+arr[sum].scenicId+'" class="p"></a></li>'
                            +'<li><a href="/sceneWeb/detail.do?sceneId='+arr[sum].scenicId+'" class="in"></a></li>'
                            +'<li><a href="/sceneWeb/detail.do?sceneId='+arr[sum].scenicId+'" class="v"></a></li>'
                            +'<li><a href="/sceneWeb/detail.do?sceneId='+arr[sum].scenicId+'" class="facebook"></a></li>'
                            +'</ul></div></div></div>';
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

