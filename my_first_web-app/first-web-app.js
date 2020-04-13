let data = {
    photo: ['./Images/desert-rock.jpg', './Images/earth.jpg', './Images/solar-system.jpg', './Images/galaxy.jpg', './Images/galaxy-cluster.jpg', './Images/temple1.jpg', './Images/bamboo.jpg'],
    title: ['The size of life', 'Our planet', 'The Solar System', 'Billions of solar systems', 'The enormous of enormous', 'Harmony', 'Inner peace'],
    description: ['The size of life and the things around us can be overwhelming.',
    'You sometimes can feel insignificant on a vast planet like Earth.',
    'So let me introduce you our Solar System, where the sheer distances between planets are even unimaginable.',
    'Galaxies are concist of billions of solar systems, are you feeling small already?',
    'Let me introduce you to the Galaxy Clusters, more billions of billions of planets and thing out there, it is impossible and impractically selfish to think we are alone in a universe so vast, a human brain cant even think about it.',
    'When humans think about such things as the universe, they can feel alone, and forget to think about things, that are much closer, still forgotten nowadays. That is Harmony.',
    'Whit Harmony, there comes Inner Peace, which can contribute to a life that is full of empathy, and useful for not just you, but for others as well.'    
]
};
let img = document.getElementById('img-container');
let title = document.getElementById('image_title');
let description = document.getElementById('image_description');
let currentPhoto = 0;
img.style.backgroundImage = 'url('+data.photo[currentPhoto]+')';
title.textContent = data.title[currentPhoto];
description.textContent = data.description[currentPhoto];

let up = document.getElementById('forward-arrow');
let down = document.getElementById('back-arrow');

up.onclick = function() {
    if (currentPhoto === 6) {
        currentPhoto = 0;
        img.style.backgroundImage = 'url('+data.photo[currentPhoto]+')';
        title.textContent = data.title[currentPhoto];
        description.textContent = data.description[currentPhoto];
    } else {
        currentPhoto++;
        img.style.backgroundImage = 'url('+data.photo[currentPhoto]+')';
        title.textContent = data.title[currentPhoto];
        description.textContent = data.description[currentPhoto];
    }
}

down.onclick = function() {
    if (currentPhoto === 0) {
        currentPhoto = 6;
        img.style.backgroundImage = 'url('+data.photo[currentPhoto]+')';
        title.textContent = data.title[currentPhoto];
        description.textContent = data.description[currentPhoto];
    } else {
        currentPhoto--;
        img.style.backgroundImage = 'url('+data.photo[currentPhoto]+')';
        title.textContent = data.title[currentPhoto];
        description.textContent = data.description[currentPhoto];
    }
}