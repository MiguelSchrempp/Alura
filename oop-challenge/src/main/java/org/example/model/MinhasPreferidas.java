package org.example.model;

public class MinhasPreferidas {

    public void inclui(Audio a) {
        if (a.getClassificacao() >= 8) {
            System.out.println(a.getTitulo() + " é considerado preferido");
        } else {
            System.out.println(a.getTitulo() + " é um dos que gostam");
        }
    }
}
