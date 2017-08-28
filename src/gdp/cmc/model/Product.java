package gdp.cmc.model;

public class Product {
  private Book book;
  private int quantity;
  public Product() {
    super();
  }
  public Product(Book book, int quantity) {
    super();
    this.book = book;
    this.quantity = quantity;
  }
  public Book getBook() {
    return book;
  }
  public void setBook(Book book) {
    this.book = book;
  }
  public int getQuantity() {
    return quantity;
  }
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  
  
}
