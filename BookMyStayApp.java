import java.util.*;

public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection");

        String reservationId = "Single-1";

        AddOnService s1 = new AddOnService("Breakfast", 500.0);
        AddOnService s2 = new AddOnService("Spa", 1000.0);

        AddOnServiceManager manager = new AddOnServiceManager();

        manager.addService(reservationId, s1);
        manager.addService(reservationId, s2);

        double total = manager.calculateTotalServiceCost(reservationId);

        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + total);
    }
}

class AddOnService {

    private String serviceName;
    private double cost;

    public AddOnService(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getCost() {
        return cost;
    }
}

class AddOnServiceManager {

    private Map<String, List<AddOnService>> servicesByReservation;

    public AddOnServiceManager() {
        servicesByReservation = new HashMap<>();
    }

    public void addService(String reservationId, AddOnService service) {
        servicesByReservation.putIfAbsent(reservationId, new ArrayList<>());
        servicesByReservation.get(reservationId).add(service);
    }

    public double calculateTotalServiceCost(String reservationId) {
        double total = 0;
        List<AddOnService> list = servicesByReservation.get(reservationId);
        if (list != null) {
            for (AddOnService s : list) {
                total += s.getCost();
            }
        }
        return total;
    }
}