package Strings;

public class Strings {
    public static void main(String[] args) {
//        String fullname = "tony stark";
        //length
//        System.out.println(fullname.length());
        //charAt
//        for (int i = 0; i < fullname.length(); i++) {
//            System.out.println(fullname.charAt(i));
//        }


        // compareTo
        //s1>s2 : +ve value|
        //s1= s2 :0        |--> using ASCII value
        //s1<s2: -ve value |
//        String name1= "tony";
//        String name2="tony";
//        if (name1.compareTo(name2)==0){
//            System.out.println("Both String are equal");
//        }

        //substring
        String sentence = "My name is Tony";
        String name = sentence.substring(11);//ending index is non-inclusive like it was in python.5 hai toh 4 tak aayega
        System.out.println(name);
// strings are immutable
    }
}
