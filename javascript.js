$('#first').click(() => {
    console.log(`Yeah you clicked me!`);
})

$('#second').click(() => {
    $(`#first`).text(`Changed text`);
})

$('#third').click(() => {
    let color = document.getElementById("input").value;
    let noMoreChange = false;
    if (noMoreChange = false) {
        $('button').css('background', color);
        noMoreChange = true;
    }
    $('button').css('color', 'white');
    $('button').css('font-size', '20px');
    $('button').css('border-radius', '10px');
})