import javax.swing.JOptionPane;

public class MaiorIdade {
    public static void main (String[] args){

        int idade;
        String maior;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));

        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Muito bom está com a maioridade, bora de breja.");
        }else if (idade == 17){
            JOptionPane.showMessageDialog(null, "Ta quase lá!");
        }else {
            JOptionPane.showMessageDialog(null, "Você ainda é menor, que tal um sukin!");
        }

        maior = idade >= 18 ? "Voce e maior de idade!" : "Infelizmente voce ainda e menor!";

        System.out.println(maior);
    }
    
}
