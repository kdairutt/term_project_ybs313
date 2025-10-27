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
    
    public int getSiparisID() {
        return siparisID;
    }
    
    public void setTutar(double p_tutar) {
        tutar = p_tutar;
    }
    
    public double getTutar() {
        return tutar;
    }
    
    public void urunEkle(Urun urun) {
        urunListesi.add(urun);
    }
    
    public ArrayList<Urun> getUrunListesi() {
        return urunListesi;
    }
    
    public void setPersonel(String p_ad, String p_soyad) {
        personel.setAd(p_ad);
        personel.setSoyad(p_soyad);
    }
    
    public String getPersonelInfo() {
        return String.format("Personelin Numarası: %s, Adı: %s, Soyadı: %s",
        personel.getID(), personel.getAd(), personel.getSoyad());
    }
    
}