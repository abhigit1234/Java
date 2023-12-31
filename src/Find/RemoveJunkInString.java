package Find;

public class RemoveJunkInString {

	public static void main(String[] args) {
		
		String s = "@?@£$%$^^&**^^ hello (*(*&^%% babu";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", " "));

	}

}
