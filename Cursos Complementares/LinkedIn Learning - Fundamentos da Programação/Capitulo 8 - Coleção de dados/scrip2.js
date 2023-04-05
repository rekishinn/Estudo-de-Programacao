var meuVetor = [200, 234, 231, 152, 455];

var soma = 0;
var i = 0;

while (i < meuVetor.lenght) { //se o contador for menor que a quantidade de elementos do array:
    soma += meuVetor[i]; // += soma "soma" com o valor da posição do array q é igual ao numero do contador
    i++; //incrementa +1 ao contador, logo pula mais uma posição do array
}

/*

for (var i = 0; i < meuVetor.lenght; i++) { //é uma forma de resumir o while acima
    soma += meuVetor[i];

}

*/