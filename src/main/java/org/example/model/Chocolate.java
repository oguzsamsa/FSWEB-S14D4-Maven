package org.example.model;


public class Chocolate extends ProductForSale{

    private double sugarPercentage;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);

    }

    public Chocolate(String type, double price, String description, double sugarPercentage) {
        super(type, price, description);
        this.sugarPercentage = sugarPercentage;

    }

    @Override
    public void showDetails() {
        System.out.println("Bu ürünün tipi: " + super.getType() + " fiyatı: " + super.getPrice() + " açıklaması: " + super.getDescription() + " şeker oranı: %" + this.sugarPercentage);
    }
}
