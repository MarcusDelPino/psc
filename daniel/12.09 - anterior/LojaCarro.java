//import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

    public class LojaCarro {
        public static void main (String[] args){
            double salario = 1000, qtdaCarro, vCarro, comissao, calculo;

            vCarro = Double.parseDouble(JOptionPane.showInputDialog("Qual valor dos carros?"));
            qtdaCarro = Double.parseDouble(JOptionPane.showInputDialog("Quantos carros foram vendidos?"));
            comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual valor da comissão?"));

            //comissao = 3000;

            calculo = ((vCarro*qtdaCarro)*0.05 + comissao + salario); 

            System.out.println(calculo);
            
        }
        
    }