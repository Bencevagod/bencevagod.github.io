
$('button').click (() => {
    let todo = document.getElementById("input").value;
    console.log(todo);
    $('ul').append(`<li>${todo}</li>`);
    $('input').val('')
})

$('li').click (() => {
    $('li').css('text-decoration', 'line-through')
})