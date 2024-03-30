package web.model;

public class Car {

    private String marka;
    private String model;
    private int number;

    public Car(){}

    public Car(String marka, String model, int number) {
        this.marka = marka;
        this.model = model;
        this.number = number;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
