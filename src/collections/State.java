package collections;

public class State {
	long population;
	float growth;
	int rivers;
	State(long population,float growth,int rivers)
	{
		this.population = population;
		this.growth = growth;
		this.rivers = rivers;
	}
	public String toString()
	{
		return "State[population = " +population+ "   " +"growth = " +growth+  "  " +"rivers =" +rivers+ "]";
	}

}
