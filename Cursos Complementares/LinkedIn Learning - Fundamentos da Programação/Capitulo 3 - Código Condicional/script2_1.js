var saldo = prompt("Insira seu saldo:");
var mensagem = "valor inválido!"

if (saldo > 0) {
    var mensagem = "Saldo positivo!";
}
else if (saldo == 0) {
    var mensagem = "Saldo zero!";
}
else {
    var mensagem = "Saldo negativo!";
}

alert(mensagem);