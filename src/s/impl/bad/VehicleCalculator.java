package s.impl.bad;

public class VehicleCalculator {

    public int calculateVelocity(Vehicle vehicle){

        if(vehicle.getName()=="car") {
            return 50;
        } else if(vehicle.getName()=="motorcycle") {
            return 60;
        } else {
            return 40;
        }

    }
}
