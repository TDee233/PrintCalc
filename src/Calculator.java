public class Calculator {
    public double calculateTotalCost(Product product) {
        return product.getPricePerUnit() * product.getQuantity();
    }
}
