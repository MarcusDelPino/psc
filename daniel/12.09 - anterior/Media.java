import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args) {
        
        double nota1,nota2;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a primeira nota."));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a primeira nota."));
        
        JOptionPane.showMessageDialog(null, (nota1+nota2)/2 >= 7 ? "Parabuens voce foi aprovado, sua media foi: \n" + (nota1+nota2)/2 : "Que pena! Voce esta reprovado, sua media foi: " + (nota1+nota2)/2 );

    }
}
