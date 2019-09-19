import java.text.DecimalFormat;
import java.util.Scanner;

public class Convertisseur2 {

    public static void main(String[] args) {


    //déclaration des variables
    double nbRad;
    int nbDeg;
    Scanner sc = new Scanner(System.in);

    //question à l'utilisateur
    System.out.print("Quel est l'angle en degrés? : ");
    nbDeg = (int) sc.nextFloat();

    //operation
    nbRad = (float) (nbDeg*Math.PI/180);

        //Deux decimales
        DecimalFormat df = new DecimalFormat("#.##");
        //Resultat
        System.out.print("Valeur en radians integree : " + df.format(nbRad));

    sc.close();
}
}

