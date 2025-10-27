import java.util.ArrayList;

public class Siparis {
    private int siparisID;
    private double tutar;
    private ArrayList<Urun> urunListesi;
    private Personel personel;
    
    public Siparis () {
        siparisID = 0;
        tutar= 0.0;
        urunListesi = new ArrayList<>();
        personel = new Personel();
    }
}