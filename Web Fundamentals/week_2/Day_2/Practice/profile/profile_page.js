var req=document.querySelector(".todd");
var req2=document.querySelector(".phil");
var edit=document.querySelector(".username");
var count=document.querySelector(".nb2");
var count2=document.querySelector(".nb418");
function accept(){
    req.remove();
    count.innerText--;
    count2.innerText++;
}
function denied(){
    req.remove();
    count.innerText--;
    
}

function accept2(){
    req2.remove();
    count.innerText--;
    count2.innerText++;
}
function denied2(){
    req2.remove();
    count.innerText--;
    
}

function nb(){
    
}

function editname(){
    edit.innerText="Khalil";
}
