/**
   This program tests the Book class.
*/
public class BookTest
{
   public static void main(String[] args)
   {
     Book textBook = new Book("Java Concepts", "Cay Horstmann", 99.98, 10.0);
     textBook.printBook();
   }
}
