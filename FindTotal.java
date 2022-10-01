package For2;

public class FindTotal {
	public static void main(String[]args) {
		int[]a=new int[8];
		a[0]=7;
		a[1]=16;
		a[2]=22;
		a[3]=44;
		a[4]=56;
		a[5]=22;
		a[6]=18;
		a[7]=16;
		int total=0;
		
		for(int i=0;i<a.length;i++) {
			total=total+a[i];
			
		}
		System.out.println(total);      //print total
	}

}
