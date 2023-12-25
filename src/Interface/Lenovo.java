package Interface;

public class Lenovo implements Laptop{
	public void copy() {
		System.out.println("Lenovo copy");
	}

	public void paste() {
		System.out.println("Lenovo paste");
	}

	public void update() {
		System.out.println("Lenovo update");
	}

	public void delete() {
		System.out.println("Lenovo delete");
	}
	public void camera() {
		System.out.println("camera");
	}
	@Override
	public void security() {
		//System.out.println("Lenovo security");
	}
}
