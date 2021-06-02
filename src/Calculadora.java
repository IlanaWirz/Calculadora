import java.util.Scanner;

public class Calculadora {
    // atributos

    //metodos
    public static void main(String args[]){
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero:");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo numero:");
        num2 = scanner.nextInt();



        resultado = num1 + num2;

        System.out.println(resultado);

    }
}
