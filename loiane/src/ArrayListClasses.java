import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListClasses {
    public static void main(String[] args) {

       // Pessoas pessoas = new Pessoas("Marcus", 30);

       // Collections.sort();
        Scanner ler = new Scanner(System.in);
        ArrayList<Pessoas> pessoa = new ArrayList<Pessoas>();

        pessoa.add(new Pessoas(ler.next(), ler.nextInt()));
    }
}
