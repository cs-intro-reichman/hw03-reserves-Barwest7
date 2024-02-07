/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String result = "";
        for (int i=0; i<s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check if the character is not a space or it's the first occurrence
            if (result.indexOf(String.valueOf(currentChar)) == -1 && currentChar != ' ') {
                result += currentChar;
            }

            if (currentChar == ' ') {
                result += currentChar;
            }
        }
        return result;
    }
}