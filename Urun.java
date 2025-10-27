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
}