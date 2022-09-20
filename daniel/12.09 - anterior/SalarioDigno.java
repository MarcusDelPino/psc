import javax.swing.JOptionPane;

public class SalarioDigno {
    public static void main (String[] args){

        double salario;
        String triste;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));
        
        triste = salario >= 1250 ? "Seu salario esta acima da media" : "Seu salario esta a baixo da media";

        JOptionPane.showMessageDialog(null, triste);
    }
} 