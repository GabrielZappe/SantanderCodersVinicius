package com.ada.pooii.zoologico.interfaces;

public class Tartaruga extends Animal implements Nadador{
    @Override
    void movimentar() {
        nadar();
    }
}
