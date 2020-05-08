public abstract class Vehicle implements Movable {

    private final String name;
    private final int year;
    private String currentDirection;

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
        this.currentDirection = "postój";
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }

    @Override
    public void turnLeft() {
        setCurrentDirection("lewo");

    }

    @Override
    public void turnRight() {
        setCurrentDirection("prawo");
    }

    @Override
    public void goForward() {
        setCurrentDirection("do przodu");

    }

    @Override
    public void goBack() {
        setCurrentDirection("do tyłu");
    }

    public String toString() {
        return "marka: " + getName() + "\n" +
                "rok: " + getYear() + "\n" +
                "aktualnie: " + getCurrentDirection() + "\n";
    }
}
