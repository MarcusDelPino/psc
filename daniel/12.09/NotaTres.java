import java.util.Scanner;
import javax.swing.JOptionPane;

public class NotaTres {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double n1, n2, n3;


/* 
n1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota laboratorial?"));
n2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota semestral?"));
n3 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da avaliacao final?"));
*/
        System.out.println("Qual a nota laboratorial?");
        n1 = leitor.nextFloat();
        System.out.println("Qual a nota semestral?");
        n2 = leitor.nextFloat();
        System.out.println("Qual a nota avaliacao final?");
        n3 = leitor.nextFloat();

        if (n1 > 2) {
            boolean parar = false;

            if (parar == false) {
                System.out.println("O valor apresentado esta incorreto, reveja as notas e as insira novamente!");
            }
            //break;
        } else if (n2 > 3) {
            System.out.println("O valor apresentado esta incorreto, reveja as notas e as insira novamente!");
        } else if (n3 > 5) {
            System.out.println("O valor apresentado esta incorreto, reveja as notas e as insira novamente!");

        } else {
            System.out.println("A nota final e: " + (n1 + n2 + n3));
        }

        leitor.close();
    }
}