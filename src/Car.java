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
    public String toString() {
        return "POJAZD Z BAZY" + "\n" +
                super.toString() +
                "liczba miejsc: " + getSeatsNumber() + "\n";
    }
}
