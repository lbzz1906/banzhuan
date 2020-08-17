var picv = 'pic';
var namv = 'nam';
var numv = 'num';
var desv = 'des';
var shopv = 'shop';
var priv = 'pri';

$.getJSON("/getAllGoods", {}, function (data) {
    // $(data).each(function (i, o) {
    //     picv = o.goodsImage;
    //     namv = o.goodsName;
    //     numv = o.goodsId;
    //     desv = o.goodsDescribe;
    //     shopv= o.shopsName;
    //     priv = o.goodsPrice;
    //     console.log(o)
    // var tbody = document.querySelector('ul');
    // var li = document.createElement('li');
    // tbody.appendChild(li);
    // var img = document.createElement("img");
    // var nam = document.createElement("h3");
    // var num = document.createElement("p");
    // var des = document.createElement("p2");
    // var shop = document.createElement("p3");
    // var pri = document.createElement("p4");
    // var but = document.createElement("button")
    // li.appendChild(img);
    // li.appendChild(nam);
    // li.appendChild(num);
    // li.appendChild(des);
    // li.appendChild(shop);
    // li.appendChild(pri);
    // li.appendChild(but);
    // img.src = picv;
    // nam.innerHTML = namv;
    // num.innerHTML = numv;
    // des.innerHTML = desv;
    // shop.innerHTML = shopv;
    // pri.innerHTML = priv;
    // but.innerHTML = "购买";
    //
    //     var btn = document.querySelector('button');
    //     btn.addEventListener('click', function () {
    //         var a = btn.parentNode;
    //         var nam = a.children[1].innerHTML;
    //         var shop = a.children[4].innerHTML;
    //         var pri = a.children[5].innerHTML;
    //         $.getJSON("/addOrderAndTurnover",
    //             {"goodsName":nam,"shopsName":shop,"ordersTotalMoney":pri,"ordersConsigneeName":localStorage.getItem('username')},
    //             function (data) {
    //                 if(data){
    //                     location.href="orders.html";
    //                 }else {
    //                     alert("添加订单出错");
    //                 }
    //
    //             }
    //         )
    //     })
    //     }
    //     )

    for(let i=0;i<data.length;i++){
        $('.box2').append("<li>"+"<img src='"+data[i].goodsImage+"'>"+"<h3 id='1'>"+data[i].goodsName+"</h3>"+"<p>"+data[i].goodsId+"</p>"+"<p2>"+data[i].goodsDescribe+"</p2>"+"<p3>"+data[i].shopsName+"</p3>"+"<p4>"+data[i].goodsPrice+"</p4>"+"<button onclick='purchase(this)'>"+"购买"+"</button>"+"</li>");
    }
    })


    function purchase(obj) {
        console.log(obj);
        // var lis = $(obj).parent('li');

        var nam = $(obj).parent('li').children('h3').html();
        var shop = $(obj).parent('li').children('p3').html();
        var pri = $(obj).parent('li').children('p4').html();
        $.getJSON("/addOrderAndTurnover",
            {"goodsName":nam,"shopsName":shop,"ordersTotalMoney":pri,"ordersConsigneeName":localStorage.getItem('username')},
            function (data) {
                if(data){
                    location.href="orders.html";
                }else {
                    alert("添加订单出错");
                }

            }
        )
    }



