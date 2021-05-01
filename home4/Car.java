package home4;

public class Car {
    public String manufacturer;
    public String modelName;
    public boolean factoryNew=true;
    public String color;
    public int releaseYear;
    private int priceInUsd=0;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean isFactoryNew() {
        return factoryNew;
    }

    public void setFactoryNew(boolean factoryNew) {
        this.factoryNew = factoryNew;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getPriceInUsd() {
        return priceInUsd;
    }

    public void setPriceInUsd(int priceInUsd) {
        this.priceInUsd = priceInUsd;
    }

    public void printCarData(){
        System.out.println("_________________________________");
        System.out.println("Manufacturer:"+manufacturer);
            System.out.println("Model:"+ modelName);
        if(factoryNew)
            System.out.println("New or Used?:"+"New");
        else System.out.println("New or Used?:"+"Used");
            System.out.println("Color:"+color);
            System.out.println("Released In:"+releaseYear);
            System.out.println("Price:"+getPriceInUsd());
        System.out.println("......................................");
    }

}
