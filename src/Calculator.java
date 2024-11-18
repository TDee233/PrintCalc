public class Calculator {
    public double calcTotalCost(Product product) {
        return product.getPricePerUnit() * product.getQuantity();
    }
}
