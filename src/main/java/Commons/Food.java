package Commons;

import Splitter.Splitter;

public class Food {
    private String name;
    private CategoryFood category;
    private double price;
    public Food(String name, String category, double price) {}
    public Food() {}

    public String getName() { return name; }
    public CategoryFood getCategory() { return category; }
    public double getPrice() { return price; }
    public void setName(String name) { this.name = name; }
    public void setCategory(CategoryFood category) { this.category = category; }
    public void setPrice(double price) { this.price = price; }
    public String toString() {
        return name + Splitter.SEPARATOR + category.toString() + Splitter.SEPARATOR + price;
    }
}
