package ShopManager;

public class Product extends Type {
    private String productId;
    private String productName;
    private double price;
    private String note;
    private int quantity;

    public Product() {
    }

    public Product(String tpyeId, String tpyeName, String productId, String productName, double price, int quantity,
            String note) {
        super(tpyeId, tpyeName);
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.note = note;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String id) {
        productId = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "TypeId=" + getId() + " TypeName=" + getName() + " Product [productId=" + productId + ", productName="
                + productName + ", price=" + price + ", quantity=" + quantity + ", note="
                + note + "]";
    }

}
