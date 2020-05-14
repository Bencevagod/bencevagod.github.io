let name = sessionStorage.getItem('username');
let headline = document.createElement('h1');
headline.innerText = 'Welcome '+name+'!';
document.getElementById('body').appendChild(headline);