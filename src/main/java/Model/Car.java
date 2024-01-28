package Model;

public class Car {
    public enum  Color{
        RED,Green,Blue
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String Model;
    private String brand ;
    private  int year;
    private Color color;

    public Car() {
    }

    public Car(int id, String model, String brand, int year, Color color) {
        super();
        this.id = id;
        Model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }



    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
