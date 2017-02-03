package rs.aleph.android.example12.activities.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alen on 03-Feb-17.
 */

public class Kategorija {
    private int id;
    private String naziv;
    private List<Jelo> jela;

    public Kategorija() {
        this.jela = new ArrayList<>();
    }

    public Kategorija(int id, String naziv) {
        this.id = id;
        this.naziv = naziv;
        this.jela = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Jelo> getJela() {
        return jela;
    }

    public void setJela(List<Jelo> jela) {
        this.jela = jela;
    }
}
