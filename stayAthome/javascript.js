$('#first').click(() => {
    console.log(`Yeah you clicked me!`);
})

$('#second').click(() => {
    $(`#first`).text(`Changed text`);
})

let noMoreChange = false;
$('#third').click(() => {
    let color = document.getElementById("input").value;
    if (noMoreChange === false) {
        $('button').css('background', color);
        noMoreChange = true;
    }
    $('input').val('');
    $('button').css('color', 'white');
    $('button').css('font-size', '20px');
    $('button').css('border-radius', '10px');
})