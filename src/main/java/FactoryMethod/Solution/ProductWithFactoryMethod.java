package FactoryMethod.Solution;

import FactoryMethod.Product;
import FactoryMethod.ProductTypeEnum;

public class ProductWithFactoryMethod {

    public static void main(String[] args) {
        Product digitalProduct = ProductFactory.getInstance(ProductTypeEnum.DIGITAL);


        Product physycalProduct = ProductFactory.getInstance(ProductTypeEnum.PHYSICAL);

        System.out.println(digitalProduct);
        System.out.println(physycalProduct);
    }
}
