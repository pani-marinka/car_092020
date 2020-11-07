package Main;
import static  Main.Utility.*;

class SportCar extends Car {



    public SportCar ()
    {
        super ();


    }

    public SportCar (int maxSpeed)
    {
        super (maxSpeed);
    }

    public SportCar (int maxSpeed, int milage)
    {
        super (maxSpeed, milage);
    }



    @Override
    public String toString() {

        String  mxSd=Integer.toString ( super.getMaxSpd());
        return  SELTXTMILAGE +" maxSpeed " +mxSd;
    }


}