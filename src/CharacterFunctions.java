public class CharacterFunctions {
    public static void main(String[] args) {
        char ch = 'G';
        if (Character.isUpperCase(ch)) {
            System.out.println("this character is uppercase");

        }
        if (Character.isLowerCase(ch)){
            System.out.println();
            System.out.println("this character is lowercase ");
        }
        System.out.println("UpperCase :" + Character.isUpperCase(ch));
        System.out.println("UpperCase :" + Character.isLowerCase(ch));
        System.out.println("UpperCase :" + Character.isDigit(ch));
        System.out.println("UpperCase :" + Character.isLetter(ch));


        String S1 = "Hello";
        String S2 = "World";
        String S3 = "Hi";
        String S = S1 + " " + S2;
        System.out.println(S);
        System.out.println("CharAt 6 :" + S.charAt(6));
        System.out.println("Equality of S1 and S2 :" + S1.equals(S3));


    }
}
