import java.util.Date;
import java.text.SimpleDateFormat;

public class Car {
    String racerName;
    String carName;
    byte[] carImage;
    Date entryTime;
    Double weight;
    
    public Car(String racerName, String carName, byte[] carImage, Date entryTime, Double weight) {
        this.racerName = racerName;
        this.carName = carName;
        this.carImage = carImage;
        this.entryTime = entryTime;
        this.weight = weight;
    }
    
    public String getRacerName() {
        return racerName;
    }
    
    public String getCarName() {
        return carName;
    }
    
    public String getEntryTime() {
        return entryTime.toString();
    }
    
    public String getWeight() {
        return String.valueOf(weight);
    }
    
    public static void main(String args[]) throws Exception {
        String racerName = args[0];
        String carName = args[1];
        byte[] carImage = args[2].getBytes();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        Date entryTime = dateFormat.parse(args[3]);
        Double weight = Double.parseDouble(args[4]);
        
        Car myCar = new Car(racerName, carName, carImage, entryTime, weight);
        
        System.out.println("racerName = " + myCar.getRacerName());
        System.out.println("carName = " + myCar.getCarName());
        System.out.println("entryTime = " + myCar.getEntryTime());
        System.out.println("weight = " + myCar.getWeight());
    }
}
