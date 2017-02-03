package rs.aleph.android.example12.activities.model;

/**
 * Created by Alen on 03-Feb-17.
 */

public class Sastojak {
    private int id;
    private String naziv;

    private Jelo jelo;

    public Sastojak() {
    }

    public Sastojak(int id, String naziv, Jelo jelo) {
        this.id = id;
        this.naziv = naziv;
        this.jelo = jelo;
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

    public Jelo getJelo() {
        return jelo;
    }

    public void setJelo(Jelo jelo) {
        this.jelo = jelo;
    }
}
