package tp5;

public class Parking {
    private int Place;
    private int Nombre_voiture=0;
    /**
     *
     */
    public Parking(int n){

        this.Place=n;
    }

    public setPlace(int n){
        this.Place=n;
        return System.out.println(("Le parking a une capacité de "+this.Place);
    }

    public int getPlace() {
        return Place;
    }
    public int getNombre_voiture(){

        return Nombre_voiture;
    }
    /**
     * @param
     * @pre voiture_entree => 0
     * @invariant Nombre_voiture < Place
     * @post Place > 0
     */
    public int setEntree(int voiture_entree) {

        //precondition
        assert voiture_entree > 0 :
        "precondition violated";


        this.Nombre_voiture += voiture_entree;
        this.Place-=voiture_entree;

        //postcondition
        assert Place > 0 :
                "postcondtion violated";

        return this.Place;
    }

    /**
     * @pre voiture_sorti > 0
     *@invariant Nombre_voiture < Place
     * @post Place > 0
     * @param voiture_sortie
     */
    public int setSortie(int voiture_sortie) {

        //precondition

        assert voiture_sortie > 0 :
        "precondition violated";

        Nombre_voiture -=voiture_sortie;
        Place+=voiture_sortie;

        //postcondition
        assert Place > 0 :
                "postcondtion violated";


        return this.Place;
    }
}
