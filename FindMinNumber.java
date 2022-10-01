package For2;

public class FindMinNumber {
	public static void main(String[]args) {
		int[]nums= {22,54,61,18,75,26};
		int min=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				min=nums[i];
			
				
			}
		}
		System.out.println(min);

}
}


