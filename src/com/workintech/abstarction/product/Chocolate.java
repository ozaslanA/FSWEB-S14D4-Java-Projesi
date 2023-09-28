package com.workintech.abstarction.product;

public class Chocolate extends ProductForSale {

    private String color;
    private boolean hasSugar;

    public Chocolate(String type, double price, String description, String color, boolean hasSugar) {
        super(type, price, description);
        this.color = color;
        this.hasSugar = hasSugar;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasSugar() {
        return hasSugar;
    }
    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Color: " + getColor() + "\n");
        builder.append("HasSugar: " + isHasSugar() + "\n");
        builder.append("--------------------\n");
        System.out.println(result + builder.toString());
    }
}
