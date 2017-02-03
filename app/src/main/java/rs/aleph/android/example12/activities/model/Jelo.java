package rs.aleph.android.example12.activities.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 30.1.17..
 */

public class Jelo {
    /*сликом, називом, описом, категоријом, састојцима,
калоријском вредношћу и ценом*/
    private int id;
    private String slika;
    private String naziv;
    private  String opis;
    private Kategorija kategorija;
    private List<Sastojak> sastojci;
    private double kalorije;
    private BigDecimal cena;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    public List<Sastojak> getSastojci() {
        return sastojci;
    }

    public void setSastojci(List<Sastojak> sastojci) {
        this.sastojci = sastojci;
    }

    public double getKalorije() {
        return kalorije;
    }

    public void setKalorije(double kalorije) {
        this.kalorije = kalorije;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public Jelo() {}

    public Jelo(int id, String slika, String naziv, String opis, Kategorija kategorija, double kalorije, BigDecimal cena) {
        this.id = id;
        this.slika = slika;
        this.naziv = naziv;
        this.opis = opis;
        this.kategorija = kategorija;
        this.sastojci = new ArrayList<>();
        this.kalorije = kalorije;
        this.cena = cena;
    }
}
