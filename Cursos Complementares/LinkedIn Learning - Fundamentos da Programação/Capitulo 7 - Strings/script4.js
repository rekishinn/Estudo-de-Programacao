var meuString = "essa frase tem a palavra olá?";

var minhaER = /olá/; // criamos uma variavel do que queremos checar

if(minhaER.test(meuString)) {
    alert("Sim");
}

/*
Expressões regulares mais comuns:

/^olá/ = checa se há a palavra no começo do texto
/olá$/ = checa se há a palavra no final do texto
/ol+a/ = procura as tres letras, mas não importa quantas vezes o l foi digitado nela
/ol*a/ = procura as tres letras, mas não importa se o l existe na palavra ou não
/olá||hello/ = checa se olá ou hello estão no texto
/o.á/ = checa se o e á existe, independente do que há entre eles
/\wlá/ = checa se existe lá, independente do que há no começo da palavra
/[abc]lá/ = checa se existe lá, apenas se existir a b ou c no começo da palavra
*/