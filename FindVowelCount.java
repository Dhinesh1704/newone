package For2;

public class FindVowelCount {
	public static void main(String[]args) {
		String[] a= {"sky","ghky","allie","stcky","tigid"};
		int vowelCount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].contains("a")||a[i].contains("e")||a[i].contains("i")||a[i].contains("o")||a[i].contains("u")) {
				vowelCount++;
			}
		}
		System.out.println(vowelCount);
	}

}
