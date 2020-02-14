package queue;

@SuppressWarnings("rawtypes")
public class Book implements Comparable{
	int id;
	String name,author;
	int quantity;
	Book(int id,String name,String author,int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}
	@Override
	public int compareTo(Object o)
	{
		Book bd = (Book)o;
		return this.quantity-bd.quantity;
	}
	public String toString()
	{
		return "BOOK[id=" +id+ " "+" name = "+name+ " "+" author = " +author+ " " + "quantity= "+quantity+"]";
	}
		
	

}
