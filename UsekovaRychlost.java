import java.util.Scanner;

public class UsekovaRychlost {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Jste v obci nebo mimo obec? (o/m):");
        String od = sc.next();
        System.out.print("Jste na dalnici? (a/n):");
        String od1 = sc.next();

        // System.out.print("Zadejte max povolenou rychlost vdanem useku v km/h: ");
        // int maxPov = sc.nextInt();

        //vypocet maximalni povolene rychlosti
        int maxPov = 0;
        if (od.equals("o") & od1.equals("n")){
            maxPov = 50;
        }
        else if (od.equals("o") & od1.equals("a")){
            maxPov = 80;
        }
        else if (od.equals("m") & od1.equals("n")){
            maxPov = 90;
        }
        else if (od.equals("m") & od1.equals("a")){
            maxPov = 130;
        }

        System.out.print("Zadejte delku useku v km: ");
        int delka = sc.nextInt();
        System.out.println("Zadejte casove udaje průjezdu vozidla začátkem (hh mm ss): ");
        int zachh = sc.nextInt();
        int zacmm = sc.nextInt();
        int zacss = sc.nextInt();
        System.out.println("Zadejte cas prujezdu koncem useku (hh mm ss): ");
        int konhh = sc.nextInt();
        int konmm = sc.nextInt();
        int konss = sc.nextInt();

        // prevod do hodin
        int casoveUdajeZacatkem = zachh + (zacmm / 60) + (zacss / 3600);
        int casoveUdajeKoncem = konhh + (konmm / 60) + (konss / 3600);
        // vypocet casu prujezdu a prumernou rychlosti
        int casPrujezdu = casoveUdajeKoncem - casoveUdajeZacatkem;
        int prumernaRychlost = delka / casPrujezdu;
        //kontrola prekrocenou rychlosti a jeji vypocet
        int prekrocenaRychlost = prumernaRychlost > maxPov ? -(maxPov - prumernaRychlost) : 0;
        //vypocet pokuty
        int pokuta = prekrocenaRychlost > 19 ? 1000 : 0;
        int pokuta1 = prekrocenaRychlost > 39 ? 2500 : 0;
        //vystup
        System.out.println("Prumerna rychlost je:" + " " + prumernaRychlost);
        System.out.println("Prekrocena rychlost je o:" + " " + prekrocenaRychlost);
        //kontrola jest-li je pokuta nebo ne
        int pokutaVysledek = pokuta != 0 ? pokuta : pokuta1;
        System.out.print("Pokuta je: " + pokutaVysledek);
    }

}
