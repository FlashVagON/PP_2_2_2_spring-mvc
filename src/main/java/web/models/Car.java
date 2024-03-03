package web.models;

public class Car {
    private String model;
    private String color;
    private int createYear;

    public Car(String model, String color, int createYear) {
        this.model = model;
        this.color = color;
        this.createYear = createYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }
}
