package collections;

public class College {
	int branches;
	int students;
	float placementper;
	College(int branches,int students,float placementper)
	{
		this.branches = branches;
		this.students = students;
		this.placementper = placementper;
	}
	public String toString()
	{
		return "College(branches=" +branches+ "  " +"students =" +students+ "  " + "placementper =" +placementper+")";
	}

}



