
$.getJSON("/getOrdersByOrdersId",
    {},
    function (data) {
         $('#num').html(data.ordersId);
        $('#time').html(data.ordersEntryTime);
     $('table').append("<tr><td>"+data.goodsName+"</td><td>"+data.ordersConsigneeName+"</td><td>"+data.ordersConsigneeAddress+
         "</td><td>"+data.ordersConsigneePhone+"</td><td>"+data.ordersTotalMoney+"</td></tr>")
    }
)