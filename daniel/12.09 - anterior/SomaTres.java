import java.util.Scanner;

public class SomaTres {

    public static void main(String[] args) {

        double num1, num2, num3;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero!");
        num1 = leitor.nextDouble();

        System.out.println("Digite o primeiro numero!");
        num2 = leitor.nextDouble();

        System.out.println("Digite o primeiro numero!");
        num3 = leitor.nextDouble();

        System.out.printf("%.2f", num1 + num2 + num3);

        leitor.close();
    }

}
