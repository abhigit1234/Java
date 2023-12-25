package Interface;

public interface Laptop {

	public  void copy();

	public void paste();

	public void update();

	public void delete();

public	default void security() {
		System.out.println("Default security");
	}
public	static void camera() {
		System.out.println("static camera");
	}

}
