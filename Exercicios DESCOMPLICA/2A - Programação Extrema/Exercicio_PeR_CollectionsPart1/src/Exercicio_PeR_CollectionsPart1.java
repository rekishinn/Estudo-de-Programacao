package Exercicio_PeR_CollectionsPart1.src;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_PeR_CollectionsPart1 {
    public static void main(String[] args) {

        int numero; //crio uma variavel inteiro
        
        ArrayList<Integer> numeroLista = new ArrayList<>(); //crio um vetor chamado numeroLista
            Scanner input = new Scanner(System.in); //dou comando de leitura
        

        System.out.println("Digite um número inteiro: "); //mensagem

        numeroLista.add(numero); //o numero digitado (q corresponde a numero) é adicionado a numeroLista
        

        System.out.println("Números na lista: " + numeroLista); //printa os numeros da lista
		System.out.println("Soma total: " + numeroLista.stream().mapToInt(Integer::intValue).sum()); //soma e printa o resultado da soma

    }
}

