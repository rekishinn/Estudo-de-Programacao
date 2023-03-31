var saldo = prompt("Insira seu saldo:");

if (saldo > 0) {
    var mensagem = "Saldo positivo!";
    alert(mensagem);
}
else if (saldo == 0) {
    var mensagem = "Saldo zero!";
    alert(mensagem);
}
else {
    var mensagem = "Saldo negativo!";
    alert(mensagem);
}