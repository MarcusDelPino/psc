import javax.swing.JOptionPane;

public class AlturaPeso {
    
    public static void main(String[] args) {
        
        float h = Float.parseFloat(JOptionPane.showInputDialog("Qual sua altura?"));
        char sexId = (JOptionPane.showInputDialog("Digite \n(m)Masculino\n(f)Feminino")).charAt(0);

        if (sexId == 'm' || sexId == 'M') {
            JOptionPane.showMessageDialog(null, "Seu peso ideal e : " + ((72.7*h) - 58));
        } else {
            JOptionPane.showMessageDialog(null, "Seu peso ideal e : " + ((62.1*h) - 44.7));
        }

    }
}
