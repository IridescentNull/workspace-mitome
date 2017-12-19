document.write("Hello World!<br>");
document.write("CBに行き詰りつつつつあるので、ひとまずグリデルを組んでみました。<br>")
confirm("うぉーにん")//落書き
/*落書き
うおーーーーーーー
うおーーーーーーー*/

var name ="高橋";
document.write(name);
document.write("<br>");
var n =((3+3)/-3)%-1;
document.write(n+"<br>");
document.write(n++ +"<br>");
document.write(++n+"<br>");
document.write(++n+"<br>");
document.write(n++ +"<br>");
document.write(n++ +"<br>");
document.write(n+"<br>");

var a=70;
var b=90;
if (a>70&&b>70){
    document.write("合格")
}
else document.write("不合格")

switch(a){
    case 70:
    document.write("<br>aは70");
    break;
        
    default:
    alert("aが70でない！")
}

switch(b){
    case 90:
        document.write("<br>bは90");
        break;
}
document.write("<br>")
for(var i=1;i<=9;i++){
    for(var d=1; d<=9;d++){
        document.write(" "+i*d)
    }
    document.write("<br>")
}

var i = 1
while(i<8000){
    if(i%3==0){document.write(" "+i);}
    i+=7;
}


var i=10909;
document.write("<br><br><br>"+i+"の素数判定<br>");
var a=2;
var x=0;
for(var a; a<(i^0.5);a++) {
    if(i%a==0){var x = 1};}

if(x==0){
    document.write(i+"は素数です");}
else {document.write(i+"は合成数です");}

switch(x){
    case 0: 
    document.write("<br>"+i+"は素数です");
    break;
    
    default: document.write("<br>"+i+"は合成数です");}
document.write("<br><br><br>"+x+"<br>");

var myoji=["田中","鈴木","伊藤","権藤","権藤","雨","権藤","雨","雨","権藤","雨","権藤"];
myoji.pop();
myoji.unshift("デデデ大王");
myoji.push("解体屋")
myoji.shift();
document.write(myoji);
document.write("<br>");
document.write(myoji[5]);
document.write("<br>");
document.write("<br>");
document.write("<br>");
document.write("<br>");


function area(tate,yoko){
    return "面積は"+tate*yoko+"です。";
}

document.write(area(8,9));