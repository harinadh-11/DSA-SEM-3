import java.util.*;

class UrbanAI {

    static Scanner sc = new Scanner(System.in);

    // Search Asset
    static void searchAsset() {

        System.out.print("Enter Asset ID: ");
        int id = sc.nextInt();

        if (id == 101) {
            System.out.println("\nRoad Name : MG Road");
            System.out.println("Status : Active");
            System.out.println("Location : Zone 3");
        }
        else if (id == 102) {
            System.out.println("\nRoad Name : Benz Circle");
            System.out.println("Status : Under Maintenance");
            System.out.println("Location : Zone 2");
        }
        else if (id == 103) {
            System.out.println("\nRoad Name : Ring Road");
            System.out.println("Status : Active");
            System.out.println("Location : Zone 1");
        }
        else if (id == 104) {
            System.out.println("\nRoad Name : Eluru Road");
            System.out.println("Status : Active");
            System.out.println("Location : Zone 4");
        }
        else {
            System.out.println("\nAsset Not Found!");
        }
    }

    // Show All Assets
    static void showAllAssets() {

        System.out.println("\n===== INFRASTRUCTURE ASSETS =====");
        System.out.println("ID : 101 | MG Road | Active | Zone 3");
        System.out.println("ID : 102 | Benz Circle | Under Maintenance | Zone 2");
        System.out.println("ID : 103 | Ring Road | Active | Zone 1");
        System.out.println("ID : 104 | Eluru Road | Active | Zone 4");
    }

    // Shortest Route
    static void shortestRoute() {

        sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.println("\n===== SHORTEST ROUTE =====");

        System.out.println(source +
                " -> Signal Junction -> Market Area -> City Center -> "
                + destination);

        System.out.println("Distance : 18 km");
        System.out.println("Estimated Time : 25 Minutes");
    }

    // Show Routes
    static void showRoutes() {

        System.out.println("\n===== AVAILABLE CITY ROUTES =====");

        System.out.println("1. MG Road -> Signal Junction -> Benz Circle");
        System.out.println("2. Benz Circle -> Bus Stand -> Ring Road");
        System.out.println("3. Ring Road -> City Center -> Eluru Road");
        System.out.println("4. Bus Stand -> Market Area -> Railway Station");
        System.out.println("5. Airport -> City Center -> MG Road");
        System.out.println("6. Railway Station -> Bus Stand -> Benz Circle");
        System.out.println("7. City Center -> MG Road -> Ring Road");
        System.out.println("8. Airport -> Bus Stand -> Railway Station");
        System.out.println("9. Eluru Road -> City Center -> Airport");
        System.out.println("10. MG Road -> Bus Stand -> Railway Station");
    }

    // Traffic Analysis
    static void trafficAnalysis() {

        sc.nextLine();

        System.out.print("Enter Area Name: ");
        String area = sc.nextLine();

        System.out.println("\nArea : " + area);
        System.out.println("Traffic Density : High");
        System.out.println("Vehicles Count : 5230");
        System.out.println("Average Speed : 22 km/hr");
    }

    // Show Areas
    static void showAreas() {

        System.out.println("\n===== TRAFFIC AREAS =====");
        System.out.println("1. MG Road");
        System.out.println("2. Benz Circle");
        System.out.println("3. Ring Road");
        System.out.println("4. Eluru Road");
        System.out.println("5. Bus Stand Area");
        System.out.println("6. Railway Station Area");
        System.out.println("7. Airport Road");
    }

    // Manage Complaints
    static void manageComplaints() {

        System.out.print("Enter Complaint ID: ");
        int id = sc.nextInt();

        System.out.println("\nComplaint ID : " + id);
        System.out.println("Type : Street Light Failure");
        System.out.println("Priority : High");
        System.out.println("Status : In Progress");
    }

    // Show Complaint IDs
    static void showComplaintIDs() {

        System.out.println("\n===== COMPLAINT IDs =====");
        System.out.println("201");
        System.out.println("202");
        System.out.println("203");
        System.out.println("204");
        System.out.println("205");
    }

    // Add Complaint
    static void addComplaint() {

        sc.nextLine();

        System.out.print("Enter Complaint ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Complaint Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Area: ");
        String area = sc.nextLine();

        System.out.println("\nComplaint Added Successfully!");
        System.out.println("Complaint ID : " + id);
        System.out.println("Type : " + type);
        System.out.println("Area : " + area);
        System.out.println("Status : Submitted");
    }

    // Resource Allocation
    static void allocateResources() {

        System.out.println("\n===== RESOURCE ALLOCATION =====");
        System.out.println("Available Workers : 20");
        System.out.println("Assigned Workers : 15");
        System.out.println("Remaining Workers : 5");

        System.out.println("\nBudget Utilized : ₹8,00,000");
    }

    // Generate Report
    static void generateReport() {

        System.out.println("\n===== CITY REPORT =====");
        System.out.println("Assets Monitored : 200");
        System.out.println("Complaints Resolved : 150");
        System.out.println("Traffic Zones : 10");
        System.out.println("Emergency Services : Active");
    }

    // Live Location Tracking
    static void liveLocationTracking() {

        sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        String[] route = {
                source,
                "Signal Junction",
                "Market Area",
                "Bus Stand",
                "Railway Station",
                "City Center",
                destination
        };

        System.out.println("\n===== LIVE LOCATION TRACKING =====");

        try {

            for (int i = 0; i < route.length; i++) {

                System.out.println("Current Location : " + route[i]);

                if (i < route.length - 1) {
                    System.out.println("Next Stop : " + route[i + 1]);
                }

                System.out.println("--------------------------------");

                Thread.sleep(2000);
            }

            System.out.println("\nDestination Reached Successfully!");

        } catch (InterruptedException e) {

            System.out.println("Tracking Interrupted!");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========== UrbanAI ==========");
            System.out.println("1. Search Infrastructure Asset");
            System.out.println("2. Show All Infrastructure Assets");
            System.out.println("3. Find Shortest Route");
            System.out.println("4. Show All Routes");
            System.out.println("5. Analyze Traffic");
            System.out.println("6. Show All Traffic Areas");
            System.out.println("7. Manage Complaints");
            System.out.println("8. Show Complaint IDs");
            System.out.println("9. Add Complaint");
            System.out.println("10. Allocate Resources");
            System.out.println("11. Generate Reports");
            System.out.println("12. Live Location Tracking");
            System.out.println("13. Exit");

            System.out.print("\nEnter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    searchAsset();
                    break;

                case 2:
                    showAllAssets();
                    break;

                case 3:
                    shortestRoute();
                    break;

                case 4:
                    showRoutes();
                    break;

                case 5:
                    trafficAnalysis();
                    break;

                case 6:
                    showAreas();
                    break;

                case 7:
                    manageComplaints();
                    break;

                case 8:
                    showComplaintIDs();
                    break;

                case 9:
                    addComplaint();
                    break;

                case 10:
                    allocateResources();
                    break;

                case 11:
                    generateReport();
                    break;

                case 12:
                    liveLocationTracking();
                    break;

                case 13:
                    System.out.println("\nThank You for Using UrbanAI!");
                    break;

                default:
                    System.out.println("\nInvalid Choice!");
            }

        } while (choice != 13);

        sc.close();
    }
}