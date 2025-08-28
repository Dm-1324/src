class Book{
    String bookName;
    String authorName;
    int issueID;

    Book(String bookName,String authorName,int issueID){
        this.bookName = bookName;
        this.authorName = authorName;
        this.issueID = issueID;
    }
    public void displayBookDetails(){
        System.out.println("The book name is: "+bookName+" and it is written by: "+authorName+".Its issue id is: "+issueID);
    }
}



public class Ques24 {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter","JK Rowling",123432);
        b1.displayBookDetails();
    }
}
