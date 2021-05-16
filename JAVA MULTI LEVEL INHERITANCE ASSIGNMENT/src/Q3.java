// Create a Class Person

class Person{
	public void nationality(String nationality) {
		System.out.println(nationality);
	}
	
	public void place(String place) {
		System.out.println(place);
	}
}

// Create Employee class
class Emp extends Person{
	public void organization(String organization) {
		System.out.println(organization);
	}
	
	public void place(String place) {
		System.out.print(place);
	}
}

class Manager extends Emp{
	public void subordinates(String subordinates) {
		System.out.println(subordinates);
	}
	
	public void place(String place) {
		System.out.println(place);
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager man = new Manager();
		man.place(" Dunkwa");
		man.nationality("Ghana");
		man.organization("AMALITECH CO.");
		man.subordinates("Workers");

	}

}
