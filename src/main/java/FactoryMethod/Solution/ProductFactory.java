package FactoryMethod.Solution;

import FactoryMethod.DigitalProduct;
import FactoryMethod.PhysicalProduct;
import FactoryMethod.Product;
import FactoryMethod.ProductTypeEnum;

public class ProductFactory {

    public static Product getInstance(ProductTypeEnum productTypeEnum){
        switch (productTypeEnum){
            case PHYSICAL:
                    PhysicalProduct physicalProduct = new PhysicalProduct();
                    physicalProduct.setHasPhysicalDimensions(true);
                    return physicalProduct;
            case DIGITAL:
                DigitalProduct digitalProduct = new DigitalProduct();
                digitalProduct.setHasPhysicalDimensions(false);
                return digitalProduct;
            default:
                throw new IllegalArgumentException("Invalid product type");
        }

    }
}
