//==========1=========
function hello() {
    console.log('hello');
}
hello();
console.log('Dojo');


//=========2=============
function hello() {
    console.log('hello');
    return 15;
}
var result = hello();
console.log('result is', result);


//========3=======
function numPlus(num) {
    console.log('num is', num);
    return num+15;
}
var result = numPlus(3);
console.log('result is', result);


//=========4===============
var num = 15;
console.log(num);
function logAndReturn(num){
   console.log(num);   
   return num;
}
var result = logAndReturn(10);
console.log(result);
console.log(num);


//==========5============
function looping(x,y){
    for (var i=0;i<x;i++){
    for (var j=0;j<y;j++){
        console.log(i*j);
    }
    }

    return x*y;
}
z = looping(2,3);
console.log(z);

function maxMinAvg(arr) {
    var arrnew= [];
    var max=arr[0];
    for(var i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];

        }
    }
    arrnew.push(max);
    return arrnew; 
}

for(var i=0;i<10;i++){
    console.log(i);
    i=i+3;
}