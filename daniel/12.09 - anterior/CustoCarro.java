//import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

    public class CustoCarro {
        public static void main (String[] args){
            double carro, distribuidor, imposto;
            
            carro = Double.parseDouble(JOptionPane.showInputDialog("Valor do custo da fabrica:"));

            System.out.printf("\n" + "Valor de custo R$ " + "%.2f", carro);
            
            carro = ((carro*100/27));

            
            imposto = ((carro*0.45));
            
            System.out.printf("\n" + "Valor do imposto R$ " + "%.2f", imposto);
            
            distribuidor = carro * 0.28;
            
            System.out.printf("\n" + "Valor do distribuidor" + "%.2f", distribuidor);
            
            System.out.printf("\n" + "Custo final do carro é R$ " + "%.2f", carro);
            



            
            
        }
        
    }