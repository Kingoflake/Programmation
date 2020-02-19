package tp5;

import java.util.Scanner;

public class Controleur {


    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int nombre_place ;
       int voiture;
       Feubicolore feu;
       Barriere barriere_entree;
       Barriere barriere_sortie;

       System.out.println("entrez le nombre de place de parking");
       nombre_place = sc.nextInt();

       Parking parking = new Parking(nombre_place);


       if (parking.getNombre_voiture()!= parking.getPlace()){
           feu.setCouleur("vert");
       }

       else{ feu.setCouleur("rouge");

       }

      if

       Boolean continu = true;

       while (continu == true){






        }
    }
}
