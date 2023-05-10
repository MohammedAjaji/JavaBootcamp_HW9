public class Book extends Product {

    private String author;

    public Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + getName() + "\nPrice: before: " + getPrice() + " after: " + getDiscount() + "\nAuthor: " + author;

    }

    public double getDiscount(){
        return getPrice()*(1 - 0.20);
    }
}
