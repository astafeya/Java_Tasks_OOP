package authorsAndBooks;

public class Book extends Author{
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.price = price;
        this.authors = new Author[authors.length];
        for (int i = 0; i < authors.length; i++) {
            this.authors[i] = authors[i];
        }
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.authors = new Author[authors.length];
        for (int i = 0; i < authors.length; i++) {
            this.authors[i] = authors[i];
        }
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name = " + name + ", authors = " + this.getAuthorNames()
                + ", price = " + price + ", qty = " + qty +"]";
    }

    public String getAuthorNames() {
        String st = authors[0].getName();
        for (int i = 1; i < authors.length; i++) {
            st+= ", " + authors[i].getName();
        }
        return st;
    }
}
