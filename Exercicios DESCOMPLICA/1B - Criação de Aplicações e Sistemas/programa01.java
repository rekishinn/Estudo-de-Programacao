//salvar como programa01.java

class programa01
{
    public static void main (String entrada[])
    {
        //declaração de variáveis
        int NumInt;
        double NumReal, soma;
        char Caracter;

        //entrada de dados
        NumInt = Integer.parseInt(entrada[0]); //transforma string (entrada[0]) para inteiro
        NumReal = Double.parseDouble(entrada[1]); //transforma string (entrada[0]) para inteiro
        Caracter = (entrada[2]).charAt(0);

        //processamento
        soma = (double)NumInt + NumReal; // soma é DOUBLE, então convertermos NumInt para double*
        
        //saida de resultados
        System.out.println((double)NumInt + " + " + NumReal + " = " + soma + " sinal " + Caracter);

        System.exit(0);
    }
}

// * "soma" e "NumReal" por ser um número REAL precisamos converter NumInt para Real, pois:
// lógica incorreta: 10 + 5.5 = 10.5
// lógica correta: 10.0 + 5.5 = 10.5