package com.company;

public class Oferta {
    private String id;
    private String unternehmensname;
    private String preis;
    private String prozent;
    private String adresse;
    private Ort ort;

    public Oferta(String id, String unternehmensname, String preis, String prozent, String adresse, Ort ort) {
        this.id = id;
        this.unternehmensname = unternehmensname;
        this.preis = preis;
        this.prozent = prozent;
        this.adresse = adresse;
        this.ort = ort;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnternehmensname() {
        return unternehmensname;
    }

    public void setUnternehmensname(String unternehmensname) {
        this.unternehmensname = unternehmensname;
    }

    public String getPreis() {
        return preis;
    }

    public void setPreis(String preis) {
        this.preis = preis;
    }

    public String getProzent() {
        return prozent;
    }

    public void setProzent(String prozent) {
        this.prozent = prozent;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Ort getOrt() {
        return ort;
    }

    public void setOrt(Ort ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", unternehmensname='" + unternehmensname + '\'' +
                ", preis=" + preis +
                ", prozent=" + prozent +
                ", adresse='" + adresse + '\'' +
                ", ort=" + ort +
                '}';
    }

}
