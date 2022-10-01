package For2;

public class Example4 {
	public static void main(String[]args) {
		String[] electronics=new String[5];
		electronics[0]="Laptops";
		electronics[1]="mouse";
		electronics[2]="Webcam";
		electronics[3]="Keyboards";
		electronics[4]="charger";
		String max=electronics[0];
		
		for(int i=0;i<electronics.length;i++) {
			if(electronics[i].length()>max.length()) {
				max=electronics[i];
			}
		}
		System.out.println(max); //print maximum string

}
}
