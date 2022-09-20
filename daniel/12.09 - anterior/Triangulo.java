import javax.swing.JOptionPane;

public class Triangulo {
    public static void main(String[] args) {
        
        double base,altura;

        base = Double.parseDouble(JOptionPane.showInputDialog("Qual a base?"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura?"));
        
        JOptionPane.showMessageDialog(null, "Resultado do calculo e: " + (base*altura)/2);
        //JOptionPane.showMessageDialog(null, (nota1+nota2)/2 >= 7 ? "Parabuens voce foi aprovado, sua media foi: \n" + (nota1+nota2)/2 : "Que pena! Voce esta reprovado, sua media foi: " + (nota1+nota2)/2 );

    }
}
