import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Race {
    int trackLanes;
    int raceType;
    List<Car> carList;
    int raceNumber = 1;
    
    public static List<Car> collectInformation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to input car data Y/N?");
        String initialOption = in.nextLine();
        boolean userContinue = !("N".equalsIgnoreCase(initialOption));
        ListcarList = new ArrayList<Car>();
        if (!userContinue) { return carList; };
        int carNumber = 1;
        do {
            System.out.println("Input car data for Car " + carNumber);
            System.out.println("Racer Name: ");
            String racerName = in.nextLine();
            System.out.println("Car Name: ");
            String carName = in.nextLine();
            System.out.println("Car Image: ");
            byte[] carImage = in.nextLine().getBytes();
            System.out.println("Entry Time: ");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
            Date entryTime = dateFormat.parse(in.nextLine());
            System.out.println("Car weight: ");
            Double weight = Double.parseDouble(in.nextLine());
            Car myCar = new Car(racerName, carName, entryTime, weight);
            carList.add(myCar);
            carNumber++;
            System.out.println("Would you like to continue Y/N?");
            String userOption = in.readLine();
        } while (!("N".equalsIgnoreCase(userOption)));
        
        return carList;
    }

    public static void main(String args[]) throws Exception {
        Race.collectInformation();
    }
}
