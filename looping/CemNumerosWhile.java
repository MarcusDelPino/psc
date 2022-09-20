//import javax.swing.JOptionPane;

public class CemNumerosWhile {
    public static void main(String[] args) {
        int contador = 1;

        while (contador < 100) {
            contador++;
            System.out.println(contador);
            if (contador == 50) {
                System.out.println("Chegamos na metade!");
            }else{
                for (int i = 0; i < 3; i++) {
                    System.out.println(".");
                    
                }
            }
        }
        
    }
}