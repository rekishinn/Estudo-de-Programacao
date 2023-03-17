package Arquivos_exemplo002.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arquivos_exemplo002 {
    public static void main(String[] args) {

        String nome = "E:\\Estudo de Programação\\Exercicios DESCOMPLICA\\2A - Programação Extrema\\Arquivos_exemplo002\\lib\\arquivox.txt";
        
        System.out.printf("Conteúdo do arquivo texto:\n");
        try {
            FileReader arq = new FileReader(nome); //criando um objeto do tipo File, instanciado pelo nome do arquivo
            BufferedReader lerArq = new BufferedReader(arq); //buffered lê todos os dados da linha de uma vez só

            String linha = lerArq.readLine(); // lê a primeira linha
            while (linha != null) { //se a linha existe:
                System.out.println(linha);
                linha = lerArq.readLine(); //lê da  primeira até a ultima linha
            }

            arq.close();
        } catch (IOException e) {
            System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        System.out.println();
    }
}
