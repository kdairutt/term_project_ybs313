public class Personel {
    private static int idSayaci = 0;
    private int personelID;
    private String ad;
    private String soyad;
    
    public Personel() {
        personelID = ++idSayaci;
        ad = "";
        soyad = "";
    }
    
    public int getPersonelID() {
        return personelID;
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
}