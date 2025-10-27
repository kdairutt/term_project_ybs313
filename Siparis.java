import java.util.ArrayList;

public class Siparis {
    private static int idSayaci = 0;
    private int siparisID;
    private double tutar;
    private ArrayList<Urun> urunListesi;
    private Personel personel;
    
    public Siparis () {
        siparisID = ++idSayaci;
        tutar= 0.0;
        urunListesi = new ArrayList<>();
        personel = new Personel();
    }
}