package dz.cirta.designspattern.creational.factory.factoryproduct;

import dz.cirta.designspattern.creational.factory.factoryproduct.product.Product;
import dz.cirta.designspattern.creational.factory.factoryproduct.product.type.ProductType;

public class DemoProductFactory {
    public static void main (String [] args){
        Product productA = ProductFactory.getProduct(ProductType.PRODUCTA);
        productA.methode();

        Product productB = ProductFactory.getProduct(ProductType.PRODUCTB);
        productB.methode();
    }
}
