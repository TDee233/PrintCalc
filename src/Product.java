class Product {
    private double pricePerUnit; // цена за единицу
    private int quantity; // количество

    // Конструктор класса Product
    public Product(double pricePerUnit, int quantity) {
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Метод для получения цены за единицу
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    // Метод для получения количества
    public int getQuantity() {
        return quantity;
    }
}