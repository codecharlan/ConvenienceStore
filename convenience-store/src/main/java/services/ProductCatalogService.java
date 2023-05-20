package services;

    public interface ProductCatalogService {

        String restockProduct(int restockSize);
        String updatePrice(int productCost);
        String discountPrice(int priceDiscountInPercent);
    }

