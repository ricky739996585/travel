
$(document).ready(function(){
    $("#s1").select2({
        placeholder: "请选择",
        ajax: {
            url: '/city/doCountry.do',
            data: function (params) {
                var query = {
                    countryNname: params.term,
                    // type: 'public'
                }

                // Query parameters will be ?search=[term]&type=public
                return query;
            },
            processResults: function (data) {
                var itemList = [];//当数据对象不是{id:0,text:'ANTS'}这种形式的时候，可以使用类似此方法创建新的数组对象
                var arr = data;
                // itemList.push({id:0 , text:"请选择"});
                for(item in arr){
                    itemList.push({id: Number(arr[item].countryId), text: arr[item].countryNname});
                 }
                return {
                    results: itemList
                };
            }
        },
        language: "zh-CN",
    });
    $("#s2").select2({
        placeholder: "请选择",
        data: [{id: "0", text: '请选择'}]
    });
    $("#s3").select2({
        placeholder: "请选择",
        data: [{id: "0", text: '请选择'}]
    });
});

//当国家变化时
$("#s1").change(function(){
    var countryId=$("#s1").val();
    $("#s2").empty();
    $("#s3").empty();

    $("#s3").select2({
        placeholder: "请选择",
        data: [{id: "0", text: '请选择'}]
    });

    $("#s2").select2({
        placeholder: "请选择",
        ajax: {
            url: '/city/doProvince.do',
            data: function (params) {
                var query = {
                    countryId: countryId,
                    provinceName:params.term
                    // type: 'public'
                }
                return query;
            },
            processResults: function (data) {
                var itemList = [];//当数据对象不是{id:0,text:'ANTS'}这种形式的时候，可以使用类似此方法创建新的数组对象
                var arr = data;
                // itemList.push({id:0 , text:"请选择"});
                for(item in arr){
                    itemList.push({id: Number(arr[item].provinceId), text: arr[item].provinceName});
                }
                return {
                    results: itemList
                };
            }
        },
        language: "zh-CN",
    });

    //当省份变化时
    $("#s2").change(function () {
        $("#s3").empty();
        var provinceId = $("#s2").val();
        $("#s3").select2({
            placeholder: "请选择",
            ajax: {
                url: '/city/doCity.do',
                data: function (params) {
                    var query = {
                        provinceId: provinceId,
                        cityName:params.term
                    }
                    return query;
                },
                processResults: function (data) {
                    var itemList = [];//当数据对象不是{id:0,text:'ANTS'}这种形式的时候，可以使用类似此方法创建新的数组对象
                    var arr = data;
                    // itemList.push({id:0 , text:"请选择"});
                    for(item in arr){
                        itemList.push({id: Number(arr[item].cityId), text: arr[item].cityName});
                    }
                    return {
                        results: itemList
                    };
                }
            },
            language: "zh-CN",
        });
    });
});


