import java.util.Scanner;

public class salutation {

    public static void main(String[] args) {

        // declaration des variables
        String nom;
        Scanner sc = new Scanner(System.in);

        //question à l'utilisateur
        System.out.print ("Quel est ton nom? : ");
        nom = sc.next();

        //resultat
        System.out.print("Bonjour," + nom);

        sc.close();



    }
}
