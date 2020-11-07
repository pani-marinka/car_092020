package Main;

import java.util.Objects;

import static Main.Utility.*;


public class SedanCar extends Car {
    public int VolumeTrank, NumberSets, SedanWheels, InventN;
    static int InventOfCars;


    public SedanCar() {
        super();


    }

    public SedanCar(int maxSpeed) {
        super(maxSpeed);
    }


    public SedanCar(int VolumeTrank, int NumberSets) {
        InventN = getInventOfCarsfCars();
        this.VolumeTrank = VolumeTrank;
        this.NumberSets = NumberSets;
        SedanWheels = super.WHEELS;
    }

    public SedanCar(int VolumeTrank, int NumberSets, int InventN) {
        this.InventN = InventN;
        this.VolumeTrank = VolumeTrank;
        this.NumberSets = NumberSets;
        SedanWheels = super.WHEELS;
    }


    public int getInventOfCarsfCars() {
        return InventOfCars++;
    }


    @Override
    public String toString() {

        String mxSd = Integer.toString(super.getMaxSpd());
        return "Sedan has " + SOUTVOLUME + VolumeTrank + SOUTSETS + NumberSets + " wheels " + SedanWheels + " maxSpeed " + mxSd + " Invent # " + InventN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SedanCar sedanCar = (SedanCar) o;
        return InventN == sedanCar.InventN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), InventN);
    }
}