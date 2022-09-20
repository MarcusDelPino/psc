import javax.swing.JOptionPane;

public class UsandoDoWhile {
    public static void main(String[] args) {
        double nota1, nota2;
        int contador = 1;
        
        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a primeira nota?"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a segunda nota?"));
            JOptionPane.showMessageDialog(null, "O valores selicionados sao" + ((nota1 + nota2)/2));
            contador++;
            
        } while (contador < 5); {
            JOptionPane.showMessageDialog(null, "O Contador esta em " + contador);
            
        }
        
    }
}