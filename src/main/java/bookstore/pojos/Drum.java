package bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public class Drum extends MusicalInstrument {
    private boolean isElectronic;

    public Drum() {
        super();
        this.isElectronic = false;
    }

    public Drum(String title, double price, String brand, boolean isElectronic) {
        super(title, price, brand);
        this.isElectronic = isElectronic;
    }

    @Override
    public double getPrice() {
        return getPrice();
    }

    public boolean getIsElectronic() {
        return isElectronic;
    }

    public void setIsElectronic(boolean isElectronic) {
        this.isElectronic = isElectronic;
    }

    @Override
    public void initialize(Scanner input) {
        super.initialize(input);
        System.out.print("Is it electronic? (true/false): ");
        this.isElectronic = Boolean.parseBoolean(input.nextLine());
    }

    @Override
    public void edit(Scanner input) {
        super.edit(input);
        System.out.print("Is it electronic? (" + this.isElectronic + ") (true/false or leave empty): ");
        String line = input.nextLine();
        if (!line.trim().isEmpty()) {
            this.isElectronic = Boolean.parseBoolean(line);
        }
    }

    @Override
    public void sellItem() {
        System.out.println("Drum set sold successfully!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Is Electronic: " + isElectronic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Drum drum = (Drum) o;
        return isElectronic == drum.isElectronic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isElectronic);
    }
}