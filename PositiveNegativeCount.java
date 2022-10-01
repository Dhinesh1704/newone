package For2;

public class PositiveNegativeCount {
	public static void main(String[]args) {
		int[] nums= {35,-26,55,-20,21};
		int positiveCount=0;
		int negativeCount=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				positiveCount++;
				
			}
			else {
				negativeCount++;
			}
			
		}
	    System.out.println(positiveCount);
		System.out.println(negativeCount);
		
	}

}
