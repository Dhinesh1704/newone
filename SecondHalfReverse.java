package For2;

public class SecondHalfReverse {
	public static void main(String[]args) {
		int[]a=new int[8];
		a[0]=18;
		a[1]=16;
		a[2]=43;
		a[3]=56;
		a[4]=74;
		a[5]=25;
		a[6]=67;
		a[7]=16;
		for(int i=a.length-1;i>=a.length/2;i--) {
			System.out.println(a[i]);     //print Second half reverse
			
		}
	}

}
