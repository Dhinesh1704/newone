package For2;

public class PrintStringForward {
	public static void main(String[]args) {
		String[] names=new String[4];
		names[0]="POCO";
		names[1]="MI";
		names[2]="realmi";
		names[3]="nokia";
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);   //forward print
			
		}
		for(int i=names.length-1;i>=0;i--) {
			System.out.println(names[i].toUpperCase());     //reverse print
		  
		
	}

}
}