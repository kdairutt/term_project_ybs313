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
}