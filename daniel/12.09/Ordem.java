import java.util.Scanner;

public class Ordem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, n3;
        // 5 6 2
        System.out.println("Digite um numero!");
        n1 = leitor.nextInt();
        System.out.println("Digite um numero!");
        n2 = leitor.nextInt();
        System.out.println("Digite um numero!");
        n3 = leitor.nextInt();
        System.out.println("\n");
        System.out.println("\n");
        if (n1 < n2) {
            if (n2 < n3) {
                System.out.println(n3 + "\n" + n2 + "\n" + n1);
            } else if (n1 < n3) {
                System.out.println(n1 + "\n" + n3 + "\n" + n2);
            } else {
                System.out.println(n3 + "\n" + n1 + "\n" + n2);
            }

        } else if (n2 < n3) {
            if (n1 < n3) {
                System.out.println(n3 + "\n" + n1 + "\n" + n2);

            }
        }
        leitor.close();
    }

}
