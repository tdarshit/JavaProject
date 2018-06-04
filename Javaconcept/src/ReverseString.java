
public class ReverseString {


	public static void main(String[] args) {
	
		String name = "cricket";
		String reverse = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			
			//System.out.println(name.charAt(i));
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println(reverse);	
		if(name.equals(reverse)) {
			System.out.println("Passed string match");
		} else {
			System.out.println("String failed to match");
		}
		
	}
}
