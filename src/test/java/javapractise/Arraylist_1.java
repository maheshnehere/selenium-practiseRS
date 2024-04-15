package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist_1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("mahesh");
        a.add("nehere");
        a.get(0);
        String z = a.get(1);
        System.out.println(a.get(0));
        System.out.println(z);

        for (int i = 0; i < a.size(); i++) {

            System.out.println(a.get(i));
        }

        for (String valve : a) {
            System.out.println(valve);
        }

        int [] num = {1,2,4,5,6,7};

        List<int[]> product = Arrays.asList(num);
        System.out.println(product.contains(3));

    }
}

