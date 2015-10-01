/**
This class will represents a book
*/

public class Book

{

/**
construct a book
*/
public Book(String aAuthor, String aTitle, double aPrice, double aRate)
{
	author = aAuthor;
	title = aTitle;
	price = aPrice;
	rate = aRate;
}

   /**
   Set an author's name
   */
   public void setAuthor(String aAuthor)
   {
	 author = aAuthor;
   }
   /**
   Returns authors name
   */
   public String getAuthor()
   {
	   return author;
   }
 /**
   Set books title
   */
   public void setTitle(String aTitle)
   {
	 title = aTitle;
   }
   /**
   Returns books title
   */
   public String geTitle()
   {
	   return title;
   }
 /**
   Set an author's name
   */
   public void setPrice(double aPrice)
   {
	 price = aPrice;
   }
   /**
   Returns book price
   */
   public double getPrice()
   {
	   return price;
   }

   /**
   Calculate student price
   */
   public double studentPrice( double rate)
   {
	   double discount, stPrice;
	   discount = price* (rate/100.0);
	   stPrice = price - discount;
	   return stPrice;
   }
   /**
   Dispay books data
   */
   public void printBook()
   {
	   System.out.println(" Author -"+ author);
	   System.out.println(" Title - " + title);
	   System.out.println(" Price - &" + price);
	   System.out.println(" Student price - $" + studentPrice(rate));
   }
	// instant fields

   private String author;
   private String title;
   private double price;
   private double rate;
}
