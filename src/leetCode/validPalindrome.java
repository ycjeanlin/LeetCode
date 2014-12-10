package leetCode;


public class validPalindrome {

	public static void main(String[] args) {
		String input = "1a1";
		if(isPalindrome(input)){
			System.out.println("This is a palindrome");
		}else{
			System.out.println("This is not a palindrome");
		}
	}

	public static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		String cleanString;
		char[] chars = s.toCharArray();

		//delete the element that is not English alphabet
	    for (char c : chars) {
	    	if(Character.isLetter(c)||Character.isDigit(c)) {
	    		sb.append(c);
	    	}
	    }
	    
	    cleanString =sb.toString().toLowerCase();
	    chars = cleanString.toCharArray();
	    
	    int indexEnd = chars.length;
	    for(int i=0;i<indexEnd/2;i++){
	    	if(chars[i] != chars[indexEnd-1-i]){
	    		return false;
	    	}
	    }

		
		return true;
	}
}
