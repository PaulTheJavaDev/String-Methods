public class Main {

    public static void main(String[] args) {

        String testString = "Hello World!";
        int testIndex = 4;
        char testChar = 'e';
        reverseString(testString);
        lengthOfString(testString);
        accessCharacter(testString, testIndex);
        changeToLowercase(testString);
        changeToUppercase(testString);
        trimSpaces(testString);
        replaceCharacter(testString, testIndex, testChar);
        repeatString(testString, testIndex); //the index here is used for the amount of times repeated parameter ;)
        compareStrings(testString, "I love Java!");

    }


    public static void reverseString(String text) {

        char[] in = text.toCharArray();
        int begin = 0; // Index position of the beginning
        int end = in.length - 1; // Index position of the end
        char temp;

        //Swap characters until the middle of the array is reached
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp; //Ensure you also set in[end] to temp
            end--;
            begin++;
        }

        // Print the reversed string
        System.out.println(new String(in));
    }


    public static void lengthOfString(String text) {
        System.out.println(text.length());
    }

    public static void accessCharacter(String text, int index) {
        System.out.println(text.charAt(index));
    }

    public static void changeToLowercase(String text) {
        System.out.println(text.toLowerCase());
    }

    public static void changeToUppercase(String text) {
        System.out.println(text.toUpperCase());
    }

    public static void trimSpaces(String text) { //example: "Hello World" output: "HelloWorld"
        text = text.replace(" ", "");
        System.out.println(text);
    }
    
    public static void replaceCharacter(String text, int index, char character) {
        StringBuilder newString = new StringBuilder(text);
        newString.setCharAt(index, character);

        System.out.println(newString);
    }

    public static void repeatString(String text, int repeats) {
        for (int i = 0; i < repeats; i++) {
            System.out.println(text);
        }
    }

    public static void compareStrings(String text1, String text2) {
        System.out.println(text1.equals(text2));
    }
}
