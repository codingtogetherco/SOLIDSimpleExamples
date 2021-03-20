package o.impl.bad;

public class Main {

    public void draw(Vehicle vehicle) {
        switch (vehicle.getType()) {
            case CAR:
                drawCar(vehicle);
                break;
            case MOTORBIKE:
                drawMotorbike(vehicle);
                break;
        }
    }

    private void drawMotorbike(Vehicle vehicle) {
    }

    private void drawCar(Vehicle vehicle) {
    }
}
