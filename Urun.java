public class Urun {
    private static int idSayaci = 0;
    private int urunID;
    private String ad;
    private double fiyat;
    private int stokAdedi;
    private String kategori;
    
    public Urun() {
        urunID = ++idSayaci;
        ad = "";
        fiyat = 0.0;
        stokAdedi = 0;
        kategori = "";
    }
    
    public int getUrunID() {
        return urunID;
    }
    
    public void setAd(String p_ad) {
        ad = p_ad;
    }
    
    public String getAd() {
        return ad;
    }
    
    public void setFiyat(double p_fiyat) {
        fiyat = p_fiyat;
    }
    
    public double getFiyat() {
        return fiyat;
    }
    
    public void stokAdediArttir(int miktar) {
        stokAdedi += miktar;
    }
    
    public void setStokAdedi(int p_stokAdedi) {
        stokAdedi = p_stokAdedi;
    }
    
    public int getStokAdedi() {
        return stokAdedi;
    }
    
    public void setKategori(String p_kategori) {
        kategori = p_kategori;
    }
    
    public String getKategori() {
        return kategori;
    }
}