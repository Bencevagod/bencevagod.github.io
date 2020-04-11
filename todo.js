
$('button').click (() => {
    let todo = document.getElementById("input").value;
    const check = document.createElement("input");
    const button = document.createElement("button");
    check.type = "checkbox";
    $('ul').append(`<li>${todo}</li>`);
    if ($("li").contains('input')===false) {
        $('li').append(check, button);
        }
    $('input').val('');
})

$('li').click (() => {
    $('li').css('color', 'lightgrey')
})