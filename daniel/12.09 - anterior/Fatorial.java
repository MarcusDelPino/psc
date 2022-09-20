import javax.swing.JOptionPane;

public class Fatorial {
    public static void main (String[] args){

        int fat;
        fat = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 2 a 9!"));
        
        for (int i = fat; i > 2; i--) {
         
            fat = fat * (i-1);
            System.out.println(fat);   
            
        }

    }
}
