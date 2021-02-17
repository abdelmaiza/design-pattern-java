package dz.cirta.designspattern.creational.factory.factoryproduct;

import dz.cirta.designspattern.creational.factory.factoryproduct.product.Product;
import dz.cirta.designspattern.creational.factory.factoryproduct.product.ProductA;
import dz.cirta.designspattern.creational.factory.factoryproduct.product.ProductB;
import dz.cirta.designspattern.creational.factory.factoryproduct.product.type.ProductType;
import org.jetbrains.annotations.NotNull;

public class ProductFactory {

    private ProductFactory() {
        throw new IllegalStateException("Utility class");
    }

    @NotNull
    public static Product getProduct(ProductType productType) {
        Product product;
        switch (productType) {
            case PRODUCTA: {
                product = getProductA();
                break;
            }
            case PRODUCTB: {
                product = getProductB();
                break;
            }
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
        return product;
    }

    private static Product getProductA() {
        return new ProductA();
    }

    private static Product getProductB() {
        return new ProductB();
    }
}
