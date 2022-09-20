import javax.swing.JOptionPane;

public class PrecoProduto {

    public static void main(String[] args) {
        
        double valor;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));

        JOptionPane.showMessageDialog(null, "Seu produto tem um desconto de 10%: \n" + (((valor*0.10) - valor)*-1));


    }
    
}
