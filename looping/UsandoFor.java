import javax.swing.JOptionPane;

public class UsandoFor {
    public static void main(String[] args) {
        double nota1, nota2;
        

        for(int contador = 1; contador <= 5; contador++) {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a primeira nota?"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a segunda nota?"));
            JOptionPane.showMessageDialog(null, "O valores selicionados sao" + ((nota1 + nota2)/2));
            //contador++; (CONTA DE DOIS EM DOIS)
            JOptionPane.showMessageDialog(null, "O Contador esta em " + contador);
        }
        
    }
}