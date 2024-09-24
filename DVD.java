package Inventory;

public class DVD extends Product {
    int lenght;
    String ratio;
    String Studio;

    public int getlenght() {
        return this.lenght;
    }

    public void setlenght(int lenght) {
    }

    public String getRatio() {
        return this.ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getStudio() {
        return this.Studio;
    }

    public void setStudio(String Studio) {
        this.Studio = Studio;
    }

    public DVD() {
        super();
        lenght = 0;
        ratio = "";
        Studio = "";
    }

    public DVD(int lenght, String ratio, String Studio, int number, String name, int quantity, double price) {
        super(number, name quantity, price);
        this.number = number;
        this.ratio = ratio;
        this.Studio = Studio;
    }
}