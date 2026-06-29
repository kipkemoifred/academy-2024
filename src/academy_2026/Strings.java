package academy_2026;

public class Strings {
    public static void main(String[] args) {
        String name = "John ";
        name = name + " Doe";

        System.out.println(name);

        System.out.println(name.length()); // 4
        System.out.println(name.charAt(1)); // o
        System.out.println(name.toUpperCase()); // JOHN
        System.out.println(name.toLowerCase()); // john
        System.out.println(name.trim()); // "John"

        String a = "Java";
        String b = "Java";

        System.out.println(a.equals(b)); // true
        System.out.println(name.contains("Java")); // true

        String text1 = "Java is fun";

        System.out.println(text1.replace("fun", "powerful"));

        String text2 = "apple,banana,mango";

        String[] fruits = text2.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }


//    If you modify strings many times, it becomes slow and memory-heavy.

        String text = "";

        for (int i = 0; i < 5; i++) {
            text = text + i;
        }

        System.out.println(text);


   /*     StringBuilder sb = new StringBuilder("Java");

        //The Java StringBuilder class is mutable sequence of characters.

        sb.append(" is fun");     // add text
        sb.insert(0, "Learn ");   // insert at position
        sb.replace(0, 5, "Study"); // replace text
        sb.delete(0, 5);          // delete part
        sb.reverse();             // reverse string

        System.out.println(sb);*/

        StringBuilder sb = new StringBuilder("GeeksforGeeks");
        System.out.println("Initial: " + sb);

        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        sb.insert(13, " Java");
        System.out.println("After insert: " + sb);

        sb.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + sb);

        sb.delete(8, 14);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        char c = sb.charAt(5);
        System.out.println("Character at index 5: " + c);

        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);

        String sub = sb.substring(5, 10);
        System.out.println("Substring (5–10): " + sub);

        sb.reverse(); // Revert for search
        System.out.println("Index of 'Geeks': " + sb.indexOf("Geeks"));

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        String result = sb.toString();
        System.out.println("Final String: " + result);
    }



}
