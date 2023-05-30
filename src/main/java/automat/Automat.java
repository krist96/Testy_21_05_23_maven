package automat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Automat {
    private List<Produkt> produkty = new ArrayList<Produkt>();
    private List<Tranzakcja> tranzakcja = new ArrayList<Tranzakcja>();

    public void setProdukty(int numerProdoktu, String nazwa, BigDecimal cena, int ilosc) {
        if(this.czyIstniejeTakiNumer(numerProdoktu))
            this.produkty.add(new Produkt(numerProdoktu, nazwa, cena, ilosc));
    }

    private boolean czyIstniejeTakiNumer(int numerProdoktu) {
        System.out.println(podajNajnizszyWolnyNumerProduktu());
        boolean exist = true;
        for(Produkt obiekt: this.produkty){
            if(obiekt.numerProdoktu == numerProdoktu)
                exist = false;
        }
        return exist;
    }

    private int podajNajnizszyWolnyNumerProduktu() {
        int wynik = 1;
        boolean powtorz = true;

        while (powtorz) {
            powtorz = false;

            for (Produkt produkt : this.produkty) {
                if (produkt.numerProdoktu == wynik) {
                    powtorz = true;
                    break;
                }
            }

            if (powtorz) {
                wynik++;
            }
        }

        return wynik;
    }

    public void setTranzakcja(List<Tranzakcja> tranzakcja) {
        this.tranzakcja = tranzakcja;
    }
    public void wypiszProdukty(){
        for(Produkt obiekt: this.produkty){
            System.out.println( obiekt.numerProdoktu + " " +
                                obiekt.nazwa + " " +
                                obiekt.cena + " " +
                                obiekt.ilosc);
        }
    }

    public List<Produkt> getProdukty() {
        return produkty;
    }

    public List<Tranzakcja> getTranzakcja() {
        return tranzakcja;
    }
}
