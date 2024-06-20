package edu.ariel;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        smartTv.desligar();
        System.out.println("A Tv está ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("A Tv está ligada? " + smartTv.ligada);

        System.out.println("O Canal atual é: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println(smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println(smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println(smartTv.canal);

        System.out.println("O Volume atual é: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
    }
}