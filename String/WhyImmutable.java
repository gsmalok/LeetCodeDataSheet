package String;

public class WhyImmutable {
    public static void main(String[] args) {
        String str = "Sachin";
       str = str.concat(" Tendulakar");

       //   str.concat(" Tendulakar");  // Immutable Concept

        System.out.println(str);
    }
}
