import java.util.ArrayList;
public class Yonetici {
    private int yoneticiID;
    private String ad;
    private String soyad;
    private ArrayList<Urun> urunListesi;
    private ArrayList<Personel> personel;
    
    public Yonetici() {
        yoneticiID = 0;
        ad = "";
        soyad = "";
        personel = new ArrayList<>();
        urunListesi = new ArrayList<>();
    }
}