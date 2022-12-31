package solid_principles.single_responsibility;

import java.time.LocalDate;


public class Marker {
    private final String name;
    private final String color;
    private final LocalDate manufacturedDate;
    private final int price;

    public Marker(String name, String color, LocalDate manufacturedDate, int price) {
        this.name = name;
        this.color = color;
        this.manufacturedDate = manufacturedDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public int getPrice() {
        return price;
    }
}
