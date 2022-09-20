import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Pi {
    public static void main(String[] args) {
       double res;

        Scanner leitor = new Scanner(System.in);
       // Pi pi = new Pi();
       
       System.out.println("Qual o diametro?");
       double vDiametro = leitor.nextDouble();
       res = ((vDiametro/2) * (vDiametro/2)*3.14);

       System.out.printf("O valor da area e de: " + res);

       leitor.close();
        
    }
}
