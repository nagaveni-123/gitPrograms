package practise;

public class AlphaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc123";
		char[] ch=str.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if (ch[i]>='0' && ch[i]<='9') {
				sum=sum+(ch[i]-48);
				
			}
			
		}System.out.println(sum);

	}

}
