jQuery(function($) {

    mydatatables = $('#mydatatables').DataTable(
        {
            "lengthMenu" : [ [ 2, 10, 20, 50, 1000 ],
                [ 2, 10, 20, 50, "All" ] ],
            "pageLength" : 2,
            "searching" : true,
            "ordering" : true,
            "processing" : true,
            "serverSide" : true,
            "autoWidth" : false,
            "dom": '<"top"f >rt<"bottom"ilp><"clear">',//dom定位
            "dom": 'tiprl',//自定义显示项
            //跟数组下标一样，第一列从0开始，这里表格初始化时，
            //第四列默认降序

            "ajax" : {
                "url" : "/scene/doScene.do",
                "type" : "POST",
                "data" : function(pdata) {
                    /* pdata.search = {
                        "value" : $("#searchName").val(),
                        "regex" : "false"
                    }; */

                    pdata.searchColumns={
                        "searchName":$("#searchName").val(),
                        "tagName":$("#tagName").val()
                    }
                    var data = JSON.stringify(pdata);

                    return data;
                },
                dataType : "json",
                processData : false,
                contentType : 'application/json',
                error:function(data,e){
                    console.log(data);

                }
            },
            "columns" : [ {
                "data" : "scenicId"
            }, {
                "data" : "scenicName"
            }, {
                "data" : "scenicDescription",
                "width": "40%"
                // "render": function (data, type, full, callback) {
                //     //类型：0导航菜单；1操作按钮。
                //     switch (data) {
                //         case 0: return "男"; break;
                //         case 1: return "女"; break;
                //     }
                // }
            }, {
                "data" : "scenicCost"
            }, {
                "data" : "scenicPhone"
            },{
                "data" : "scenicTag",
                "render": function (data, type, full, callback) {
                    //类型：0导航菜单；1操作按钮。
                    if(data!=null){
                        return data;
                    }else {
                        return "";
                    }
                }
            }],
            "columnDefs" : [
                {
                    "targets" : [ 1,2,3,5,6 ],
                    "orderable" : false,
                    "visible" : true,
                    "searchable" : true,
                },

                {
                    "width": "10%",
                    "render" : function(data, type, row) {
                        //row.account
                        return '<a href="/scene/one.do?scenicId='+row.scenicId+'"  data-rel="tooltip" title="Edit">修改</a>&nbsp;&nbsp;'
                                + '<a href="javascript:deleteScene('+row.scenicId+');" id="delete" title="Delete">删除</a>';
                    },
                    "targets" : 6
                } ],


        });

    $("#search").click(function() {
//            var args = mydatatables.ajax.params();

        mydatatables.ajax.reload();
    });




    //全选
    $('table th input:checkbox').on(
        'click',
        function() {
            var that = this;
            $(this).closest('table').find(
                'tr > td:first-child input:checkbox').each(
                function() {
                    this.checked = that.checked;
                    $(this).closest('tr').toggleClass(
                        'selected');
                });

        });

});

function deleteScene(scenicId) {
    $("#isDelete").attr("data-id",scenicId);
    $('#myModal').modal('show');
}

$("#isDelete").click(function () {
   var scenicPhotoId= $("#isDelete").attr("data-id");
    $('#myModal').modal('hide');
    $.ajax({
        url:"/scene/delete.do",
        type:"POST",
        dataType:'JSON',
        data:{"scenicPhotoId":scenicPhotoId},
        error:function(){
            window.location.href="/admin/error.do";
        },
        success:function(data){
            if(data["result"]==1){
                mydatatables.ajax.reload();
            }
        }
    });
});
// function del(id){
//     if(window.confirm("你确定要删除？")){
//         $.getJSON("${path}/organization/doDel.action?id="+id,
//             function(data){
//                 alert(data.msg);
//                 if(data.status==1){
//                     mydatatables.ajax.reload();
//                 }
//             });
//     }
// }