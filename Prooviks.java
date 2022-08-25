
import ee.ut.kiho.graaf.Kuvar;

public class Prooviks {

    public static void invertBinaryTree(Tipp head) {
        if (head != null) {
            Tipp left = head.v, right = head.p;
            head.v = right;
            head.p = left;
            invertBinaryTree(head.v);
            invertBinaryTree(head.p);
        }
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
        Kuvar.kuvaPuu(juur);
        invertBinaryTree(juur);
        Kuvar.kuvaPuu(juur);
        //System.out.println(üksAlluv(uus));
    }
}
