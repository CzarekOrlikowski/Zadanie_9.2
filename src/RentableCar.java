public class RentableCar extends Car implements Rentable {
    private Person person;

    public RentableCar(String name, int year, int seatsNumber) {
        super(name, year, seatsNumber);
        this.person = null;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        this.person = new Person(firstName, lastName, id);

    }

    @Override
    public void handOver() {
        this.person = null;
    }

    @Override
    public boolean isRent() {
        if (this.person == null){
            return false;
        } else return true;
    }

    @Override
    public String toString() {
        return super.toString() +
                "DANE WYPOŻACZAJĄCEGO" + "\n" +
                "RentableCar{" +
                "person=" + person +
                '}' + "\n";
    }
}
