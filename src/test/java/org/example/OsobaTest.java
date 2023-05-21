package org.example;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OsobaTest {

    @org.junit.jupiter.api.Test
    void KlasaOsobaWeryfikacjaWprowadzonegoWieku() {
        Osoba osoba = new Osoba("Adam", "Kowalski", 55);
        Assertions.assertTrue(osoba.getWiek() == 55);
    }

    @org.junit.jupiter.api.Test
    void getImie() {
        Osoba osoba = new Osoba("Adam", "Kowalski", 55);
        Assertions.assertTrue(osoba.getImie().equals("Adam"));//1 sposób
        Assertions.assertEquals(osoba.getImie(), "Adam");//2 sposób
        System.out.println(osoba);
    }

    @org.junit.jupiter.api.Test
    void TworzenieListyObiektowKlasyOsobaSprawdzenieIleElementowWLiscie() {
        List<Osoba> osoby = new ArrayList<Osoba>();
        osoby.add(new Osoba("Adam", "Kowalski", 55));
        osoby.add(new Osoba("Anna", "Kowal", 48));
        Assertions.assertTrue(osoby.size() == 2);
    }
    @org.junit.jupiter.api.Test
    void TworzenieListyObiektowKlasyOsobaSprawdzeniePodobienstwaElementow() {
        List<Osoba> osoby = new ArrayList<Osoba>();
        osoby.add(new Osoba("Adam", "Kowalski", 55));
        osoby.add(new Osoba("Adam", "Kowalski", 55));
        Assertions.assertTrue(osoby.get(0).equals(osoby.get(1)), "Obiekty nie są takie same!");
    }

}