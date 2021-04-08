package home4;

public class car {
    public String manufacturer;
    public String modelname;
    public boolean factoryNew=true;
    public String color;
    public int releaseYear;
    private int priceInUsd=0;
    public  int getPriceInUsd(){
        return this.priceInUsd;
    }
    public void setPriceInUsd(int priceInUsd){
        this.priceInUsd=priceInUsd;
    }
    public void printCarData(){
        if(this.manufacturer!=null)
        System.out.println("Manufacturer:"+this.manufacturer);
        if(this.modelname!=null)
            System.out.println("Model:"+this.modelname);
        if(this.factoryNew)
            System.out.println("New or Used?:"+"New");
        else System.out.println("New or Used?:"+"Used");
        if(this.color!=null)
            System.out.println("Color:"+this.color);
        if (this.releaseYear!=0)
            System.out.println("Released In:"+this.releaseYear);
        if (this.priceInUsd!=0)
            System.out.println("Price:"+getPriceInUsd());
        System.out.println("......................................");
    }

}
