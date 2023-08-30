package com.ada.pooii.zoologico.interfaces;

public abstract class Animal {

    public void alimentar() {
        System.out.println("Alimentando");
    }

    abstract void movimentar();
}
