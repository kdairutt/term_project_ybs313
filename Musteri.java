import java.util.ArrayList;
public class Musteri {   
    private static int idSayaci = 0;
    private int musteriID;
    private String ad;
    private String soyad;
    private String kartNo;
    private String ePosta;
    private String telefonNo;
    private ArrayList<Urun> urunListesi;
    private Siparis siparis;
    
    public Musteri() {
        musteriID = ++idSayaci;
        ad = "";
        soyad = "";
        kartNo = ""; 
        ePosta = "";
        telefonNo = "";
        urunListesi = new ArrayList<>();
        siparis = null;
    }
    
    public int getMusteriID() {
        return musteriID;
    }
    
    public void setAd(String p_ad) {
        ad = p_ad;
    }
    
    public String getAd() {
        return ad;
    }
    
    public void setSoyad(String p_soyad) {
        soyad = p_soyad;
    }
    
    public String getSoyad() {
        return soyad;
    }    
    
    public void setKartNo(String p_kartNo) {
        kartNo = p_kartNo;
    }
    
    public String getKartNo() {
        return kartNo;
    }
    
    public void setePosta(String p_ePosta) {
        ePosta = p_ePosta;
    }
    
    public String getePosta() {
        return ePosta;
    }
    
    public void setTelefonNo(String p_telefonNo) {
        telefonNo = p_telefonNo;
    }
    
    public String getTelefonNo() {
        return telefonNo;
    }
    
    public String getUrunBilgisi(String p_urunAd) {
        for (Urun urun : urunListesi) {
            if (urun.getAd().equalsIgnoreCase(p_urunAd)) {
                return String.format(
                    "Ürün Adı: %s | Ürün kategorisi: %s | Ürün Fiyatı: %s TL |",
                    urun.getAd(),
                    urun.getKategori(),
                    urun.getFiyat()
                );
            }
        }
        
        return "Ürün bilgisi bulunamadı.";
    }
    
    public void siparisOlustur() {
        siparis = new Siparis();
    }
    
    
}