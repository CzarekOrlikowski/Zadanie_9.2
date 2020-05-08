public class Car extends Vehicle {
    private int seatsNumber;

    public Car(String name, int year, int seatsNumber) {
        super(name, year);
        this.seatsNumber = seatsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }

    @Override
    public void turnRight() {
        super.turnRight();
    }

    @Override
    public void goForward() {
        super.goForward();
    }

    @Override
    public void goBack() {
        super.goBack();
    }

    @Override
    public String toString() {
        return "POJAZD Z BAZY" + "\n" +
                super.toString() +
                "liczba miejsc: " + getSeatsNumber() + "\n";
    }
}
