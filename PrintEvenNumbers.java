package For2;

public class PrintEvenNumbers {
	public static void main(String[]args) {
		int[] nums=new int[6];
		nums[0]=5;
		nums[1]=3;
		nums[2]=12;
		nums[3]=23;
		nums[4]=18;
		nums[5]=16;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.println(nums[i]);
			}
		}
		
	}

}
