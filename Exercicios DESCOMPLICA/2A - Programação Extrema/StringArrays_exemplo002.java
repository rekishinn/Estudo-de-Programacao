public class StringArrays_exemplo002{
    public static void main(String[] args){
       
        int[] nota = new int[3]; //se eu ja sei os valores antes: nota = {9,10,8};

        nota[0] = 9;
        nota[1] = 10;
        nota[2] = 8;

        for(int i=0 ; i<3 ; i++) {
        
            System.out.println(nota[i]);
        }
    }
}