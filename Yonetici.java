import java.util.ArrayList;
public class Yonetici {
    private static int idSayaci = 0;
    private int yoneticiID;
    private String ad;
    private String soyad;
    private ArrayList<Urun> urunListesi;
    private ArrayList<Personel> personel;
    
    public Yonetici() {
        yoneticiID = ++idSayaci;
        ad = "";
        soyad = "";
        personel = new ArrayList<>();
        urunListesi = new ArrayList<>();
    }
}