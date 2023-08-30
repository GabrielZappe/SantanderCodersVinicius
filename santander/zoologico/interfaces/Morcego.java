package com.ada.pooii.zoologico.interfaces;

public class Morcego extends Animal implements Voador, Amamentador {
    @Override
    void movimentar() {
        voar();
    }
}
