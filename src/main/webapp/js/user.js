$.getJSON("/getUserByUserName",
    {"username":sessionStorage.getItem("username")},
    function (data) {
        $('#nam').val(data.usersName);
        $('#sex').val(data.usersSex);
        $('#pho').val(data.usersPhone);
        $('#ema').val(data.usersEmail);
        $('#pas').val(data.usersPassword);
        $('#adr').val(data.address);
        var but= document.querySelector('#but');
        but.addEventListener("click",function f() {
                $.getJSON("/updateUsersMsg",
                    {"usersName":$('#nam').val(),"usersSex":$('#sex').val(),"usersPhone":$('#pho').val(),
                            "usersEmail":$('#ema').val(),"usersPassword":$('#pas').val(),"address":$('#adr').val(),},
                    function (data) {
                            if(data){
                                    window.location.reload();
                            }else {
                                    alert("修改信息失败")
                            }
                    }
                )
        })
    }

)