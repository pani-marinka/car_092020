package Main;

import java.util.Scanner;
import static  Main.Utility.*;

public class main {


    public static void main(String[] args) {

        Utility u1 = new Utility();

        int sel = 1;
        String SelStr3, SelStr4,SelStr5;
        int IntStr3, IntStr4, IntStr5;
        System.out.println(MAINTXT); // выбор объекта

        Scanner scanner = new Scanner(System.in);
        String SelStr = scanner.nextLine();
        sel=u1.getMassegeOpt(SelStr); //выбор седан или спорт

        if (sel == 3) return;
        sel=1;// пока седан - сразу добавление

        System.out.println(ADDTXT);


        int forsel = 0;  //для case



        do {
            switch (sel) {
                case 1: //Add user
                {

                    System.out.println(TXTVOLUME);
                    scanner = new Scanner(System.in);
                    SelStr3 = scanner.nextLine();
                    IntStr3=u1.getbackInt( SelStr3);


                    System.out.println(TXTSETS);
                    scanner = new Scanner(System.in);
                    SelStr4 = scanner.nextLine();
                    IntStr4=u1.getbackInt( SelStr4);

                    u1.copySedanCar ();
                    u1.SetSedanCars (IntStr3,IntStr4);
                    u1.ViewArraySedan();

                    System.out.println(SELTXT);

                    scanner = new Scanner(System.in);
                    String SelStr2 = scanner.nextLine();
                    sel = u1.getMassegeSel(SelStr2);

                    break;
                }
                case 2:{

                    u1.ViewArraySedan();
                    System.out.println(SELTXT);
                    scanner = new Scanner(System.in);
                    String SelStr2 = scanner.nextLine();
                    sel = u1.getMassegeSel(SelStr2);

                    break;
                }

                case 3:
                {

                    System.out.println(TXTVOLUME);
                    scanner = new Scanner(System.in);
                    SelStr3 = scanner.nextLine();
                    IntStr3=u1.getbackInt( SelStr3);


                    System.out.println(TXTSETS);
                    scanner = new Scanner(System.in);
                    SelStr4 = scanner.nextLine();
                    IntStr4=u1.getbackInt( SelStr4);

                    System.out.println(TXTINVENT);
                    scanner = new Scanner(System.in);
                    SelStr5 = scanner.nextLine();
                    IntStr5=u1.getbackInt( SelStr5);


                    u1.copySedanCar ();
                    u1.SetSedanCarsInv (IntStr3, IntStr4, IntStr5);


                    System.out.println(SELTXT);

                    scanner = new Scanner(System.in);
                    String SelStr2 = scanner.nextLine();
                    sel = u1.getMassegeSel(SelStr2);
                    break;
                }

                case 4: {  forsel=1; break;  }
            }

        }  while (  forsel==0);


//        System.out.println(SELTXT);
//
//        scanner = new Scanner(System.in);
//        String SelStr2 = scanner.nextLine();
//        int SelSel = u1.getMassegeSel(SelStr2);









//        Car[] cars = new Car[10];
//        for (int i = 0; i < 10; i++) {
//            cars[i] = new Car();
//        }


//        for (int i = 0; i < 10; i++) {
//            System.out.println(cars[i] + "  Car " + i);
//        }
//// SportCars
//
//        SportCar[] scars = new SportCar[10];
//        for (int i = 0; i < 10; i++) {
//            scars[i] = new SportCar();
//
//        }

//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(scars[i] + " Sport " + i);
//        }


// Sedan cars



    }
}