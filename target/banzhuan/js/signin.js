var userphone=document.querySelector('#uphone');
var useremail=document.querySelector('#uemail');
var username=document.querySelector('#uname');
var userpassword=document.querySelector('#upass');
var log=document.querySelector('#log');
var check1=document.querySelector('#man');
var check2=document.querySelector('#woman');
var sex='undefined';
check1.addEventListener("click", function f1(){
    this.className='checked';
    check2.className='check';
    sex='男';

});

check2.addEventListener("click", function f2(){
    this.className='checked';
    check1.className='check';
    sex='女';
});

log.addEventListener("click",function addUser() {
    $.getJSON("/registerInsert",
        {"usersPhone":userphone.value,"usersEmail":useremail.value,"usersSex":sex,"usersName":username.value,"usersPassword":userpassword.value},
        function(data){
            if(!data){
                alert("注册失败");
            }else{
                window.location.href = "../login.html";
            }
        })
})