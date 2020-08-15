    $.getJSON("/getAllGoods",{},function(data){
        $(data).each(function(i,o){
            alert(o.goodsId+"||"+o.goodsName+"||"+o.goodsPrice+
                "||"+o.goodsImage+"||"+o.categoryId+"||"+o.goodsDescribe+"||"+o.shopsName+"||");
        })
    })

datas = [
    {
        pic: 'srcc',
        nam: '小米10',
        num: 110,
        des: "很好的板砖,买不了吃亏",
        shop: "淘一淘",
        pri: 2000,
    }, {
        pic: 'srcc',
        nam: '华为·没他',
        num: 111,
        des: "买不了上当",
        shop: "华为旗舰",
        pri: 2001,
    }
];

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
    but.innerHTML="购买";
}