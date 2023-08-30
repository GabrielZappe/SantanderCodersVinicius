package com.ada.pooii.zoologico.interfaces;

public class Vaca extends Animal implements Amamentador {
    @Override
    void movimentar() {
        System.out.println("Andando");
    }
}
