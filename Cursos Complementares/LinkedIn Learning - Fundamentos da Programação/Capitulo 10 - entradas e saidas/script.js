var titulo = document.getElementById("tituloPrincipal"); //titulo vai ser setado ao elemento com id "tituloPrincipal" da pagina 
titulo.onclick = function() { //quando o titulo for clicado faça a função:
    titulo.innerHTML = "O título foi clicado!" //vai pegar o html interno do elemento e mudar pra "o titulo foi clicado"!
}