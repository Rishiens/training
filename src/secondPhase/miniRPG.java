package secondPhase;

import java.util.Arrays;
import java.util.Scanner;

public class miniRPG {

     static void main(String[] args) {

         boolean spustenie = true;
         boolean zaProlog = false;
         boolean hraZacala = false;
         boolean smrt = false;
         boolean prezitie = false;
         int tahy = 0;
        int hpHrac = 100;
        int utokHrac = 5;
        int utokNepriatel = 10;
        int hpNepriatel = 100;
        String[] schopnosti = {"silný útok","healing", "útek"};
        int [] hodnoty = {15, 25, 20};
         Scanner scanner = new Scanner(System.in);


         // tu pojdu uvodne texty





         while (spustenie && !zaProlog){
             System.out.println("1 - Začíname");
             System.out.println("2 - Ukončiť");

             int prolog = scanner.nextInt();
         switch (prolog) {
             case 1:
                 zaProlog = true;
                 System.out.println("Tak ideme na to ty hrdina");
                 break;
             case 2:
                 System.out.println("Zbohom slabko");
                 spustenie = false;
                 break;
             default:
                 System.out.println("nehraj sa na testera");
                 break;

         }
         }


         System.out.println();
         System.out.println();
         System.out.println();
         System.out.println();

         //menu hry
         while (spustenie && !hraZacala) {

             System.out.println("====Mini rpg=====");
             System.out.println("1 - Spustiť hru");
             System.out.println("2 - pravidlá");
             System.out.println("0 - vypnúť hru");

             int menu = scanner.nextInt();

             switch (menu) {
                 case 1:hraZacala = true;
                     System.out.println("Tak ideme na to");
                     break;
                 case 2:
                     System.out.println("Si hrdina v lese a objaví sa nepriateľ");
                     System.out.println("Základ je ho zabiť alebo újsť");
                     System.out.println("Každé 3 ťahy máš na výber špeciálny útok");
                     System.out.println("vyberaj ich s rozvahou, lebo nepriateľ je silný");
                     System.out.println("Good luck hrdina");
                     break;
                 case 0:
                     System.out.println("Tak možno nabudúce");
                     spustenie = false;
                     break;
             }
             System.out.println("si v lese ");
             while (spustenie && !prezitie && !smrt) {
                 if (hpHrac <= 0) {smrt = true;};
                 if (hpNepriatel <= 0) {prezitie = true;};
                 //kazde 3 tahy vypise specialny utok


                 System.out.println("Si na rade");
                 System.out.println("1 - Klasicky utok");


                 if (tahy % 3 == 0) {
                     System.out.println("🎉 Máš špeciálny útok na výber!");
                     // tu môžeš zobraziť nové útoky
                     for (int i = 0; i < hodnoty.length; i++) {
                         System.out.println((i + 1) + "-" + schopnosti[i] + "(" + hodnoty[i] + ")");
                 }
                     //vzbrat nejakz dalsi utok pre klasickz combat



                 }
                 int volba = scanner.nextInt();

                 switch (volba) {
                     case 1:
                         System.out.println("klasicky utok");
                         break;
                         case 2:
                             System.out.println("heal");
                         break;
                         case 3:
                             System.out.println("utekam<");
                             break;
                             default:
                                 System.out.println("zla volba");
                                 break;


                 } tahy++;


             }
         }
         //si v hre a musis si vybrat utok z array

scanner.close();
    }
}
