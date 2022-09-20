import javax.swing.JOptionPane;

public class CemNumerosFor {
    public static void main(String[] args){
        int numeroEscolhido;
        int res;

        numeroEscolhido = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        
        for(int contador = 0 ; contador <= 100; contador++){
            res = numeroEscolhido + contador;
            JOptionPane.showMessageDialog(null, " todos os numeros" + res);

        }

    }
    
}
