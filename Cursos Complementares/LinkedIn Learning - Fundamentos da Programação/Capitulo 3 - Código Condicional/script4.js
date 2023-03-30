var obstaculos = false;
var velocidade = 0;
var anguloDirecao = 0;
var motorista = "Lucas";

if ((motorista == "Lucas") && (obstaculos == false)) { //se ambas forem verdadeiras
    //começar a andar
}
else {
    alert("Só o Lucas pode guiar esse carro!");
}

if (velocidade > 120 || obstaculos == true) { //se uma ou outra for verdadeira
    //desacelerar
}