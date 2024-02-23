package fc.java.part3;

import fc.java.part3.model.CarDTO;
import fc.java.part3.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        int carSn=1111;
        String carName = "벤츠";
        int carPrice = 3000000;
        String carOwner = "신원준";
        int carYear = 2023;
        String carType = "G";
        CarDTO carDTO = new CarDTO(carSn, carName, carPrice, carOwner, carYear, carType);
        CarUtility carUtility = new CarUtility();
        carUtility.carPrint(carDTO);
    }

}
