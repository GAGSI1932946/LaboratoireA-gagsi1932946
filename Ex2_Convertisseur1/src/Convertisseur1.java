import java.util.Scanner;

public class Convertisseur1 {

    public static void main(String[] args) {


        //déclaration des variables
    float nbRad;
    int nbDeg;
    Scanner sc = new Scanner(System.in);

    //question à l'utilisateur
    System.out.print("Quel est l'angle en radiant? : ");
    nbRad =sc.nextFloat();

    //operation
    nbDeg = (int) (nbRad*180/Math.PI);

    //resultat
    System.out.print("Valeur en degrés : " + nbDeg);

            sc.close();
}
}
