import java.util.Scanner;

public class vecteur {

    public static void main(String[] args){

        //Declaration des variables

        float xa;
        float ya;
        float za;
        float xb;
        float yb;
        float zb;
        float distance;
        Scanner sc = new Scanner(System.in);

        //Questions à l'utilisateur

        System.out.println("Quelles sont les coordonnees du point A ?");
        System.out.print("xa : ");
        xa = sc.nextFloat();
        System.out.print("ya : ");
        ya = sc.nextFloat();
        System.out.print("za : ");
        za = sc.nextFloat();
        System.out.println("Le point A (" + xa + "," + ya + "," + za + ")");
        System.out.println("Quelles sont les coordonnees du point B ?");
        System.out.print("xb : ");
        xb = sc.nextFloat();
        System.out.print("yb : ");
        yb = sc.nextFloat();
        System.out.print("zb : ");
        zb = sc.nextFloat();
        System.out.println("Le point B (" + xb + "," + yb + "," + zb + ")");
        sc.close();

        //Operations

        distance = (float) Math.sqrt(Math.pow((xb - xa),2) + Math.pow((yb-ya),2) + Math.pow((zb-za),2));

        //Resultat

        System.out.println("La distance est : " + distance);
    }
}
