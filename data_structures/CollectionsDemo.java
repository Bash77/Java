package data_structures;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
//       setDemo();
        listDemo();
//        queueDemo();
//        mapDemo();
    }
    public static void setDemo(){
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("banana");

        var i = fruits.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println(fruits);
        fruits.remove("banana");
        System.out.println("Contains banana? " + fruits.contains("banana"));

        System.out.println("Size: " + fruits.size());

        Set moreFruit = Set.of("Pear", "raisin" , "cherry");
        moreFruit.add("cranberry");
        System.out.println(moreFruit);
    }


    public static void listDemo(){
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.set(2, "grape");
        System.out.println(fruits);
        fruits.remove(3);

        for (String fruit: fruits){
            System.out.println(fruit);
        }

//        System.out.println("Index 2: " + fruits.get(2));
//        System.out.println("index of grape: " + fruits.indexOf("grape"));
//        System.out.println("last index of lemon: " + fruits.lastIndexOf("lemon"));
//
//        System.out.println(fruits);
//
//        List moreFruit = List.of("cherry", "plum");//immutable

    }

    public static void queueDemo(){
        Queue fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

       var removed =  fruits.remove();
        System.out.println("removed: " + removed);
        System.out.println("head of queue: " + fruits.peek());

        System.out.println(fruits);


    }

    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon" , 20);
        fruitCalories.put("banana" , 105);
        fruitCalories.put("orange" , 45);
        fruitCalories.put("lemon " , 17);


        for (Map.Entry colorieInfo: fruitCalories.entrySet()){
            System.out.println(colorieInfo.getKey() + ": " + colorieInfo.getValue());
        }


//        Set mapEntries = fruitCalories.entrySet();
//        var i = mapEntries.iterator();
//        while (i.hasNext()){
//            Map.Entry entry = (Map.Entry)i.next();
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
//
//        fruitCalories.remove("lemon");
//        System.out.println(fruitCalories);
//        System.out.println("banana calories: " + fruitCalories.get("banana"));
//        System.out.println("contains orange? " + fruitCalories.containsKey("orange"));
//
//        Map immutableFruitcalories = Map.of(
//                "apple", 95,
//                "lemon", 20);
    }
}
