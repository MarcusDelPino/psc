public class Game {
    public static void main(String[] args) throws InterruptedException {

    Personagem person = new Personagem("Marcus", 10,0,0,0, 0);
    Personagem person2 = new Personagem("SandroVal", 10,0,0,0, 0);


    while (person.energy >= 1 || person2.energy >= 1){
        person.xp();
        person2.xp();
        person.hunt();
        person2.hunt();
        person.eat();
        person2.eat();
        person.sleep();
        person2.sleep();
        person.hunt();
        person2.hunt();
        person.eat();
        person2.eat();
        person.sleep();
        person2.sleep();
        person.foodOverdose();
        person2.foodOverdose();
        System.out.println("...");
        System.out.println(person.name + " - Nivel de energia: " + person.energy + " Nivel de fome: " + person.hungry + " Nivel de sono: " + person.tired + " Item bp: " + person.bag);
        System.out.println(person2.name + " - Nivel de energia: " + person2.energy + " Nivel de fome: " + person2.hungry + " Nivel de sono: " + person2.tired + " Item bp: " + person2 .bag + "\n");
        Thread.sleep(6000);
        person.revive();
        person2.revive();

    }

    System.out.println(person.name + " e "+ person2.name + " Morreram, acabou sua jornada!\n Insira uma nova ficha!" + person.exp + "  --  " + person2.exp);


    }
}
