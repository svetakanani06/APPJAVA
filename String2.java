
public class String2 {
	
	public int vowelCount(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			str=str.toLowerCase();
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "GrowItSkill";
		String2 s = new String2();
		//s.vowelCount(str);
		System.out.println(s.vowelCount(str));

	}

}
