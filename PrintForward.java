package For2;

public class PrintForward {
	public static void main(String[]args) {
		int[]nums= {15,20,18,5,36,45,8};
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
			
		}
		for(int i=nums.length-1;i>=0;i--) {
			System.out.println(nums[i]);
		}
	}

}
