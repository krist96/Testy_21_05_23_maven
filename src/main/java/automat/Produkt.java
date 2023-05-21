package automat;

import java.math.BigDecimal;
import java.util.Objects;

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return numerProdoktu == produkt.numerProdoktu &&
                ilosc == produkt.ilosc &&
                nazwa.equals(produkt.nazwa) &&
                cena.equals(produkt.cena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerProdoktu, nazwa, cena, ilosc);
    }
}
