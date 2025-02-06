package jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Concert {
    @Id
    private int id;
    private String intitulé;
    private String date;
    private String artiste;
    private int placesTotales;
    private int placesRestantes;

    private List<Ticket> tickets;
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public int getPlacesTotales() {
        return placesTotales;
    }

    public void setPlacesTotales(int placesTotales) {
        this.placesTotales = placesTotales;
    }

    public int getPlacesRestantes() {
        return placesRestantes;
    }

    public void setPlacesRestantes(int placesRestantes) {
        this.placesRestantes = placesRestantes;
    }


    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }




}
