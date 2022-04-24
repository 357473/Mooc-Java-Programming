
public class Main {

    public static void main(String[] args) {

        VehicleRegistry v = new VehicleRegistry();

        LicensePlate li1 = new LicensePlate("D", "34338");
        LicensePlate li2 = new LicensePlate("F", "432FD");
        LicensePlate li3 = new LicensePlate("I", "33HHD");

        v.add(li1, "Mike");
        v.add(li2, "Andy");
        v.add(li3, "Jeff");
        v.add(new LicensePlate("E", "EHD32"), "Jose");
        v.add(new LicensePlate("E", "EHD32"), "Tony");
        v.add(new LicensePlate("D", "42223"), "Mike");

        v.printLicensePlates();
        System.out.println("");
        v.printOwners();
    }
}
