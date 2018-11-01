package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj implements  Comparable<TelefonskiBroj> {
    private int mobilnaMreza;
    private  String broj;

    public MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        String ispisi = "0" + mobilnaMreza + broj;
        return ispisi;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
