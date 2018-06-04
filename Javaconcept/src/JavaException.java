
public class JavaException {
	
	
	public static void main(String[] args) {
		int i = 1;
		int o = 0;
		//int k = i/o;
		try {
			
				System.out.println(i/o);
		}catch(Exception e) {
			System.out.println("Catching a exception");
		}
	}

}
