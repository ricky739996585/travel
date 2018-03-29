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
                "url" : "/adminUser/doAdminUser.do",
                "type" : "POST",
                "data" : function(pdata) {
                    /* pdata.search = {
                        "value" : $("#searchName").val(),
                        "regex" : "false"
                    }; */

                    pdata.searchColumns={
                        "searchName":$("#searchName").val()

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
                "data" : "adminId"
            }, {
                "data" : "adminAccount"
            }, {
                "data" : "adminLevel",
                "render": function (data, type, full, callback) {
                    //类型：0导航菜单；1操作按钮。
                    switch (data) {
                        case 1: return "普通管理员"; break;
                        case 2: return "超级管理员"; break;
                    }
                }
            }],
            "columnDefs" : [
                {
                    "targets" : [ 1,2],
                    "orderable" : false,
                    "visible" : true,
                    "searchable" : true,
                },

                {
                    "width": "10%",
                    "render" : function(data, type, row) {
                        //row.account
                        return '<a href="/adminUser/one.do?adminId='+row.adminId+'"  data-rel="tooltip" title="Edit">分配权限</a>&nbsp;&nbsp;' +
                            '<a href="/adminUser/delete.do?adminId='+row.adminId+'"  data-rel="tooltip" title="Delete">删除</a>'
                    },
                    "targets" : 3
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

// function deleteCate(cateId) {
//     $("#isDelete").attr("data-id",cateId);
//     $('#myModal').modal('show');
// }

// $("#isDelete").click(function () {
//    var cateId= $("#isDelete").attr("data-id");
//     $('#myModal').modal('hide');
//     $.ajax({
//         url:"/cate/delete.do",
//         type:"POST",
//         dataType:'JSON',
//         data:{"cateId":cateId},
//         error:function(){
//             window.location.href="/admin/error.do";
//         },
//         success:function(data){
//             if(data["result"]==1){
//                 mydatatables.ajax.reload();
//             }
//         }
//     });
// });
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