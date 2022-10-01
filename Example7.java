package For2;

public class Example7 {
		public static void main(String[]args) {
			int[]nums= {22,54,61,18,75,26};
			int min=nums[0];
			
			for(int i=0;i<nums.length;i++) {
				if(nums[i]<min) {
					min=nums[i];
				}
				
					
				}
			if(min%2==0) {
			System.out.println("is even");
			}
			else {
				System.out.println("is odd");
			}
				
			
	}
		
		

}

