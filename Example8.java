package For2;

public class Example8 {
	public static void main(String[]args) {
		String[] names= {"HERCULAS","Hero","BSA","Atlas"};
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(names[i].toUpperCase())) {
				System.out.println(names[i]);            //print uppercase string
			}
			
		}
	}

}
