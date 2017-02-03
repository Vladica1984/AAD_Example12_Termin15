package rs.aleph.android.example12.activities.provider;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.activities.model.Jelo;
import rs.aleph.android.example12.activities.model.Kategorija;
import rs.aleph.android.example12.activities.model.Sastojak;

/**
 * Created by Alen on 03-Feb-17.
 */

public class JeloProvider {

    public static List<String> getJelaNazivi() {

        List<String> nazivi = new ArrayList<>();
        nazivi.add("Jelo 1");
        nazivi.add("Jelo 2");
        nazivi.add("Jelo 3");
        nazivi.add("Jelo 4");
        nazivi.add("Jelo 5");
        return nazivi;
    }

    public static Jelo getJeloById(int id){
        Kategorija k1 = new Kategorija(0,"Kategorija 1");
        Kategorija k2 = new Kategorija(1,"Kategorija 2");
        Jelo rezultat;
        switch (id) {
            case 0: {
                rezultat = new Jelo(0, "bananas.jpg", "Jelo 1", "Opis 1", k1, 100, BigDecimal.valueOf(1000));
                rezultat.getSastojci().add(new Sastojak(0, "Sastojak 1 za jelo 1", rezultat));
                rezultat.getSastojci().add(new Sastojak(1, "Sastojak 2 za jelo 1", rezultat));
                break;
            }
            case 1: {
                rezultat = new Jelo(1, "bananas.jpg", "Jelo 2", "Opis 2", k2, 200, BigDecimal.valueOf(2000));

                rezultat.getSastojci().add(new Sastojak(0, "Sastojak 1 za jelo 2", rezultat));
                rezultat.getSastojci().add(new Sastojak(1, "Sastojak 2 za jelo 2", rezultat));

                break;
            }
            case 2: {
                rezultat = new Jelo(2, "bananas.jpg", "Jelo 3", "Opis 3", k2, 300.30, BigDecimal.valueOf(3000));
                break;
            }
            case 3: {
                rezultat = new Jelo(3, "bananas.jpg", "Jelo 4", "Opis 4", k2, 400, BigDecimal.valueOf(4000));
                break;
            }
            case 4: {
                rezultat = new Jelo(4, "bananas.jpg", "Jelo 5", "Opis 5", k2, 500.50, BigDecimal.valueOf(5000));
                break;
            }
            default:
                rezultat = null;
        }
        return rezultat;
    }
}
