package rs.aleph.android.example12.activities.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example12.activities.model.Jelo;
import rs.aleph.android.example12.activities.model.Sastojak;

/**
 * Created by Alen on 03-Feb-17.
 */

public class SastojakProvider {

    public static List<String> getSastojakNazivi(Jelo jelo) {
        List<String> nazivi = new ArrayList<>();
        for (Sastojak sastojak : jelo.getSastojci()
                ) {
            nazivi.add(sastojak.getNaziv());
        }
        return nazivi;
    }
}