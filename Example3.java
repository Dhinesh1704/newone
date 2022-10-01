package For2;

public class Example3 {
	public static void main(String[]args) {
		String[] electronics=new String[5];
		electronics[0]="Laptops";
		electronics[1]="mouse";
		electronics[2]="Webcam";
		electronics[3]="Keyboards";
		electronics[4]="charger";
		for(int i=0;i<electronics.length;i++) {
			if(electronics[i].endsWith("s")) {
				System.out.println(electronics[i]); //print plural words
				
				
			}
		}
		
	}

}
