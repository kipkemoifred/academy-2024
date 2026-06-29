package academy_2026;

import java.util.Map;

public class Arrays {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Looping through the array using a for loop
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Looping through the array using an enhanced for loop
        System.out.println("All elements in the array (enhanced for loop):");
        for (int num : numbers) {
            System.out.println(num);
        }

        //multidimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //arraylist
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        System.out.println(list.get(0)); // Accessing first element
        list.set(1, "Blueberry"); // Modifying second element
        list.remove(2); // Removing third element
        System.out.println("Modified ArrayList elements:");
        for (String fruit : list) {
            System.out.println(fruit);  }

        //hashset
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        System.out.println("HashSet elements:");
        for (int num : set) {
            System.out.println(num);
        }

        //hashmap
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("Apple", 1);
        map.put("Banana",2);
        map.put("Cherry",3);

        System.out.println(map.get("Apple"));
        System.out.println(map.remove("Cherry"));
        System.out.println(map.remove("Chemrry"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
