
import ee.ut.kiho.graaf.Kuvar;

/**
 * Õpilase nimi: Aksel Õim
 * Programmeerimine 2 - KT 4 25.05.2022. Palume mitte "package" märksõna lisada,
 * koodis meetodite signatuure muuta, ega (ka tühje) meetodeid kustutada!
 */

public class Kt4 {

    /**
     * Meetod leiab kahendpuus olevate tipude arvu, millel on täpselt 1 alluv
     *
     * @param t, Tipp, mis meil huvi pakub
     * @return Täisarv, mitu tippu leidus, millel on täpselt 1 alluv
     */
    public static int üksAlluv(Tipp t) {
        if (t == null || t.v == null && t.p == null)
            return 0;
        if (t.v != null && t.p == null)
            return 1 + üksAlluv(t.v);

        if (t.v == null && t.p != null)
            return 1 + üksAlluv(t.p);

        return üksAlluv(t.v) + üksAlluv(t.p);
    }


    /**
     * Meetod "lõikab" sügavaimal tasemel olevad lehed ära ehk eemaldab nad puust
     *
     * @param t Tipp, mida uurime
     * @return
     */
    public static Tipp sügavadLehedMaha(Tipp t) {
        if (leiaKõrgus(t) == 1)
            return null;
        return sügavadLehedMahaRek(t, leiaKõrgus(t), 0);
    }

    /**
     * Meetod lõikab kõige sügavamal olevad tipud maha
     *
     * @param juur Tipp, mida uurime
     * @param h    Puu kõrgus
     * @param i    Kui kõrgel puus oleme
     * @return Uus Puu
     */
    private static Tipp sügavadLehedMahaRek(Tipp juur, int h, int i) {
        if (juur == null)
            return null;
        if (i == h - 1)
            return null;
        Tipp vasem = sügavadLehedMahaRek(juur.v, h, i + 1);
        Tipp parem = sügavadLehedMahaRek(juur.p, h, i + 1);


        Tipp uus = new Tipp(juur.info, vasem, parem);
        uus.x = 1 + Math.max(kõrgus(vasem), kõrgus(parem));
        return uus;
    }

    /**
     * Meetod kontrollib kui kõrgel tipp puus on
     *
     * @param juur Tipp, mis meid huvitab
     * @return Täisarv
     */
    private static int kõrgus(Tipp juur) {
        if (juur == null)
            return 0;
        return juur.x;
    }


    /**
     * Meetod leiab terve puu kõrguse
     *
     * @param t Juur tipp
     * @return int, puu kõrgus
     */
    private static int leiaKõrgus(Tipp t) {

        int vasem = 0;
        int parem = 0;

        if (t.v != null)
            vasem = leiaKõrgus(t.v);

        if (t.p != null)
            parem = leiaKõrgus(t.p);

        return Math.max(vasem, parem) + 1;
    }

    /**
     * Meetod leiab lühima tee kahendpuu tipudeni
     *
     * @param t, Tipp, mis meid huvitab
     * @return Uus puu
     */
    public static Tipp lühimTeeLeheni(Tipp t) {
        if (t == null)
            return null;
        //throw new UnsupportedOperationException("Kirjuta oma lahendus selle rea asemele. Juhul kui ülesanne jääb lahendamata jäta see rida alles.");
        if (t.v != null && t.p != null){
            t.info = String.valueOf(Integer.parseInt(t.info) + (Math.min(Integer.parseInt(t.v.info),Integer.parseInt(t.p.info))));
        }
        if (t.v != null && t.p == null)
            t.info = String.valueOf(Integer.parseInt(t.info) + (Integer.parseInt(t.p.info)));

        Tipp vasem = lühimTeeLeheni(t.v);
        Tipp parem = lühimTeeLeheni(t.p);


        Tipp uus = new Tipp(t.info, vasem, parem);
        uus.x = 1 + Math.min(kõrgus(vasem), kõrgus(parem));
        return uus;
    }

    public static void main(String[] args) {
        // Siin võib vabas vormis oma lahendust testida.
        // Automaattestid töid hinnates main meetodit ei käivita. (Samas peab siiski kompileeruma!)

        //Puu 1. ülesande näidisest
        Tipp juur = new Tipp("A");
        Tipp B = new Tipp("B");
        Tipp C = new Tipp("C");
        Tipp D = new Tipp("D");
        Tipp E = new Tipp("E");
        Tipp F = new Tipp("F");
        Tipp G = new Tipp("G");
        juur.v = B;
        juur.p = C;
        B.v = D;
        B.p = E;
        C.p = F;
        D.p = G;
        //System.out.println(üksAlluv(uus));
    }
}
