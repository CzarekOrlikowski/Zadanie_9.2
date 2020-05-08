public class RentableCar extends Car implements Rentable {
    private Person person;

    public RentableCar(String name, int year, int seatsNumber) {
        super(name, year, seatsNumber);
        this.person = new Person(null, null, null);
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
        this.person.setFirstName(null);
        this.person.setLastName(null);
        this.person.setId(null);
    }

    @Override
    public boolean isRent() {
        if (this.person.getFirstName() == null){
            return false;
        } else return true;
    }

    @Override
    public String toString() {
        return super.toString() +
                "DANE WYPOŻACZAJĄCEGO" + "\n" +
                "imię: " + getPerson().getFirstName() + "\n" +
                "nazwisko: " + getPerson().getLastName() + "\n" +
                "id: " + getPerson().getId() + "\n";
    }
}
