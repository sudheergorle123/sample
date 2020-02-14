package collections;

public class Actor implements Comparable {
	String name;
	int rank;
	double payment;
	Actor(String name,int rank,double payment)
	{
		this.name = name;
		this.rank = rank;
		this.payment = payment;
	}
	public String toString() {
		return "Actor[name = "+name+",rank = " + rank + ",payment = "+payment+"]";
	}
	public int compareTo(Object ob)
	{
		Actor ac = (Actor)ob;
		return this.rank - ac.rank;
	}

}
