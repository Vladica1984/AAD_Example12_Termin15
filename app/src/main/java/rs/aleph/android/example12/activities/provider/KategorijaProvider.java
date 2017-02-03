package rs.aleph.android.example12.activities.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.activities.model.Kategorija;

/**
 * Created by Alen on 03-Feb-17.
 */

public class KategorijaProvider {

    public static List<String> getKategorijaNazivi() {

        List<String> nazivi = new ArrayList<>();
        nazivi.add("Kategorija 1");
        nazivi.add("Kategorija 2");
        return nazivi;
    }
    public static Kategorija getKategorijaById(int id){
        switch (id) {
            case 0:
                return new Kategorija(0,"Kategorija 1");
            case 1:
                return new Kategorija(1,"Kategorija 2");
            default:
                return null;
        }
    }
}
