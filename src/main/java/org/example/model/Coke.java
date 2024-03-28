package org.example.model;


public class Coke extends ProductForSale{

    private String brand;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Bu ürünün tipi: " + super.getType() + " fiyatı: " + super.getPrice() + " açıklaması: " + super.getDescription() + " markası: " + this.brand);

    }
}
