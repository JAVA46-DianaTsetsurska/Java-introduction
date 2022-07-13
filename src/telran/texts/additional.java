package telran.texts;

public class additional {
public static boolean hasValidBrackets(String text) {
	String brackets = "[{(]})";
	StringBuilder findPair = new StringBuilder();
	boolean res = true;
	for(int i = 0; i < text.length(); i++) {
		int temp = brackets.indexOf(text.charAt(i));
		if(temp >= 0 && temp <=2) {
			findPair.append(text.charAt(i));
		}
		if(temp > 2 ) {
			res = findPair.length() == 0 ? false : matchPair(findPair, brackets, temp);	
			
		}
		if(!res)
			return false;
			
			}
		
return findPair.length() == 0 ?  true : false; 

}


private static boolean matchPair(StringBuilder findPair, String brackets, int temp) {
	if(findPair.charAt(findPair.length() - 1) == brackets.indexOf(temp - 3))
	{findPair.deleteCharAt(findPair.length() - 1);
	return true;
	}
	return false;
}
}