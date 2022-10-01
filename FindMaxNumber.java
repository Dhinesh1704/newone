package For2;

public class FindMaxNumber {
	public static void main(String[]args) {
		int[]nums= {22,54,61,18,75,26};
		int max=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			
				
			}
		}
		System.out.println(max);
		
	}

}
