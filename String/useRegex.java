package String;

public class useRegex {
    public static void main(String[] args) {
        
        String str = " Alok Kumar Maurya ";

       String  str1 = str.replaceAll("\\s", "-");

        System.out.println(str1);
    }
}
