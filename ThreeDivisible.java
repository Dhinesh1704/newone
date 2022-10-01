package For2;

public class ThreeDivisible {
	public static void main(String[]args) {
		int[]a= {10,13,12,9,27,45,30,42,60,15};
		for(int i=0;i<a.length;i++) {
			if(a[i]%3==0) {
				System.out.println(a[i]);
				
			}
		}
	}

}
