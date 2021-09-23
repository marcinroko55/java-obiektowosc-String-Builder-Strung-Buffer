public class Main {
    public static void main(String[] args) {
        String domena = "http://naukajavy";
        StringBuilder[] adresyURL = new StringBuilder[6];

        adresyURL[0] = new StringBuilder("http://kurczki.pl/sklep");
        adresyURL[1] = new StringBuilder("http://kurczki.pl/regulamin");
        adresyURL[2] = new StringBuilder("http://kurczki.pl/kontakt");
        adresyURL[3] = new StringBuilder("http://kurczki.pl/reklamacja");
        adresyURL[4] = new StringBuilder("http://kurczki.pl/RODO");

        for (int i = 0; i < adresyURL.length && adresyURL[i] != null; i++) {
            adresyURL[i] = adresyURL[i].delete(0, 14).insert(0, domena);
            System.out.println(adresyURL[i]);
        }
    }
}
