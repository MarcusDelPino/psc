import javax.swing.JOptionPane;

    public class AnosIdade {
        public static void main (String[] args){

            int idade, dias;

            idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
            dias = idade * 365;

            JOptionPane.showMessageDialog(null, "Você está vivo a " + dias);
            System.out.println(dias);

        }

    }