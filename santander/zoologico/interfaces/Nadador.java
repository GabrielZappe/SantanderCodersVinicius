package com.ada.pooii.zoologico.interfaces;

public interface Nadador {

    default void nadar() {
        System.out.println("Nadando");
    }

}
