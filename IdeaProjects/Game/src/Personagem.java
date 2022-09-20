import java.util.Random;

public class Personagem {

    public String name;
    public int energy;
    public int hungry;
    public int tired;
    public int bag;
    public int exp;
    public int d1;
    Random generate = new Random();

    public Personagem(String name, int energyLevel, int hungryLevel, int tiredLevel, int backpack, int experience){
        this.name = name;

        if (0 < energyLevel && energyLevel <=10 ){
            this.energy = energyLevel;
        } else {
            this.energy = 10;
        }
        if (0 <= hungryLevel && hungryLevel <= 10) {
            this.hungry = hungryLevel;
        } else {
            this.hungry = 10;
        }
        if (0 <= tiredLevel && tiredLevel <= 10) {
            this.tired = tiredLevel;
        } else {
            this.tired = 10;
        }
        if (0 <= backpack && backpack <= 5){
            this.bag = backpack;
        }else {
            this.bag = 5;
        }
        if (experience >= 0 && experience <= 10){
            this.exp = experience;
        }else {
            this.exp = 10;
        }
    }

    public void hunt(){

        if (energy > 0 && energy <= 20){
            System.out.println(name + " Estou indo CAÇAR!");
            energy -= 2;
            hungry += 1;
            tired += 1;
            exp ++;
            bag += generate.nextInt(2);
            // System.out.println(energy);
        } else {
            System.out.println(name + " Morreu!");
        }
    }

    public void eat(){
        if (hungry >= 2 && energy != 0){
            System.out.println("Vou comer o que eu cacei:");
            if (bag >= 1) {
                d1 = generate.nextInt(6);
                switch (d1) {
                    case 1:
                        System.out.println(name + " comeu uma SEMENTE!");
                        energy += d1;
                        bag -= 1;
                        break;
                    case 2:
                        System.out.println(name + " comeu uma BANANA!");
                        energy += d1;
                        bag -= 1;
                        break;
                    case 3:
                        System.out.println(name + " comeu uma PÃO!");
                        energy += d1;
                        bag -= 1;
                        break;
                    case 4:
                        System.out.println(name + " comeu um CARNE BRANCA!");
                        energy += d1;
                        bag -= 1;
                        break;
                    case 5:
                        System.out.println(name + " Voce comeu uma CARNE VERMELHA!");
                        energy += d1;
                        hungry += 10;
                        bag -= 1;
                        break;
                    default:
                }
            } else {
                System.out.println("Eu Não tenho comida! Diz: " + name);
            }

            hungry = Math.min(hungry - 1, 13);
            energy = Math.min(energy, 10);
        } else {
            System.out.println(name + " NÃO TEM FOME");
        }

    }

    public void sleep(){
        if (tired >= 3 && energy != 0){
            System.out.println(name + " acabou de dormir e recuperou energia!");
            tired = Math.min(tired - 2, 10);
            energy = Math.min(energy + generate.nextInt(3), 10);
         //   System.out.println(energy);

        } else {
            System.out.println(name + " esta descansado!");
        }
    }

    public void revive(){
        if (energy <= 0 && exp >= 10){
            System.out.println(exp);
            energy = 5;
            tired = 2;
            hungry = 0;
            System.out.println("Foi revivido! " + exp);
            exp = 0;
          //  System.out.println(energy);
        }else {

        }
    }

    public void foodOverdose(){
        if (hungry >= 12) {
            energy = 0;
            tired = 0;
            System.out.println(name + " comeu demais, e nao conseguiu sair para cacar!");
        }
    }

}
