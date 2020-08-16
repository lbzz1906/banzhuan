var picv='pic';
var namv='nam';
var numv='num';
var desv='des';
var shopv='shop';
var priv='pri';

$.getJSON("/getAllGoods", {}, function (data) {
    $(data).each(function (i, o) {
        picv = o.goodsImage;
        namv = o.goodsName;
        numv = o.goodsId;
        desv = o.goodsDescribe;
        shopv= o.shopsName;
        priv = o.goodsPrice;
        alert(picv+" "+namv+" "+numv+" "+desv+" "+shopv+" "+priv);
        var tbody = document.querySelector('ul');

            var li = document.createElement('li');
            tbody.appendChild(li);
            var img = document.createElement("img");
            var nam = document.createElement("h3");
            var num = document.createElement("p");
            var des = document.createElement("p2");
            var shop = document.createElement("p3");
            var pri = document.createElement("p4");
            var but = document.createElement("button")
            li.appendChild(img);
            li.appendChild(nam);
            li.appendChild(num);
            li.appendChild(des);
            li.appendChild(shop);
            li.appendChild(pri);
            li.appendChild(but);
            img.innerHTML = "https://imgchr.com/i/dFvEM8";
            nam.innerHTML = namv;
            num.innerHTML = numv;
            des.innerHTML = desv;
            shop.innerHTML = shopv;
            pri.innerHTML = priv;
            but.innerHTML = "购买";

    })

})