package com.workintech.abstarction.product;

public class Coke  extends ProductForSale{
    private String brand;
    private boolean isLight;

    public Coke(String type, double price, String description, String brand, boolean isLight) {
        super(type, price, description);
        this.brand = brand;
        this.isLight = isLight;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isLight() {
        return isLight;
    }
    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Brand: " + getBrand() + "\n");
        builder.append("IsLight: " + isLight() + "\n");
        builder.append("--------------------\n");
        System.out.println(result + builder.toString());
    }
}
