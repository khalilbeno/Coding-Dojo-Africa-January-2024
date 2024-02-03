function reverseArr(arr){
    var reverseArr=[];
    for(var i=arr.length-1;i>=0;i--){
        reverseArr[arr.length-1-i]=arr[i];
        }   
        return reverseArr;
    
}
var exmp=["a","b","c","d"];
var reverseArr=reverseArr(exmp)
console.log(reverseArr);