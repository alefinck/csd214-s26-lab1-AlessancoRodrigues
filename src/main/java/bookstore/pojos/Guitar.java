package bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public class Guitar extends MusicalInstrument {
    private int numberOfStrings;

    // No-Arg Constructor
    public Guitar() {
        super();
        this.numberOfStrings = 6;
    }

    // Loaded Constructor (Bucket Brigade)
    public Guitar(String title, double price, String brand, int numberOfStrings) {
        super(title, price, brand);
        this.numberOfStrings = numberOfStrings;
    }

    // Fixed SaleableItem Interface Error: Added getPrice requirement
    @Override
    public double getPrice() {
        return super.getPrice();
    }

    // Getters and Setters
    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void initialize(Scanner input) {
        super.initialize(input);
        System.out.print("Enter number of strings: ");
        this.numberOfStrings = Integer.parseInt(input.nextLine());
    }

    @Override
    public void edit(Scanner input) {
        super.edit(input);
        System.out.print("Enter new number of strings (" + this.numberOfStrings + "): ");
        String line = input.nextLine();
        if (!line.trim().isEmpty()) {
            this.numberOfStrings = Integer.parseInt(line);
        }
    }

    @Override
    public void sellItem() {
        System.out.println("Guitar sold successfully!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Strings: " + numberOfStrings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Guitar guitar = (Guitar) o;
        return numberOfStrings == guitar.numberOfStrings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfStrings);
    }
}