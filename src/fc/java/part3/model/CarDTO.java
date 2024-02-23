package fc.java.part3.model;

public class CarDTO {
    public int carSn;
    public String carName;
    public int carPrice;
    public String carOwner;
    public int carYear;
    public String carType;

    public CarDTO(int carSn, String carName, int carPrice, String carOwner, int carYear, String carType) {
        this.carSn = carSn;
        this.carName = carName;
        this.carPrice = carPrice;
        this.carOwner = carOwner;
        this.carYear = carYear;
        this.carType = carType;
    }
}
