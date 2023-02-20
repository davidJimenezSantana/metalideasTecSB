
let btnScrollIzq = document.getElementById("btn-scroll-izq");
let btnScrollDer = document.getElementById("btn-scroll-der");
let posicionActualScroll = 0;
let desplazamiento = 350;
const contenedoritem = document.querySelector(".contenedor-item");
const sliderHor = document.querySelector(".slider_hor");
let maxScroll = -contenedoritem.offsetWidth + sliderHor.offsetWidth;


//movimiento scroll productos

function scrollHorizontal(val) {

    if (posicionActualScroll >= 0) {
        posicionActualScroll = 0;
        btnScrollIzq.style.opacity = "0";
    } else {
        btnScrollIzq.style.opacity = "1";
    }
    if (posicionActualScroll <= maxScroll) {
        posicionActualScroll = maxScroll;
        btnScrollDer.style.opacity = "0";
    } else {
        btnScrollDer.style.opacity = "1";
    }

    posicionActualScroll += (val * desplazamiento);
    contenedoritem.style.left = posicionActualScroll + "px";
}

//Movimiento scroller producto

btnScrollIzq.addEventListener("click", function () { scrollHorizontal(1) });
btnScrollDer.addEventListener("click", function () { scrollHorizontal(-1) });

