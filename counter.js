let num = 0;
$('#increase').click(() => {
    num++;
    $('#number').text(num);
})

$('#decrease').click(() => {
    num--;
    $('#number').text(num);
})