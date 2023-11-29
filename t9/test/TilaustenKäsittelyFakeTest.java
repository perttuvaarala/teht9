import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TilaustenKäsittelyFakeTest {
    @Test
    public void testaaKäsittelijäWithFakeHinnoittelija() {
// Arrange
        float alkuSaldo = 100.0f;
        float listaHinta = 30.0f;
        float alennus = 20.0f;
        float loppuSaldo = alkuSaldo - (listaHinta * (1 - alennus / 100));
        Asiakas asiakas = new Asiakas(alkuSaldo);
        Tuote tuote = new Tuote("TDD in Action", listaHinta);
        IHinnoittelija hinnoittelija = (IHinnoittelija) new FakeHinnoittelija(alennus);
// Act
        TilaustenKäsittely käsittelijä = new TilaustenKäsittely();
        käsittelijä.setHinnoittelija((IHinnoittelija) hinnoittelija);
        käsittelijä.kasittele(new Tilaus(asiakas, tuote));
        // Assert
        assertEquals(loppuSaldo, asiakas.getSaldo(), 0.001);
    }
}
