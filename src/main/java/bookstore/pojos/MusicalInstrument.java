package bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public abstract class MusicalInstrument extends Product {
    private String instrumentTitle;
    private double instrumentPrice;
    private String brand;

    public MusicalInstrument() {
        super();
        this.instrumentTitle = "";
        this.instrumentPrice = 0.0;
        this.brand = "";
    }

    public MusicalInstrument(String title, double price, String brand) {
        super();
        this.instrumentTitle = title;
        this.instrumentPrice = price;
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        return this.instrumentPrice;
    }

    public void setPrice(double price) {
        this.instrumentPrice = price;
    }

    public String getInstrumentTitle() {
        return this.instrumentTitle;
    }

    public void setInstrumentTitle(String title) {
        this.instrumentTitle = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void initialize(Scanner input) {
        System.out.print("Enter product title: ");
        this.instrumentTitle = input.nextLine();
        System.out.print("Enter product price: ");
        this.instrumentPrice = Double.parseDouble(input.nextLine());
        System.out.print("Enter instrument brand: ");
        this.brand = input.nextLine();
    }

    @Override
    public void edit(Scanner input) {
        System.out.print("Enter new title (" + this.instrumentTitle + "): ");
        String newTitle = input.nextLine();
        if (!newTitle.trim().isEmpty()) {
            this.instrumentTitle = newTitle;
        }

        System.out.print("Enter new price (" + this.instrumentPrice + "): ");
        String newPrice = input.nextLine();
        if (!newPrice.trim().isEmpty()) {
            this.instrumentPrice = Double.parseDouble(newPrice);
        }

        System.out.print("Enter new instrument brand (" + this.brand + "): ");
        String newBrand = input.nextLine();
        if (!newBrand.trim().isEmpty()) {
            this.brand = newBrand;
        }
    }

    @Override
    public String toString() {
        return "Title: " + instrumentTitle + ", Price: " + instrumentPrice + ", Brand: " + brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicalInstrument that = (MusicalInstrument) o;
        return Double.compare(that.instrumentPrice, instrumentPrice) == 0 &&
                Objects.equals(instrumentTitle, that.instrumentTitle) &&
                Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instrumentTitle, instrumentPrice, brand);
    }
}