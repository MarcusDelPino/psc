package teste;

public class Celulares {
     String nome;

    private double tamanhoTela;

    public void mostrarTela(){
        System.out.println(nome);
        System.out.println(tamanhoTela);


    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }
}






/*
    public Celulares(double tamanhoTela){
        this.tamanhoTela = tamanhoTela;

    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }*/