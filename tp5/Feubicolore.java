package tp5;

public class Feubicolore {
    private String couleur;

    /**
     * @param
     * @pre couleur == "vert" or couleur == "rouge"
     * @post couleur == "vert" or couleur == "rouge"
     * @return
     * on accepte un modification sans effet
     */

    public Feubicolore(String couleur){
        this.couleur= couleur;
    }
    public String getCouleur() {
        return couleur;
    }

    public String setCouleur(String c){
        //precondition
        assert c == "vert" || c== "rouge":
                "precondition violated";

        this.couleur= c ;

        //postcondition
        assert this.couleur==c:
                "postcondition violated";

        return this.couleur;




    }
}
