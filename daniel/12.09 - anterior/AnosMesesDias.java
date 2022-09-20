import javax.swing.JOptionPane;

    public class AnosMesesDias {
        public static void main (String[] args){

            int anoAniversario, mesAniversario, diaAniversario, res;

            diaAniversario = Integer.parseInt(JOptionPane.showInputDialog("Qual dia você nasceu?"));
            mesAniversario = Integer.parseInt(JOptionPane.showInputDialog("Qual mês do seu nascimente?"));
            anoAniversario = Integer.parseInt(JOptionPane.showInputDialog("Qual ano você nasceu?"));

            res = diaAniversario + ((mesAniversario * 30) + ((2022 - anoAniversario) * 365));

            JOptionPane.showMessageDialog(null, "Você está vivo a " + res);
            System.out.println(res);

        }

    }