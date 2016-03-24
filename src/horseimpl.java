

public class horseimpl implements Horse {

	int weight = 0;
	String name = null;
	
	public horseimpl(String name, int weight) {
			setName(name);
			setWeight(weight);
			
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
