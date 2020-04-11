//Ez egy számláló webalkalmazás

//új kód jQuery nélkül
let num = 0;
let incr = document.getElementById('increase');
let decr = document.getElementById('decrease');
let printed = document.getElementById('number');

incr.onclick=function() {
    num++;
    printed.textContent=num;
}

decr.onclick=function() {
    num--;
    printed.textContent=num;
}


/*
Régi kód jQueryvel
$('#increase').click(() => {
    num++;
    $('#number').text(num);
})

$('#decrease').click(() => {
    num--;
    $('#number').text(num);
})
*/