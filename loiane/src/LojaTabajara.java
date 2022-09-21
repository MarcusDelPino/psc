import javax.swing.*;
import java.util.Scanner;

public class LojaTabajara {
    public static void main(String[] args) {

        double valor, valorPago, troco, total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lojinhas tabajara");

        for (double i = 1; i != 0; ) {
/*
            System.out.println("Qual o valor do produto?");

            valor = scan.nextDouble();

            Se fizer com scan ele fica registrado, na tela.
*/
            valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do produto?"));

            total += valor;


            if (valor != 0) {
                System.out.println("Produto " + i + " : R$" + valor);
                i++;

            } else {
                i = 0;
            }
        }
/*
        System.out.println("Valor pago?");
        double valorPago = scan.nextDouble();
  */
        valorPago = Double.parseDouble(JOptionPane.showInputDialog("Qual valor pago?"));
        troco = valorPago - total;
        System.out.println("Valor pago? " + valorPago);
        System.out.printf("Valor total :" + total + "\n" + "Valor de troco:" + "%.2f", troco );
    }
}
