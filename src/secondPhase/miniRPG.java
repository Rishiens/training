package secondPhase;

import java.util.Arrays;
import java.util.Scanner;

public class miniRPG {

     static void main(String[] args) {

         boolean spustenie = true;
        int hpHrac = 100;
        int utokHrac = 5;
        int utokNepriatel = 10;
        int hpNepriatel = 100;
        String[] schopnosti = {"silný útok","healing", "útek"};
        int [] hodnoty = {15, 25, 20};
         Scanner scanner = new Scanner(System.in);


         // tu pojdu uvodne texty


         System.out.println("1 - Začíname");
         System.out.println("2 - Ukončiť");
         int prolog = scanner.nextInt();

if (spustenie == true){
         switch (prolog) {
             case 1:
                 System.out.println("Tak ideme na to ty hrdina");
                 break;
             case 2:
                 System.out.println("Zbohom slabko");
                 spustenie = false;
                 break;
             default:
                 System.out.println("nehraj sa na testera");
         }

         }


         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();

         //menu hry

         System.out.println("====Mini rpg=====");
         System.out.println("1 - Spustiť hru");
         System.out.println("2 - pravidlá");
         System.out.println("0 - ypnúť hru");


         //si v hre a musis si vybrat utok z array

scanner.close();
    }
}
