package core;

import java.util.List;

public class Local {
    public List<Place> getLesPlaces() {
        return lesPlaces;
    }

    public void setLesPlaces(List<Place> lesPlaces) {
        this.lesPlaces = lesPlaces;
    }

    private List<Place> lesPlaces;

    public boolean assignePlaces(Groupe groupe){

        int nbrEtudiant = groupe.getLesEtudiants().size();
        int etudiantAssigne =0;
        int indexPlaces = 0;

        while(etudiantAssigne < nbrEtudiant){

            if(indexPlaces== this.lesPlaces.size()){
                return false;
            }

            else if(this.lesPlaces.get(indexPlaces).isAssigner()){
                indexPlaces++;
            }

            else{
                this.lesPlaces.get(indexPlaces).setEtudiant(groupe.getLesEtudiants().get(etudiantAssigne));
                this.lesPlaces.get(indexPlaces).setAssigner(true);
                for(int i=etudiantAssigne+1; i<this.lesPlaces.size();i++){
                    if(this.lesPlaces.get(indexPlaces).getPlacesProches().isEmpty()){

                    }
                    else{
                        for(int j = 0; j< this.lesPlaces.get(indexPlaces).getPlacesProches().size();j++){
                            if(this.lesPlaces.get(i).getNomPlace().equals(this.lesPlaces.get(indexPlaces).getPlacesProches().get(j).getNomPlace())){
                                this.lesPlaces.get(i).setAssigner(true);
                            }
                        }
                    }
                }
                etudiantAssigne++;
                indexPlaces++;
            }
        }
        return true;
    }
    public String toString(){
        String s = "";
        for(int i=0;i<this.lesPlaces.size();i++){
            if(this.lesPlaces.get(i).getEtudiant().getCip().isEmpty())
                s = s+ "\n" + this.lesPlaces.get(i).getNomPlace() + "\t" + "seat empty";

            else
                s = s+ "\n" + this.lesPlaces.get(i).getNomPlace() + "\t" + this.lesPlaces.get(i).getEtudiant().getCip();
        }
        return s;
    }
}
