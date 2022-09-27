import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistAprendendo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<String> criandoArray = new ArrayList<String>();

        criandoArray.add("Shevechenko"); //permite add
        criandoArray.add("Shevechdasdenko");
        criandoArray.add("Shevechdasddasdaenko");
        criandoArray.add("Shevechdasddasdadasdsenko");


        //System.out.println(criandoArray(0)); minha tentantiva.
        System.out.println(criandoArray.size()); //size me da o tamanho do array
        System.out.println(criandoArray.get(2));// get me da o que tem dentro


/*
        for (int i = criandoArray.size(); i < 10; i++) {
            System.out.println("Add um novo nome");
            criandoArray.add(ler.next());
        }*/

        for (int i = 0; i < criandoArray.size(); i++) {
            System.out.println(criandoArray.get(i));
        }
        criandoArray.remove(3);
        int ultimo =criandoArray.size() - 1;
        System.out.println("Ultimo nome " + criandoArray.get(ultimo)); // pega a ultima posição

        for (String variavel : criandoArray) {
            System.out.println(variavel);
        }

        for (String nome : criandoArray) {
            criandoArray.add(ler.next());
        }

        ler.close();

    }
}
