package services.implementation;

import com.codecharlan.conveniencestore.models.Product;
import services.ProductCatalogService;

public class ProductCatalogServiceManagerImpl implements ProductCatalogService {
    Product product = new Product("Corn Flakes", 450.00, 30);

    @Override
    public String restockProduct(int restockSize) {
//        System.out.println(restockSize +" pieces of " + getProductName()
//                + " has been added to " + productQuantity +
//                " making a total of " + (restockSize+productQuantity));
        return restockSize +" pieces of " + product.getProductName()
                + " has been added to " + product.getProductQuantity() +
                " making a total of " + (restockSize+product.getProductQuantity());
    }

    @Override
    public String updatePrice(int productCost) {
//        System.out.println("The price of "+ productName
//                + " has been updated successfully");
        return "The price of "+ product.getProductName()
                + " has been updated successfully";
    }

    @Override
    public String discountPrice(int priceDiscountInPercent) {
//        System.out.println(priceDiscountInPercent+"% discount"
//                + " has been applied on " + productName);
        return priceDiscountInPercent+"% discount"
                + " has been applied on " + product.getProductName();
    }
}
