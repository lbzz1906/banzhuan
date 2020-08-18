var check1=document.getElementById('buy');
var check2=document.getElementById('sold');
var check3=document.getElementById('manager');
var username=document.querySelector('#uname');
var userpassword=document.querySelector('#upass');
var log=document.querySelector('#log');

check1.addEventListener("click", function f(){
this.className='checked';
check2.className='check';
check3.className='check';
    log.addEventListener("click",function login(){
        var usersname=username.value;
        sessionStorage.setItem('username',usersname);
        $.getJSON("loginCheck",
            {"username":username.value,"password":userpassword.value},
            function(data){
                if(data){
                    window.location.href = "web-hid/buy.html";
                }else{
                    alert("用户名或密码错误");
                }
            })
    })
});

check2.addEventListener("click", function f(){
    this.className='checked';
    check1.className='check';
    check3.className='check';
    log.addEventListener("click",function login(){
    var usersname=username.value;
        sessionStorage.setItem('username',usersname);
        $.getJSON("loginCheck",
            {"username":username.value,"password":userpassword.value},
            function(data){
                if(data){
                    window.location.href = "web-hid/solder.html";
                }else{
                    alert("用户名或密码错误");
                }
            })
    })
});

check3.addEventListener("click", function f(){
    this.className='checked';
    check1.className='check';
    check2.className='check';
    log.addEventListener("click",function login(){
        $.getJSON("managerCheck",
            {"username":username.value,"password":userpassword.value},
            function(data){
                if(data){
                    window.location.href = "web-hid/rooter.html";
                }else{
                    alert("用户名或密码错误");
                }
            })
    })
});