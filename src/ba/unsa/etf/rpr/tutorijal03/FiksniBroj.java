package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj implements  Comparable<TelefonskiBroj>{


    @Override
    public int compareTo(TelefonskiBroj telefonskiBroj) {
        return 0;
    }

    public enum Grad { TRAVNIK, ORASJE, ZENICA, SARAJEVO,
                        LIVNO, TUZLA, MOSTAR, BIHAC,
                        GORAZDE, SIROKI_BRIJEG, BRCKO};
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    @java.lang.Override
    public String ispisi() {
        String pozivni = "";
        if (grad == Grad.TRAVNIK) pozivni = "030/";
        if (grad == Grad.ORASJE) pozivni = "031/";
        if (grad == Grad.ZENICA) pozivni = "032/";
        if (grad == Grad.SARAJEVO) pozivni = "033/";
        if (grad == Grad.LIVNO) pozivni = "034/";
        if (grad == Grad.TUZLA) pozivni = "035/";
        if (grad == Grad.MOSTAR) pozivni = "036/";
        if (grad == Grad.BIHAC) pozivni = "037/";
        if (grad == Grad.GORAZDE) pozivni = "038/";
        if (grad == Grad.SIROKI_BRIJEG) pozivni = "039/";
        if (grad == Grad.BRCKO) pozivni = "049/";

        pozivni += broj;

        return pozivni;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
