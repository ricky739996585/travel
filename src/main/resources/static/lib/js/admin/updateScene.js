//初始化数据
$(function () {
    loadPic();
    var picId = 0;
    var pictureUploading = false;
    $("#Form1").delegate(".addImg", "click", function () {
        if (!!pictureUploading) return;
        pictureUploading = true;

        picId = parseInt($(this).attr("data-picId"));
        picId++;
        $(this).attr("data-picId", picId);

        $(this).before("<div class=\"image_container\" data-picId=\"" + picId + "\">"
            + "<input id=\"RoomInfo1_RoomPicture" + picId + "\" name=\"file" + "\" type=\"file\" accept=\"image/jpeg,image/png,image/gif\" style=\"display: none;\" />"
            + "<input id=\"RoomInfo1_RoomPictureHidDefault" + picId + "\" name=\"RoomInfo1_RoomPictureHidDefault" + picId + "\" type=\"hidden\" value=\"0\" />"
            + "<a href=\"javascript:;\" id=\"previewBox" + picId + "\" class=\"previewBox\">"
            + "<div class=\"delImg\">&times;</div>"
            + "<img id=\"preview" + picId + "\" style=\"height:100px;width:100px;border-width:0px;\" />"
            + "</a>"
            + "</div>");

        $("#RoomInfo1_RoomPicture" + picId).change(function () {
            var $file = $(this);
            var fileObj = $file[0];
            var windowURL = window.URL || window.webkitURL;
            var dataURL;

            $("#previewBox" + picId).css("display", "inline-block");
            var $img = $("#preview" + picId);
            //var $img = $("#preview1");

            if (fileObj && fileObj.files && fileObj.files[0]) {
                dataURL = windowURL.createObjectURL(fileObj.files[0]);
                $img.attr('src', dataURL);
            } else {
                dataURL = $file.val();
                var imgObj = $img; //document.getElementById("preview");
                // 两个坑:
                // 1、在设置filter属性时，元素必须已经存在在DOM树中，动态创建的Node，也需要在设置属性前加入到DOM中，先设置属性在加入，无效；
                // 2、src属性需要像下面的方式添加，上面的两种方式添加，无效；
                imgObj.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
                imgObj.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = dataURL;
            }
            pictureUploading = false;

        });
        $("#RoomInfo1_RoomPicture" + picId).click();


        //删除上传的图片
        $(".delImg").click(function () {
            var _picId = parseInt($(this).parent().parent(".image_container").attr("data-picId"));
            $(".image_container[data-picid='" + _picId + "']").remove();

        });
    });
    //加载已存在图片
    function loadPic() {
        var size=$("#photoSize").val();
        for(var j=0;j<size;j++){
            var id=j;
            $("#box" + id).css("display", "inline-block");
            var $img = $("#view" + id);
            var imgObj = $img; //document.getElementById("view");
            imgObj.css({"filter":"progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)"});
        }

        $(".delImg").click(function () {
            var scenicPhotoId = parseInt($(this).parent().parent(".image_container").attr("data-id"));
            var id=parseInt($(this).parent().parent(".image_container").attr("id"));
            var url=$("#view"+id).attr("src");
            //删除指定图片
            $.ajax({
                url:"/scene/deletePic.do",
                type:"POST",
                dataType:'JSON',
                data:{"url":url,"scenicPhotoId":scenicPhotoId},
                error:function(){
                    window.location.href="/admin/error.do";
                },
                success:function(data){
                    if(data["result"]==1){
                        // window.location.href=data["url"];
                    }else {
                        $('#myModal').modal('show');
                    }
                }
            });

            $(".image_container[data-id='" + scenicPhotoId + "']").remove();
        });
    }
});



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
        url:"/scene/update.do",
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
