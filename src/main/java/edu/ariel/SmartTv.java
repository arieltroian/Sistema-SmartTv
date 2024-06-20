package edu.ariel;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: ");
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: ");
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando o canal para: ");
    }
    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentando o número do canal para: ");
    }
    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo o número do canal para: ");
    }
}
