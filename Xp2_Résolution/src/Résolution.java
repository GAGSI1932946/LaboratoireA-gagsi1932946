import java.util.Scanner;

public class Résolution {

    public static void main(String[] args){

        //déclaration des variables

        double a,b,c,x1,x2,discriminant;
        Scanner sc = new Scanner(System.in);

        //question à l'utilisateur
        System.out.println("Entrée des valeurs...");
        System.out.print("a > ");
        a = sc.nextDouble();
        System.out.print("b > ");
        b = sc.nextDouble();
        System.out.print("c > ");
        c = sc.nextDouble();
        System.out.println("Equation : " + a + "x2+" + b + "x+" + c + "=0");

        //calcul discriminant
        discriminant = Math.pow(b,2)-(4*c*a);
        System.out.println("Discriminant : " +discriminant);

        //calcul x1

        x1 = (-b + Math.sqrt(discriminant)) / (2*a);
        System.out.println("X1 : " + x1);

        //calcul x2

        x2 = (-b - Math.sqrt(discriminant)) / (2*a);
        System.out.println("X2 : " + x2);

    }
}
