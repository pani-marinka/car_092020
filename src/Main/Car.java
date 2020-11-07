package Main;
import java.util.Objects;

import static  Main.Utility.*;

public class Car {




    private int numofCars;
    final int WHEELS = 4;


    private int maxSpeed;
    private int milage;



    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.milage = 1;

    }


    public Car(int maxSpeed, int milage) {

        this.maxSpeed = maxSpeed;
        this.milage = milage;

    }



    public int getnumofCars() {
        return numofCars++;
    }

    public Car() {
        this.getnumofCars();
        this.maxSpeed = 100;
        this.milage = 1;


    }


    public int getMaxSpd (){
        return maxSpeed;

    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numofCars == car.numofCars &&
                maxSpeed == car.maxSpeed &&
                milage == car.milage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numofCars, maxSpeed, milage);
    }
}