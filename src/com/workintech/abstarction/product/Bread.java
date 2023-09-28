package com.workintech.abstarction.product;

public class Bread extends ProductForSale{
    private String country;
    private boolean hasGrain;

    public Bread(String type, double price, String description, String country, boolean hasGrain) {
        super(type, price, description);
        this.country = country;
        this.hasGrain = hasGrain;
    }

    public String getCountry() {
        return country;
    }

    public boolean isHasGrain() {
        return hasGrain;
    }
    @Override
    public void showDetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Country: " + getCountry() + "\n");
        builder.append("HasGrain: " + isHasGrain() + "\n");
        builder.append("--------------------\n");
        System.out.println(result + builder.toString());
    }
}
