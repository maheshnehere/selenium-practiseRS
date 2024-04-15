package javapractise;

public class String_Object {
    public static void main(String[] args) {
        String name = "Mahesh"; //1st way
        String name1 = "Sandesh"; //1st way

        String s = new String("Mahesh");
        String s1 = new String("Nehere");

        System.out.println(s.concat(s1));
        System.out.println(s+s1);

        String fullname = "Mahesh Dattatray Nehere";

        fullname.split("Dattatray");

        System.out.println(fullname.split("Dattatray"));

        for (int i = name.length()-1;i>=0;i--)
        {
            System.out.println(name.charAt(i));
        }

    }
}
