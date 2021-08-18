import java.util.*;

public class Arraylist {
    public static void main(String args[]) {
        /* Creating ArrayList of type "String"
         */
        ArrayList<String> obj = new ArrayList<String>();

        /*This is how we add elements to an ArrayList*/
        obj.add("Komal");
        obj.add("Gareth");
        obj.add("Arkaan");
        obj.add("Toby");
        obj.add("Sam");

        // Displaying elements
        System.out.println("Original ArrayList:");
        for(String str:obj)
            System.out.println(str);

        /*
         Adding element "Tom" at 1st
         Adding element "Alex" at 2nd
         */
        obj.add(0, "Tom");
        obj.add(1, "Alex");

        // Displaying elements
        System.out.println("ArrayList after add operation:");
        for(String str:obj)
            System.out.println(str);

        //Remove elements from ArrayList
        obj.remove("Toby"); //Removes "Toby" from ArrayList
        obj.remove("Sam"); //Removes "Sam" from ArrayList

        // Displaying elements
        System.out.println("ArrayList after remove operation:");
        for(String str:obj)
            System.out.println(str);

        //Remove element from the specified index
        obj.remove(1); //Removes Second element from the List

        // Displaying elements
        System.out.println("Final ArrayList:");
        for(String str:obj)
            System.out.println(str);
    }
}
