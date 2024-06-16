package FactoryMethod;

import java.math.BigDecimal;

public class Product {
    private String description;
    private BigDecimal price;
    private Boolean hasPhysicalDimensions;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getHasPhysicalDimensions() {
        return hasPhysicalDimensions;
    }

    public void setHasPhysicalDimensions(Boolean hasPhysicalDimensions) {
        this.hasPhysicalDimensions = hasPhysicalDimensions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", hasPhysicalDimensions=" + hasPhysicalDimensions +
                '}';
    }
}
