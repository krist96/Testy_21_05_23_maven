package automat;

import java.math.BigDecimal;

public class Produkt {
    int numerProdoktu;
    String nazwa;
    BigDecimal cena;
    int ilosc;

    public Produkt(int numerProdoktu, String nazwa, BigDecimal cena, int ilosc) {
        this.numerProdoktu = numerProdoktu;
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.cena = cena;
    }
}
