package bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public abstract class MusicalInstrument extends Product {
    private String brand;

    // No-Arg Constructor
    public MusicalInstrument() {
        super();
        this.brand = "";
    }

    // Loaded Constructor (Bucket Brigade)
    public MusicalInstrument(String title, double price, String brand) {
        super(title, price);
        this.brand = brand;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void initialize(Scanner input) {
        super.initialize(input);
        System.out.print("Enter instrument brand: ");
        this.brand = input.nextLine();
    }

    @Override
    public void edit(Scanner input) {
        super.edit(input);
        System.out.print("Enter new instrument brand (" + this.brand + "): ");
        String newBrand = input.nextLine();
        if (!newBrand.trim().isEmpty()) {
            this.brand = newBrand;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MusicalInstrument miserable = (MusicalInstrument) o;
        return Objects.equals(brand, miserable.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand);
    }
}