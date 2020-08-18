but.addEventListener("click",function f() {
    $.getJSON("/addShops",
        {"shopsName":$('#nam').val(),"shopsPhone":$('#pho').val(),
            "shopsEmail":$('#ema').val(),"usersName":sessionStorage.getItem("username"),"shopsAddress":$('#adr').val()},
        function (data) {
            if(data){
                alert("注册店铺成功")
                window.location.href="shopmsg.html";
            }else {
                alert("注册店铺失败")
            }
        }
    )
})