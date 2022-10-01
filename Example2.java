package For2;

public class Example2 {
	public static void main(String[]args) {
		String[] a= {"lenova","asus","Dell","HP","Mac","Msi"};
		for(int i=0;i<a.length/2;i++) {
			System.out.println(a[i].toUpperCase()); //Print first half
		}
		for(int i=a.length/2;i<a.length;i++) {
			System.out.println(a[i].toLowerCase()); //Print Second half
	}
		for(int i=a.length/2;i<a.length;i++) {
			System.out.println(a[i].length()); //Print Second half length

}
}
}
