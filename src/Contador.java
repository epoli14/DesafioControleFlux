import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        int arg1 = 0, arg2 = 0, range;
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parametro: ");
            arg1 = terminal.nextInt();

            System.out.println("Digite o segundo parametro");
            arg2 = terminal.nextInt();
        } catch (Exception InputMismatchException){
        System.out.println("InputMismatchException");
        System.out.println("Por favor informe em numeral");
    }
        try{
            range = validNumbers(arg1, arg2);
            for(int i = 1; i <= range; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }



    }

    public static int validNumbers(int n1, int n2) throws ParametrosInvalidosException{
        if (n2 < n1){
            throw new ParametrosInvalidosException();
        }else {
            return n2-n1;
        }

    }
}
