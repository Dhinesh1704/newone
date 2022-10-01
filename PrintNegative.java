package For2;

public class PrintNegative {
	public static void main(String[]args) {
		int[] a=new int[8];
		a[0]=-18;
		a[1]=21;
		a[2]=-56;
		a[3]=10;
		a[4]=-52;
		a[5]=14;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				System.out.println(a[i]);
			}
			
		}
		
	}

}
