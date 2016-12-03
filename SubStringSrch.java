/* Assignment 7.3: Program to find a substring in a String without 
   using an inbuilt method of String class for the same.
   Display the message stating substring found or not.
*/
class SubStringSrch {
	public static void main(String[] args){
		int j=0;	// Needed to retain value of j after loop completes
		System.out.print("Enter String: ");
		String str = System.console().readLine();
		System.out.print("Enter Substring: ");
		String sub = System.console().readLine();
		for (int i = 0; i < str.length(); i++){
			for (j = 0; j < sub.length(); j++){
				if ((i+j) > str.length() - 1){
					break;
				} else if (str.charAt(i+j) != sub.charAt(j)) {	// Logic to compare characters. Continue till matches, if no match breaks
					break;
				}
			}
			if (j == sub.length()){		// Enters inside the block only if all the chars of substring are checked
				System.out.println("Substring found!!!");	
				System.exit(0);	// Hard exit as the substring found so no need to traverse the remaining main string chars
			}	
		}
		System.out.println("Substring not found!!!");
	}
}