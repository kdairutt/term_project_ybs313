import java.util.ArrayList;
public class Yonetici {
    private static int idSayaci = 0;
    private int yoneticiID;
    private String ad;
    private String soyad;
    private ArrayList<Urun> stokListesi;
    private ArrayList<Personel> personeller;
    private ArrayList<Siparis> siparisler;
    public Yonetici() {
        yoneticiID = ++idSayaci;
        ad = "";
        soyad = "";
        personeller = new ArrayList<>();
        stokListesi = new ArrayList<>();
        siparisler = new ArrayList<>();
    }
    
    public int getYoneticiID() {
        return yoneticiID;
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
    
    public void stokUrunEkle(Urun urun) {
        stokListesi.add(urun);
    }
    
    public void urunAdetEkle(int artis, String p_ad) {
        for(Urun urun : stokListesi) {
            if(urun.getAd().equalsIgnoreCase(p_ad)) {
                urun.stokAdediArttir(artis);
            }
        }
    }
    
    public void stokUrunSil(Urun urun) {
        stokListesi.remove(urun);
    }
    
    public String tumSiparislerinBilgileri() {
        StringBuilder yazici = new StringBuilder();
        
        for (Siparis siparis : siparisler) {
            yazici.append(String.format("Sipariş Numarası: %s | Sipariş Tutarı: %s | Personel: %s |\n",
            siparis.getSiparisID(),
            siparis.getTutar(),
            siparis.getPersonelInfo()
            )
            );
            
            for(Urun urun : siparis.getUrunListesi()) {
                yazici.append(String.format(" -- Ürün: %s | Kategori: %s | Fiyat: %s TL |\n",
                urun.getAd(),
                urun.getKategori(),
                urun.getFiyat()
                )
                );
            }
            
            yazici.append("\n");
        }
        return yazici.toString();
    }
    
    public String tumPersonellerinBilgileri() {
        StringBuilder yazici = new StringBuilder();
        
        for (Personel personel : personeller) {
            yazici.append(String.format("Personel Numarası: %s | Personel Adı: %s | Personel Soyadı: %s |",
            personel.getPersonelID(),
            personel.getAd(),
            personel.getSoyad()
            )
            );
        }
        
        return yazici.toString();
    }
}