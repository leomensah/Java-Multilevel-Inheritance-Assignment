/* Create a class named “Electronics” that provides a method device_type() for all the
 * electronic devices. Now create a class named “Television” which extends the Electronics
 * class which specifies the Electronics device and has a method name – category() to
 * display the type of electronic device. Then, create a class named “LED” extends the
 * Television class to specify the technology used for its display. It has the method
 * display_tech() to show the technology is LED.
 */

class Electronics{
	final String device_type = "Electronics";
	
	public void device_type() {
		System.out.println(device_type);
	}
}

class Television extends Electronics{
	final String elecDevice = "Television";
	
	public void category() {
		System.out.println(elecDevice);
	}
}

class LED extends Television{
	final String techUsed = "LED";
	
	public void display_tech() {
		System.out.print(techUsed);
	}
}


public class Q1 {

	public static void main(String[] args) {
		LED led = new LED();
		led.device_type();
		led.category();
		led.display_tech();
	}

}
