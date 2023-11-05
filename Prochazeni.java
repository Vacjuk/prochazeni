/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.prochazeni;
import java.util.Scanner;
/**
 *
 * @author Martin
 */
public class Prochazeni {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in, "Windows-1250");
        Hra hra = new Hra();
        String prikaz = "";

        //hlavni smyčka hry
        while (!prikaz.equalsIgnoreCase("konec")) {
            System.out.println(hra.vratAktualniLokaci());
            System.out.println("Zadej příkaz: ");
            prikaz = scanner.nextLine();
            hra.zpracujPrikaz(prikaz);
        }
    }
}
