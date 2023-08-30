package com.ada.pooii.zoologico.interfaces;

public class Golfinho extends Animal implements Nadador, Amamentador {

    @Override
    void movimentar() {
        nadar();
    }

    @Override
    public void nadar() {
        System.out.println("Golfinho faz um salto e dispara nadando");
    }
}
