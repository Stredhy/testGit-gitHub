public class Dog{

	private int years;
	private String type;
	private String color;

	public Dog(Dog d){
		this.years = d.years;
		this.type = d.type;
		this.color = d.color;
	}
	public Dog(int y, String t, String c){
		this.years = y;
		this.type = t;
		this.color = c;
	}

	public void setEyes(int y){
		this.years = y;
	}

	public void setType(String t){
		this.type = t;
	}

	public void setColor(String c){
		this.color = c;
	}

	public int getYears(){
		return this.years;
	}

	public String getType(){
		return this.type;
	}

	public String getColor(){
		return this.color;
	}

}