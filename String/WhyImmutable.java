package String;

public class WhyImmutable {
    public static void main(String[] args) {
        String str = "Sachin";
       str = str.concat(" Tendulakar"); // it refer to sachin Tendulakr

       //   str.concat(" Tendulakar");  // Immutable Concept // It reffer to scahin 

        System.out.println(str);


        

    }
}
