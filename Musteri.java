import java.util.ArrayList;
public class Musteri {   
    private int musteriID;
    private String ad;
    private String soyad;
    private String kartNo;
    private String ePosta;
    private String telefonNo;
    private ArrayList<Urun> urunListesi;
    private Siparis siparis;
    
    public Musteri() {
        musteriID = 0;
        ad = "";
        soyad = "";
        kartNo = ""; 
        ePosta = "";
        telefonNo = "";
        urunListesi = new ArrayList<>();
        siparis = null;
    }
    
    public void siparisOlustur() {
        siparis = new Siparis();
    }
}