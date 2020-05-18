//import {curry, map, join, split} from 'lodash/fp';

//const curry = function => ()

let button = document.getElementById('submit');
let username = document.getElementById('email').value;
let term = document.getElementById('terms')
button.onclick = function() {
    if (username.lenght === 0 || term.checked === false){
        return false;
    } else {
        let name = function(username) {
            map(toLowerCase(username));
            split(' ');
            join('-');
        } 
        sessionStorage.setItem('username', username);
        console.log(username);
    }
}