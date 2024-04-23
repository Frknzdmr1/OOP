import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        String[] sa = new String[5];
        // sa = [null, null, null, null, null] each 5 elements is equal to null
        sa[0] = "toaster";
        // sa = ["toaster", null, null, null, null]
        sa[1] = "fridge";
        // sa = ["toaster", "fridge", null, null, null}
        sa[2] = "kettle";
        // sa = ["toaster", "fridge","kettle", null, null]

        ArrayList<String> sal = new ArrayList<String>();
        // sal = [] the array is ready to get filled
        sal.add("Toaster");
        // sal = ["Toaster"]
        sal.add("Fridge");
        // sal = ["Toaster", "Fridge"]
        sal.add("Kettle");
        // sal = ["Toaster", "Fridge", "Kettle"]
        System.out.println(sal.get(1));
        sal.set(1,"Microwave");
        System.out.println(sal.get(1));


    }
}
