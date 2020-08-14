var check1=document.getElementById('buy');
var check2=document.getElementById('sold')
var username=document.querySelector('#uname');
var userpassword=document.querySelector('#upass');
var log=document.querySelector('#log');

check1.addEventListener("click", function f(){
this.className='checked';
check2.className='check';
    log.addEventListener("click",function login(){
        $.getJSON("loginCheck",
            {"username":username.value,"password":userpassword.value},
            function(data){
                if(data){
                    buy();
                }else{
                    alert("用户名或密码错误");
                }
            })
    })
});

check2.addEventListener("click", function f(){
    this.className='checked';
    check1.className='check';
    log.addEventListener("click",function login(){
        $.getJSON("loginCheck",
            {"username":username.value,"password":userpassword.value},
            function(data){
                if(data){
                    rooter();
                }else{
                    alert("用户名或密码错误");
                }
            })
    })
});

function buy() {
    window.location.href = "web-hid/buy.html";
}
function rooter() {
    window.location.href = "web-hid/rooter.html";
}