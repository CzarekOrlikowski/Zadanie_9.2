public class Test {
    public static void main(String[] args) {

        RentableCar[] carsToRent = new RentableCar[3];
        carsToRent[0] = new RentableCar("ford", 2014, 7);
        carsToRent[1] = new RentableCar("audi", 2018, 5);
        carsToRent[2] = new RentableCar("fiat", 2020, 5);

        System.out.println(carsToRent[0]);
        System.out.println("Wypożyczony: " + carsToRent[0].isRent());
        carsToRent[0].rent("jan", "kowalski", "2se43");
        System.out.println(carsToRent[0]);
        System.out.println("Wypożyczony: " + carsToRent[0].isRent());
        carsToRent[0].handOver();
        System.out.println("Wypożyczony: " + carsToRent[0].isRent());
        System.out.println(carsToRent[0]);
    }
}
