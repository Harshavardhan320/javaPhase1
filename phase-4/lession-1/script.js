console.log("A Text From javaScript Page");
var roll =581;
var b="b";
var c="h";
var a = 3, b=4 ,c='hello';
console.log(a,b,c);
console.log("concations "+ b+roll);
var z=2,r=4,y=6;
alert("i am harsha")
var s = prompt( "Enter your name" );
// alert( "Hello, " + s + "!" );
// console.log(b+s);
var details ={firstname:"    harsha", lastname:"vardhan"}
document.write("Small text content from the javaScript:Firstname: "+details.firstname+" Lastname: "+details.lastname);
console.log(details.sirname="katukojwala")
console.log(details)

var values = {firstperson:{name1:"vardhan", age:27}, secondperson:{name1 :"harsha",age:22}};





document.write("<h1>JavaScript Arrays</h1>");
var personnames=[["harsha", "vardhan"], ["katukojwala", "harshavardhan",3],["ranadeep", "jaya veerash"],[1,2,11,0,4,7]];
document.write("Firstname "+personnames[0][0]);
document.write("lastname "+personnames[0][1]);

document.write("Firstname "+personnames[1][0]);
document.write("lastname "+personnames[1][1]);

document.write("Firstname "+personnames[2][0]);
document.write("lastname "+personnames[2][1]);

// console.log("sorted array "+personnames.sort());
console.log("sorted array "+personnames[1].sort());


document.write("<h3>combination of arrays and objects</h3><p><del>Below content from the java script</del></p>");

var  arr1=[{username:"harsha", password:"vardhan", age:34}, {username:"mphasis", password:"Mphasis",}];
document.write(arr1[0].username+" username whith password "+arr1[0].password);

var a = {"s","as","s"};
for(var i in a){
      console.log(typeof i);
}
for(x of a){
      console.log(typeof a);
}
for(var h=0; h<a.length; h++){
      console.log(typeof h);
}