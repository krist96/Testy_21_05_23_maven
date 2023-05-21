package org.example;

import java.util.Objects;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString(){
        return "Imię to: " + this.imie +
                "\n Nazwisko: " + this.nazwisko +
                "\n wiek: " + this.wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return wiek == osoba.wiek &&
                nazwisko.equals(osoba.nazwisko) &&
                imie.equals(osoba.imie);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, wiek);
    }
}
