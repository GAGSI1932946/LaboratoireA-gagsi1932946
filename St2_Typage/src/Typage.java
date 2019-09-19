public class Typage {

    public static void main(String[] args){

        //Identification des variables

        int var1 = 10;
        float var2 = 6/5;
        char var3 = 5;

        //Première conversion

        String var1String = Integer.toString(var1);
        System.out.println("conversion 1 : " + var1String);

        //Seconde conversion(impossible a cause du boolean)

        boolean var1Boolean = (var1 == 100);
        System.out.println("conversion 2 : " + var1Boolean);

        //Tierce conversion

        int var2int = (int)var2;
        System.out.println("conversion 3 : " + var2);

        //Quatrième conversion

        String var2String = Integer.toString(var2int);
        System.out.println("conversion 4 : " + var2int);

        //Cinquième conversion

        int var3int = (int)var3;
        System.out.println("conversion 5 : " + var3int);

    }
}
