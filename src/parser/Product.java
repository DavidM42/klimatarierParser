package parser;

public class Product {
    private final String name;
    private final String value;
    private final String thumbnailUrl;
    private final String unit;

    public Product(String name, String value, String thumbnailUrl, String unit) {
        this.name = name;
        this.value = value;
        this.thumbnailUrl = thumbnailUrl;
        this.unit = unit;         // usually always g for gram of co2 equivalent greenhouse emissions
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return this.getName() + " hat ein CO2 Äquivalenz-Wert von " + this.getValue() + this.getUnit();
    }
}
