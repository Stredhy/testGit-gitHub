public class Dog{

	private int eyes;
	private String type;
	private String color;
	public Dog(Dog d){
		this.eyes = d.eyes;
		this.type = d.type;
		this.color = d.color;
	}
	public Dog(int e, String t, String c){
		this.eyes = e;
		this.type = t;
		this.color = c;
	}

	public void setEyes(int e){
		this.eyes = e;
	}

	public void setType(String t){
		this.type = t;
	}

	public void setColor(String c){
		this.color = c;
	}

	public int getEyes(){
		return this.eyes;
	}

	public String getType(){
		return this.type;
	}

	public String getColor(){
		return this.color;
	}

}