$.getJSON("/getAllGoods",
    {},
    function (data) {
        $(data).each(function (i, o) {
            $("table").append("<tr><td>" + "<img src='" + o.goodsImage + "'>" + "</td><td>" + o.goodsId + "</td><td>" + o.goodsName +
                "</td><td>" + o.goodsDescribe + "</td><td>" + o.shopsName + "</td><td>" + o.goodsPrice + "</td></tr>");
        })
    }
)




var nam = document.getElementById('nam');
var pri = document.getElementById('pri');
var but = document.getElementById('but');
var num = document.getElementById('num');
var des = document.getElementById('des');
var shop = document.getElementById('shop');
var tbody = document.querySelector('tbody');

var em = [];
var datas = [{}];
but.addEventListener('click', function () {
    var namv = nam.value;
    var priv = pri.value;
    var numv = num.value;
    var desv = des.value;
    var shopv = shop.value;
    $.getJSON("/addGoods",
        {"goodsName": namv, "goodsPrice": priv,"goodsDescribe":desv,"categoryId":numv,"shopsName":shopv},
        function (data) {
            if (data) {
                alert("请添加图片");
            } else {
                alert("添加失败");
            }
        }
    )

    em = [{num: numv, name: namv, des: desv, shop: shopv, pri: priv}];
    nam.value = '';
    pri.value = '';
    num.value = '';
    des.value = '';
    shop.value = '';
    if (namv.length === 0) {
        alert('请输入名称');
        return;
    } else {
        if (priv.length === 0) {
            alert('请输入价格');
            return;
        } else {
            for (var i = 0; i < em.length; i++) {
                datas.push(em[i]);
            }
        }
    }

    var tr = document.createElement('tr');
    var li = document.createElement("b");
    li.innerHTML = '<img src="" height="100" alt="img..."><br>';

    tbody.appendChild(tr);
    tr.appendChild(li);
    var i = datas.length - 1;
    for (k in datas[i]) {
        var td = document.createElement("td");
        tr.appendChild(td);
        td.innerHTML = datas[i][k];
    }
    // var del = document.createElement('td');
    // del.innerHTML = '<a id="dell" href="javascript:;">删除</a>';
    // tr.appendChild(del);
    return datas.length - 1;
})
var as = document.querySelectorAll('a');
for (var i = 0; i < as.length; i++) {
    as[i].onclick = function () {
        // node.removeChild(child); 删除的是 li 当前a所在的li  this.parentNode;
        alert("vbnm")
    }
}

function previewFile() {
    const preview = document.querySelectorAll('img');
    const file = document.querySelector('input[type=file]').files[0];
    var formData = new FormData();
    formData.append('file', file);
    const reader = new FileReader();
    var btn = document.querySelector(".btns");
    var inp = document.querySelectorAll("input");
    reader.addEventListener("load", function () {
        preview[preview.length - 1].src = reader.result;

        $.ajax({
            type: 'post',
            url: "http://localhost:8080/addImage",
            data: formData,
            dataType: 'json',
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                console.log(data)
            },
            error: function (err) {
                console.log(err)
            }
        });

    }, false);

    if (file) {
        reader.readAsDataURL(file);
    }
}