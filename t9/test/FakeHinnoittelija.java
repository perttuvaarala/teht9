
public class FakeHinnoittelija {
    private float alennus;
    public FakeHinnoittelija(float alennus) {
        this.alennus = alennus;
    }
    public float getAlennusProsentti(Asiakas asiakas, Tuote tuote) {
        return alennus;
    }

    public void aloita() {

    }

    public void setAlennusProsentti(Asiakas asiakas, float v) {

    }

    public void lopeta() {

    }
}
