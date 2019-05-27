package ba.unsa.rs.tutorijal10;

import java.io.Serializable;
import java.util.ArrayList;

public class Grad implements Serializable {

    private String naziv;
    private Integer brojStanovnika;
    private ArrayList<Double> temperature;

    public Grad(String naziv, Integer brojStanovnika, ArrayList<Double> temperature) {
        this.naziv = naziv;
        this.brojStanovnika = brojStanovnika;
        this.temperature = temperature;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(Integer brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public ArrayList<Double> getTemperature() {
        return temperature;
    }

    public void setTemperature(ArrayList<Double> temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        String s = naziv + ", " + brojStanovnika;
        for (double d: temperature) {
            s += ", " + d;
        }
        return s;
    }
}
