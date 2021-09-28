
public class palindrome {

	public static void main(String[] args) {
	
		String a="madam";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			
				
				 b=b+a.charAt(i);	
			}
				
				
			if(b.contains(a)) {
				System.out.println("it is pallindrome");
			}
			else {
				System.out.println("it is not pallindrome");
			}
			
		
		
		
		
	}

}
