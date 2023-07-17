package week1.day1;

public class Car {
	public void applyBreak()
	{
		System.out.println("applying break");
	}
	public void applyGear()
	{
		System.out.println("applying Gear");
	}
	public void switchOnAc()
	{
		System.out.println("switching on AC");
	}
	public void applyAccelerate()
	{
		System.out.println("applying Accelerate");
	}
	public static void main(String[] args) {
		Car mycar=new Car();
		mycar.applyBreak();
		mycar.applyGear();
		mycar.switchOnAc();
		mycar.applyAccelerate();
	}

}
