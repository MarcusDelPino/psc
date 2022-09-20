import javax.swing.JOptionPane;

public class SomaDoisNumeros{
    static public void main(String x []){
        //declarar variaveis
        double primeiroValor, segundoValor, res;
        //entrada de dados
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        //processamento
        res = primeiroValor + segundoValor;
        //saida
        JOptionPane.showMessageDialog(null, res);
    }
}