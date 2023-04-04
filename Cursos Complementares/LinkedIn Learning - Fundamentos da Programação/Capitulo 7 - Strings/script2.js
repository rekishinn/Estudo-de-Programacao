var resposta = prompt("Quantos deeseja?");

var quantidade = Number(resposta); //transforma a resposta em numero

if (isNaN(quantidade)) { //se for verdade que quantidade é numero: (NaN = não é um numero);
    alert("Não é um número");
}

if (!isNaN(quantidade)) { // "!" = negação // se for verdade que quantidade não é um numero:
    alert("Isso é um número");
}