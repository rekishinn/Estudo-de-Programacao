public class operadores_exemplo004 {
    public static void main(String[] args) {

        int num1, num2;
        
        num1 = 6;
        num2 = 6;

        num1++; //num 1 = num1 + 1;
        ++num2; //num 2 = num2 + 1;

        System.out.println(num1);
        System.out.println(num2);

        int num3, num4;

        num3 = 6;
        num4 = 6;

        //EXEMPLO DE CASO ESPECIAL:



        //System.out.println(num3++);

        System.out.println(num3); 
        num3++; //pós fixado



        //System.out.println(++num4);

        num4++; //pré fixado
        System.out.println(num4);

    }
}
