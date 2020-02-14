package collections;

public class Movie {
	String Moviename;
	String actor;
	double budget;
	float duration;
	Movie(String Moviename,String actor,double budget,float duration)
	{
		this.Moviename = Moviename;
		this.actor = actor;
		this.budget = budget;
		this.duration = duration;
		
	}
	@Override
	public String toString()
	{
		return "Movie(Moviename="+Moviename+",actor="+actor+",budget="+budget+",duration= "+duration+")";
	}

}
