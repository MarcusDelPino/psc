//import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

    public class Salario {
        public static void main (String[] args){
            double sal, reajuste;

            sal = Double.parseDouble(JOptionPane.showInputDialog("Qual o sálario?"));
            reajuste = Double.parseDouble(JOptionPane.showInputDialog("Porcentagem do reajuste?"));

            reajuste = (reajuste/100);

            sal = ((sal*reajuste) + sal);

            System.out.println(sal);
            
        }
        
    }