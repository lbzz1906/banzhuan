 $.getJSON("/getShops",
     {"username":sessionStorage.getItem("username")},
     function (data) {
        if(data.shopsName==null){
            alert("您还没有注册店铺，请先注册");
            window.location.href="shopregister.html";
        }
         $('#nam').val(data.shopsName);
         $('#pho').val(data.shopsPhone);
         $('#ema').val(data.shopsEmail);
         $('#adr').val(data.shopsAddress);
         but.addEventListener("click",function f() {
             $.getJSON("/updateShops",
                 {"shopsName":$('#nam').val(),"shopsPhone":$('#pho').val(),
                     "shopsEmail":$('#ema').val(),"usersName":sessionStorage.getItem("username"),"shopsAddress":$('#adr').val()},
                 function (data) {
                     if(data){
                         window.location.reload();
                     }else {
                         alert("修改店铺失败")
                     }
                 }
             )
         })
     })

