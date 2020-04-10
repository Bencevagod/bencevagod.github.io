
$('button').click (() => {
    let todo = document.getElementById("input").value;
    $('ul').append(`<li>${todo}</li>`);
    $('input').val('')
})

$('li').click (() => {
    $('li').css('color', 'lightgrey')
})