import java.awt.*;
import javax.swing.*;


public class ConversorTemperatura {


    public static void criarTela(){
        // criar tela.
        JFrame tela = new JFrame("Conversor");
        //criat caixa de texto editavel
        JTextField celsiusJTextField = new JTextField(1);
        //criar uma label do simbolo de CELSIUS
        JLabel celsiusLabel = new JLabel("\u00B0C");
        //criar botao para clicar
        JButton conversorJButton = new JButton("Conversor");
        //criar label com o resultado.
        JLabel celsiusRes = new JLabel("");

        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2,2,2,4));
        painelDeConteudo.add(celsiusJTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(conversorJButton);
        painelDeConteudo.add(celsiusRes);
        conversorJButton.addActionListener((e) -> {
            //1 pegar o que o usuario digitou(vem textual, String)
            String celsiusString = celsiusJTextField.getText();
            // converter para numero
            double celsiusDouble = Double.parseDouble(celsiusString);
            //converter celsius para f
            double fahrenheitDouble = celsiusDouble / 5 * 9 + 32;
            //converter res para texto
            String resFahrenheit = Double.toString(fahrenheitDouble);
            //Jlabel mostrar o res.
            celsiusRes.setText(resFahrenheit);
        });



        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
    }
}
