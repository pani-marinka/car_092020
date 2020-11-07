package Main;
public class Utility {
    static String MAINTXT = "Select your  sportcar (SC or 1) or sedancar (CC or 2)";
    static String SELTXT = " Select 1-Add object   2-View all objects   3-Fill InventN by hand   4-Exit";
    static String SELTXTSPEED = " What maxSpeed?";
    static String SELTXTMILAGE = " What milage?";
    static String TXTVOLUME = " What volume trank?";
    static String TXTSETS = " What number of sets?";
    static String ADDTXT = "Add Object";
    static String SOUTVOLUME = " volume trank ";
    static String SOUTSETS = "  number of sets ";
    static String SOUTSPEED = " MaxSpeed";
    static String TXTINVENT = " InventN ";


    String[] UserArray = new String[1];
    SedanCar[] sdcars = new SedanCar[1];
    boolean InventIsIt;
    public  int getMassegeOpt( String gM) //установка языка

    {

        int sel;
        String Str1 = (String) gM;
        String Str2 = "SC"; //Sportcar
        String Str3 = "CC";//sedancar
        String Str4 = "1"; //Sportcar
        String Str5 = "2"; //sedancar


        if (Str1.equals(Str2) || Str1.equals(Str4))
        {sel = 1;    System.out.println("Sportcar... Yahoo...."); }
        else{
            if (Str1.equals(Str3) || Str1.equals(Str5))
            {sel = 2; System.out.println("SedanCar ");}
            else { System.out.println("You made the wrong choice. Exit... ");    sel = 3;}
        }

        return sel;
    };


    public  int getMassegeSel( String gM) //установка опций выбора

    {

        int sel1;

        try {
            sel1 = Integer.parseInt(gM);
            return sel1;
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: expecting a number, but you made the wrong choice  " + nfe.getMessage());
            sel1 = 4;
            return sel1;
        }

    }



    public  int getbackInt( String gM) //установка опций выбора

    {

        int sel1;

        try {

            sel1 = Integer.parseInt(gM);
            return sel1;
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: expecting a number, but you made the wrong choice  " + nfe.getMessage());
            sel1 = 0;
            return sel1;
        }

    }




    public void copySedanCar ( ) {


        System.out.println("Copy strings " + sdcars.length);
        int lenght;
        lenght = sdcars.length;
        // System.out.println("длинна " + sdcars.length);

        if (sdcars[0] != null) {
            SedanCar[] DST = sdcars.clone();
            System.arraycopy( sdcars,0 ,DST, 0, lenght);
            sdcars = new SedanCar[lenght + 1];
            System.arraycopy(DST, 0, sdcars, 0, lenght);

        }

    }

    public void SetSedanCars ( int Txt1 , int Txt2) {  //add sedancar

        int lenght=0;

        if (sdcars[0] != null ) {lenght = sdcars.length; lenght=lenght-1;}

        sdcars[lenght] = new SedanCar(Txt1, Txt2);

        System.out.println("add object sedancar "   );}


    public void SetSedanCarsInv ( int Txt1 , int Txt2, int Txt3) {  //add sedancar by hand Invent N

        int lenght=0;
        InventIsIt=false;
        SedanCar newsd =new SedanCar(Txt1,Txt2,Txt3);
        //System.out.println("ww "+sdcars.length);
        //   for (SedanCar sd:sdcars){
        //System.out.println("2) sd "+ sd );
        //     if (sd.equals(newsd)){

        for (int i = 0; i < sdcars.length-1; i++) {
            System.out.println(sdcars[i] );
            if (sdcars[i].equals(newsd)){
                InventIsIt=true;
            } }
        if (InventIsIt) System.out.println( "ATTENTION! This is inventNum "+ InventIsIt);

        if (sdcars[0] != null ) {lenght = sdcars.length; lenght=lenght-1;}

        sdcars[lenght] = new SedanCar(Txt1, Txt2, Txt3);

        System.out.println("add object sedancar by hand "   );



    }


    public void SetArray() {  // заполняем вручную
        int lenght;
        int str;
        if (  sdcars[0] != null)  {

        lenght = sdcars.length;
            System.out.println("длинна " + UserArray.length);
            str=lenght-1;}
        else   {lenght=0;  str=lenght;}
//  String [][] UserArray = new String[2][3];


        UserArray[str] = "123" + lenght;


    }



    public void ViewArraySedan()

    {

        System.out.println();

        if (sdcars[0] != null) {
            System.out.println("List of  " + sdcars.length);

            for (int i = 0; i < sdcars.length; i++) {
                System.out.println(sdcars[i] );
            }
        }

        else  System.out.println("No data");
    }





}