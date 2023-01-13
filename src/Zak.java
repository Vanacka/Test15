import java.io.Serializable;
import java.util.ArrayList;

public class Zak implements Serializable, Comparable<Zak> {
    String jmeno;
    int znamka;
    ArrayList<Integer> znamky = new ArrayList<>();

    public Zak(String jmeno, int znamka) {
        this.jmeno = jmeno;
        this.znamka = znamka;
        znamky.add(znamka);
    }
    public void zprumeruj () {
        int k = 1;

        for (int i = 0; i < znamky.size(); i++) {
            k = k + znamky.get(i);
        }
        znamka = k / znamky.size();
        znamka = Math.round(znamka);
    }

    @Override
    public int compareTo(Zak o) {
        if (jmeno.compareTo(o.jmeno) > 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Zak{" +
                "jmeno='" + jmeno + '\'' +
                ", znamka=" + znamka +
                '}';
    }
}
