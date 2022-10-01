package For2;

public class OddEvenCount {
	public static void main(String[]args) {
		int[]a= {23,22,56,24,14,59};
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenCount=evenCount+1;
			}
			else {
				oddCount++;
				
			}
		
			
			
		}
	System.out.println(evenCount);
	System.out.println(oddCount);
	}

}
