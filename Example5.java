package For2;

public class Example5 {
	public static void main(String[]args) {
		String[] electronics=new String[5];
		electronics[0]="Laptops";
		electronics[1]="mouse";
		electronics[2]="Webcam";
		electronics[3]="Keyboards";
		electronics[4]="charger";
		String min=electronics[0];
		
		for(int i=0;i<electronics.length;i++) {
			if(electronics[i].length()<min.length()) {
				min=electronics[i];
			}
		}
		System.out.println(min); //print minimum string

}
}
