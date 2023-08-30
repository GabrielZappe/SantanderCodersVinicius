package com.ada.pooii.generics;

import java.math.BigInteger;

public class Generics {

    public static void main(String[] args) {
        String a = "abacate";
        String b = "banana";
        String maiorStringAlfabeticamente = (String) maior(a, b);
        System.out.println("Maior entre %s e %s: %s".formatted(a, b, maiorStringAlfabeticamente));

        BigInteger um = new BigInteger("1");
        BigInteger dois = BigInteger.valueOf(2);
        BigInteger maiorBigInteger = (BigInteger) maior(um, dois);
        System.out.println("Maior entre %s e %s: %s".formatted(um, dois, maiorBigInteger));

        Integer cinco = 5;
        Integer tres = 3;
        Integer maiorInteiro = (Integer) maior(cinco, tres);
        System.out.println("Maior entre %s e %s: %s".formatted(cinco, tres, maiorInteiro));
    }

    private static Comparable maior(Comparable primeira, Comparable segunda) {
        boolean comparaPrimeiraComSegunda = primeira.compareTo(segunda) > 0;
        Comparable maior = comparaPrimeiraComSegunda ? primeira : segunda;
        return maior;
    }

}
