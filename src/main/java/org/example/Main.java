package org.example;

import automat.Automat;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Automat automat = new Automat();
        automat.setProdukty(1, "Lays zielona cebulka", BigDecimal.valueOf(3.67), 10);
        automat.setProdukty(1, "Lays zielona cebulka", BigDecimal.valueOf(3.67), 10);
        automat.setProdukty(2, "Sok pomaranczowy", BigDecimal.valueOf(4.67), 15);
        automat.wypiszProdukty();
    }
}





