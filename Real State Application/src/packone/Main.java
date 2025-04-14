package packone;


class Flat
{
	private int squareFeet;
	private int pricePerSqft;
	private int floor;
	private int numberOfRooms;
	public Flat(int squareFeet, int pricePerSqft, int floor, int numberOfRooms)
	{
		this.squareFeet = squareFeet;
		this.pricePerSqft = pricePerSqft;
		this.floor = floor;
		this.numberOfRooms = numberOfRooms;
	}
	
	public int getFlatPrice()
	{
		return  squareFeet * pricePerSqft;
	}
	
	public void displayDetails()
	{
		System.out.println("Sqare Feet : " + squareFeet);
		System.out.println("Price Per Square Feet : Rs." + pricePerSqft);
		System.out.println("Floor number : " + floor);
		System.out.println("Number of Rooms : " + numberOfRooms);
	}
	
}

public class Main
{
	public static void main(String[] args)
	{
		Flat flat = new Flat(1050, 400, 9, 3);
		flat.displayDetails();
		System.out.println("Price of flat : Rs." + flat.getFlatPrice());
	}
}
