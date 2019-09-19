
public class Géométrie {

    public static void main(String[] args) {

        //déclaration des variables

        double rCercle;
        double cCube;
        double rCylindre;
        double hCylindre;
        double rCone;
        double hCone;

        double aCone;
        double surfaceCercle;
        double surfaceCube;
        double volumeCube;
        double surfaceCylindre;
        double volumeCylindre;
        double surfaceCone;
        double volumeCone;

        //valeurs

        rCercle = 10.0;
        cCube = 7.0;
        rCylindre = 10.0;
        hCylindre = 5.0;
        rCone = 3.0;
        hCone = 7.0;

        //calcul cercle

        surfaceCercle = (float) (Math.PI*Math.pow(rCercle, 2));

        //calcul cube

        surfaceCube = (float) (6*Math.pow(cCube, 2));
        volumeCube = (float) (Math.pow(cCube, 3));

        //calcul cylindre

        surfaceCylindre = (float) ((Math.PI*2*rCylindre*hCylindre)+2*(Math.PI*Math.pow(rCylindre, 2)));
        volumeCylindre = (float) (Math.PI*Math.pow(rCylindre, 2)*hCylindre);

        //calcul cone

        aCone = Math.sqrt (Math.pow(rCone,2) + Math.pow(hCone,2));
        surfaceCone = (Math.PI * rCone * aCone) + (Math.PI* Math.pow(rCone,2));
        volumeCone = (Math.PI* Math.pow(rCone,2) * hCone)/3;

        //affichage

        System.out.println("Le cercle");
        System.out.println(" - Rayon     : " + rCercle);
        System.out.println(" - Surface   : " + surfaceCercle);
        System.out.println("Le cube");
        System.out.println(" - Longueur  : " + cCube);
        System.out.println(" - Surface   : " + surfaceCube);
        System.out.println(" - Volume    : " + volumeCube);
        System.out.println("Le cylnidre");
        System.out.println(" - Rayon     : " + rCylindre);
        System.out.println(" - Hauteur   : " + hCylindre);
        System.out.println(" - Surface   : " + surfaceCylindre);
        System.out.println(" - Volume    : " + volumeCylindre);
        System.out.println(" Le cone");
        System.out.println(" - Rayon     : " + rCone);
        System.out.println(" - hauteur   : " + hCone);
        System.out.println(" - apothème  : " + aCone);
        System.out.println(" - Surface   : " + surfaceCone);
        System.out.println(" - Volume    : " + volumeCone);






















    }

}
