// Js for Navbar open & close
var burgerBtn = document.getElementsByClassName("burgerBtn"),
    burgerContent = document.getElementsByClassName("burgerContent");
    x=0;
    
burgerBtn[0].addEventListener("click", function(){
    if(x===0){
	    burgerContent[0].style.transform = "perspective(1200px) rotateY(0deg)";
	    burgerContent[0].style.transition = "all 1000ms ease";
	    x++;
    } else {
	    burgerContent[0].style.transform = "perspective(1200px) rotateX(90deg)";
	    x--;
    }
});



// Close Navbar when click anywhere on window
window.addEventListener("mouseup", function(e){
    if(e.target != burgerContent[0]){
	    burgerContent[0].style.transform = "perspective(1200px) rotateX(90deg)";
    }
});
