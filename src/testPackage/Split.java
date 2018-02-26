package testPackage;

public class Split {

	public static void main(String z[]) {
		
		String str = "abc abc ba";
		
		String []arr = str.split(" ");
		
		for(String word:arr) {
			System.out.println(word);
		}
	}
}
