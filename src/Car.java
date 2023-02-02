public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car() {
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country) {
        this.brand = (brand == null || brand.isBlank())? "default": brand;
        this.model = (model == null || model.isBlank())? "default": model;
        this.engineVolume = (engineVolume <=0)? 1.5: engineVolume;
        this.color = (color == null || color.isBlank())? "белый": color;
        this.year = (year <= 0)? 2000: year;
        this.country = (country == null || country.isBlank())? "default": country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

