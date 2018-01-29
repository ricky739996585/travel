$(function () {
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

                    if (1 === picId) {
                        defaultImg(picId, true);
                    }
                    pictureUploading = false;

                });
                $("#RoomInfo1_RoomPicture" + picId).click();

                //设置默认图片
//              $(".previewBox").click(function () {
//                  var _picId = parseInt($(this).parent(".image_container").attr("data-picId"));
//                  $(".image_container").each(function () {
//                      var i = parseInt($(this).attr("data-picId"));
//                      if (i === _picId)
//                          defaultImg(i, true);
//                      else
//                          defaultImg(i, false);
//                  });
//              });

                //删除上传的图片
                $(".delImg").click(function () {
                    var _picId = parseInt($(this).parent().parent(".image_container").attr("data-picId"));
                    $(".image_container[data-picid='" + _picId + "']").remove();
                    if ($(".image_container").length > 0 && $(".defaultImg").length < 1) {
                        $(".image_container").each(function () {
                            var i = parseInt($(this).attr("data-picId"));
                            defaultImg(i, true);
                            return false;
                        });
                    }

                });

            });

            function defaultImg(picId, selected) {
                if (!picId) return;
                if (!!selected) {
                    $("#RoomInfo1_RoomPictureHidDefault" + picId).val(1);
                    $("#previewBox" + picId).addClass("defaultImg");
                }
                else {
                    $("#RoomInfo1_RoomPictureHidDefault" + picId).val(0);
                    $("#previewBox" + picId).removeClass("defaultImg");
                }
            }
        });