public class StringArrays_exemplo004{
    public static void main(String[] args){
       
        int[][] matriz = {{0,1,2},{3,4,5}};
        int i, j;

        for(i=0 ; i<2 ; i++){
            for(j=0 ; j<3 ; j++) {
                System.out.println(matriz[i][j]);
            }
        }

    }
}

//linha 4:
//ao inves de inicializar os valores um de cada vez, igual ao exemplo 003,
//você pode inicializar na propria linha declaração da matriz.
//no exemplo 002, há um exemplo de como seria feito se fosse um vetor.