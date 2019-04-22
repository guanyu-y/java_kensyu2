class Book{
  private String title;
  private String author;
  private int price;

  public Book(String title, String author, int price){
    this.title = title;
    this.author = author;
    this.price = price;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public void setAuthor(String author){
    this.author = author;
  }
  public void setAuthor(int price){
    this.price = price;
  }
  public String getTitle(){
    return title;
  }
  public String getAutor(){
    return author;
  }
  public int getPrice(){
    return price;
  }
  public void showBook(){
    System.out.print("タイトル：" + title);
    System.out.print(" 著者：" + author);
    System.out.println(" 価格：" + price + "円");
  }
}
class UseBook{
  public static void main(String[] args){
    Book b1 = new Book("TCP/IP 入門", "吉田茂樹", 2200);
    Book b2 = new Book("XMLのすべて", "高橋麻奈", 1800);

    b1.showBook();
    b2.showBook();

    Book[] bArry = {new Book("『TCP/IP 入門』", "吉田茂樹", 2200),
                    new Book("「XMLのすべて』", "高橋麻奈", 1800),
                    new Book("『話せる英文法』", "有小山博美", 1500)};

    for(Book book : bArry){
        book.showBook();
    }

  }
}
