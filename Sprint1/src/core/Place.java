package core;

import java.util.List;

public class Place {
    private String nomPlace;
    private boolean isAssigner;
    private Etudiant etudiant;
    private List<Place> placesProches;

    public Place(String nom){
        nomPlace = nom;
        etudiant = new Etudiant("");
    }
    public String getNomPlace() {
        return nomPlace;
    }

    public void setNomPlace(String nomPlace) {
        this.nomPlace = nomPlace;
    }

    public boolean isAssigner() {
        return isAssigner;
    }

    public void setAssigner(boolean assigner) {
        isAssigner = assigner;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public List<Place> getPlacesProches() {
        return placesProches;
    }

    public void setPlacesProches(List<Place> placesProches) {
        this.placesProches = placesProches;
    }


}
