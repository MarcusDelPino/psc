import javax.swing.JOptionPane;

public class ParImpar {
    
    public static void main(String[] args){

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        JOptionPane.showMessageDialog(null, num % 2 == 0 ? "Esse numero eh par!" : "Esse numero e impar!");


    }

}
