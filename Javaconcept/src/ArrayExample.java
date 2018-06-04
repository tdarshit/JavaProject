
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {2, 120, 4, 1000, 0, 8};
		int max = num[0];
		
		for(int i=0;i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		
		System.out.println(max);

	}

}
