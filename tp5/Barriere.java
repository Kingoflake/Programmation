package tp5;

public class Barriere {
    private String nom;
    private String etat;

    /**
     * @pre
     * @return
     */
    public String getEtat() {
        return etat;
    }

    public String setEtat(String etat) {
        //precondition
        assert etat == "ouvert" || etat == "fermée":
                "preconditoin violated";

        this.etat = etat;

        //postcondition
        assert this.etat==etat:
                "postcondition violated";

        return this.etat;
    }
}
