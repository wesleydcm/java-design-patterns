package FactoryMethod.Problem;

import FactoryMethod.DigitalProduct;
import FactoryMethod.PhysicalProduct;

public class TestProduct {
    public static void main(String[] args) {
        PhysicalProduct physicalProduct = new PhysicalProduct();
        physicalProduct.setHasPhysicalDimensions(true);

        DigitalProduct digitalProduct = new DigitalProduct();
        digitalProduct.setHasPhysicalDimensions(true);
    }
}
