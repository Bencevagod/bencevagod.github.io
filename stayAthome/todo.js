$('button').click (() => {
    let todo = document.getElementById("input").value;
    const check = document.createElement("input");
    const button = document.createElement("button");
    check.type = "checkbox";
    //Létrehozza <li> elemet
    const li = document.createElement("li");
    //<li> szövege a todo lesz
    li.innerHTML=todo;
    //<li> megkapja a gombokat, mielőtt még bekerülne <ul>-be
    li.append(check, button);
    //<li> bekerül <ul>-be
    $('ul').append(li);
    $('input').val('');

    /*
    $('ul').append(`<li>${todo}</li>`);
    let arr=$("li");
    
    for (let i=0;i<arr.length;i++) {
        if (!arr[i]._done) {
            arr[i].append(check, button);
        }
        arr[i]._done=true;	
    }
    */
    
    check.onclick=function() {
        //a this ebben a contextusban a checkbox
        //this.parentNode a checkbox szuloje, vagyis a li
        //ertekadasnal short hand forma: valtozo = (boolean kifejezes) ? (ha igen ertek) : (ha nem ertek)
        this.parentNode.style=this.checked?'text-decoration:line-through':'text-decoration:none';
    }
})
