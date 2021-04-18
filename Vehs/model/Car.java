package CARS.Main.model;

public class Car {
        private String manufacturer;
        private String modelName;
        private boolean isfactoryNew =true;
        private String color;
        private int releaseYear;
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

        public boolean isIsfactoryNew() {
            return isfactoryNew;
        }

        public void setIsfactoryNew(boolean isfactoryNew) {
            this.isfactoryNew = isfactoryNew;
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
            if(isfactoryNew)
                System.out.println("New or Used?:"+"New");
            else System.out.println("New or Used?:"+"Used");
            System.out.println("Color:"+color);
            System.out.println("Released In:"+releaseYear);
            System.out.println("Price:"+getPriceInUsd());
            System.out.println("......................................");
        }

    }

