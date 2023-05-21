package automat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AutomatTest {

    @Test
    void givenNewAutomatWhenFierstAdditionProductThenAddExpectedProduct() {
        //Given
        Automat automat = new Automat();
        //When
        BigDecimal cena = BigDecimal.valueOf(4.67);
        automat.setProdukty(1, "Lays zielona cebulka", cena, 10);
        automat.setProdukty(1, "Lays zielona cebulka", cena, 10);
        List<Produkt> produktyPobrane = automat.getProdukty();
        Produkt produktOczekiwany = new Produkt(1, "Lays zielona cebulka", cena, 10);
        //Then
        Assertions.assertTrue(produktyPobrane.contains(produktOczekiwany),
                "Na liście produktów nie ma tego produktu");
    }
}