import java.util.Scanner;

public class VypocetGeomTeles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte delky stran kvadru: ");
        int stranaA = sc.nextInt();
        int stranaB = sc.nextInt();
        int stranaC = sc.nextInt();

        int objemKvadru = stranaA * stranaB * stranaC;
        int plochaPlasteKvadru = 2 * (stranaA * stranaB + stranaB * stranaC + stranaA * stranaC);
        System.out.println("Objem kvadru je: " + objemKvadru);
        System.out.println("Plocha plaste kvadru je: " + plochaPlasteKvadru);

        //vypocet pres stejne objemy
        int delkaStranyKrychle = (int) Math.cbrt(objemKvadru);
        System.out.println("Delka strany krychle je: " + delkaStranyKrychle);

        int polomerKoule = (int) Math.cbrt((objemKvadru * 0.75) / Math.PI);
        System.out.println("Polomer koule je: " + polomerKoule);

        int delkaStranyCtyrstenu = (int) Math.cbrt(objemKvadru * (12 / Math.sqrt(2)));
        System.out.println("Delka strany ctyrstenu je: " + delkaStranyCtyrstenu);

        //vypocet pres stejne plochy
        delkaStranyKrychle = (int) Math.sqrt(plochaPlasteKvadru / 6);
        System.out.println("Delka strany krychle pres stejne plochy je: " + delkaStranyKrychle);

        polomerKoule = (int) Math.sqrt(plochaPlasteKvadru / (4 * Math.PI));
        System.out.println("Polomer koule pres stejne plochy je: " + polomerKoule);

        delkaStranyCtyrstenu = (int) Math.sqrt(plochaPlasteKvadru / Math.sqrt(3));
        System.out.println("Delka strany ctyrstenu pres stejne plochy je: " + delkaStranyCtyrstenu);

    }
}
