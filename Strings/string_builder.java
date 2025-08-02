package Strings;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert
        sb.insert(2,'n');
        System.out.println(sb);

        //delete
        sb.delete(2,3);//end index is not incuded
        System.out.println(sb);

        //append
        sb.append(" Star");
        System.out.println(sb);

        //length
        System.out.println(sb.length());
    }
}
