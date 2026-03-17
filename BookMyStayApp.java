public class UseCase2RoomInitialization {
    public static void main(String[] args) {

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        int singleAvailability = 10;
        int doubleAvailability = 5;
        int suiteAvailability = 2;

        System.out.println("Hotel Room Initialization\n");

        System.out.println("Single Room:");
        System.out.println("Beds: " + singleRoom.getBeds());
        System.out.println("Size: " + singleRoom.getSize() + " sq ft");
        System.out.println("Price per night: " + singleRoom.getPrice());
        System.out.println("Available: " + singleAvailability + "\n");

        System.out.println("Double Room:");
        System.out.println("Beds: " + doubleRoom.getBeds());
        System.out.println("Size: " + doubleRoom.getSize() + " sq ft");
        System.out.println("Price per night: " + doubleRoom.getPrice());
        System.out.println("Available: " + doubleAvailability + "\n");

        System.out.println("Suite Room:");
        System.out.println("Beds: " + suiteRoom.getBeds());
        System.out.println("Size: " + suiteRoom.getSize() + " sq ft");
        System.out.println("Price per night: " + suiteRoom.getPrice());
        System.out.println("Available: " + suiteAvailability);
    }
}