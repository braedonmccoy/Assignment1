
public abstract class region {
	
	private String name;
	private int population;
	private double area;

	public int getPopulation(){
		return population;
	}
	
	public void setPopulation(int popIn){
		population = popIn;
		return;
	}
	
	public double getArea(){
		return area;
	}
	
	public void setArea(double areaIn){
		area = areaIn;
		return;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String nameIn){
		name = nameIn;
		return;
	}

}
