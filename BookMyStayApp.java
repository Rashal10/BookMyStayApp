import java.util.HashMap;
import java.util.Map;

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        Room singleRoom = new Room("Single", 1, 250, 1500.0);
        Room doubleRoom = new Room("Double", 2, 400, 2500.0);
        Room suiteRoom = new Room("Suite", 3, 750, 5000.0);

        RoomSearchService service = new RoomSearchService();

        System.out.println("Room Search\n");

        service.searchAvailableRooms(inventory, singleRoom, doubleRoom, suiteRoom);
    }
}

class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (availability.get("Single") > 0) {
            displayRoom(singleRoom, availability.get("Single"));
        }

        if (availability.get("Double") > 0) {
            displayRoom(doubleRoom, availability.get("Double"));
        }

        if (availability.get("Suite") > 0) {
            displayRoom(suiteRoom, availability.get("Suite"));
        }
    }

    private void displayRoom(Room room, int available) {
        System.out.println(room.getType() + " Room:");
        System.out.println("Beds: " + room.getBeds());
        System.out.println("Size: " + room.getSize() + " sqft");
        System.out.println("Price per night: " + room.getPrice());
        System.out.println("Available: " + available);
        System.out.println();
    }
}

class Room {

    private String type;
    private int beds;
    private int size;
    private double price;

    public Room(String type, int beds, int size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getBeds() {
        return beds;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}

class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }
}