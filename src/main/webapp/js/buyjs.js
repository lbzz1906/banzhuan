var datas = [
    {}
];
var em = [{pic: picv, nam: namv, num: numv, des: desv, shop: shopv, pri: priv}];
nam.value = '';
pri.value = '';
num.value = '';
des.value = '';
shop.value = '';
pic.value = '';

$.getJSON("/getAllGoods", {}, function (data) {
    $(data).each(function (i, o) {
        alert(o.goodsId + "||" + o.goodsName + "||" + o.goodsPrice +
            "||" + o.goodsImage + "||" + o.categoryId + "||" + o.goodsDescribe + "||" + o.shopsName + "||");
        pic.nodeValue = o.goodsImage;
        nam.nodeValue = o.goodsName;
        num.nodeValue = o.goodsId;
        des.nodeValue = o.goodsDescribe;
        shop.nodeValue = o.shopsName;
        pri.nodeValue = o.goodsPrice;
        for (i in em.length) {
            datas.push(em[i]);
        }
    })
})


var tbody = document.querySelector('ul');
for (var i = 0; i < datas.length; i++) {
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
    img.innerHTML = datas[i].pic;
    nam.innerHTML = datas[i].nam;
    num.innerHTML = datas[i].num;
    des.innerHTML = datas[i].des;
    shop.innerHTML = datas[i].shop;
    pri.innerHTML = datas[i].pri;
    but.innerHTML = "购买";
}