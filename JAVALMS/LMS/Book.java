package LMS;

public class Book {
    private String Name;
    private String AuthorName;
    private int ISBN;
    private int  Price;
    private String PublisherName;
    private String Releasedyear;
    

    public Book(int Price, int ISBN, String AuthorName, String Name , String PublisherName , String Releasedyear) {
        this.ISBN = ISBN;
        this. Name = Name;
        this.AuthorName = AuthorName;
        this.Price = Price;
        this.PublisherName = PublisherName;
        this.Releasedyear = Releasedyear;
    }

    public Book() {
         
    }

    public Book(String bookname) {
         
    }

    public int getISBN()
    {
        return ISBN;
    }

    public String getName()
    {
        return Name;
    }

    public String getPublisherName()
    {
        return PublisherName;
    }
    public String getReleasedyear() 
    {
        return Releasedyear;
    }

    public String getAuthor() 
    {
        return AuthorName;
    }

    public int getPrice() 
    {
        return Price;
    }
 


     

    
}


