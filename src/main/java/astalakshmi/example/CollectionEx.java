package astalakshmi.example;

import java.util.*;

public class CollectionEx {
    public static void main (String[] args)
    {
        System.out.println("Exercise 1 :");
        exercise1();
        System.out.println("Exercise 2 :");
        exercise2();
        System.out.println("Exercise 3 :");
        exercise3();
        System.out.println("Exercise 4 :");
        exercise4();
        System.out.println("Exercise 5 :");
        exercise5();
        System.out.println("Exercise 6 :");
        exercise6();
        System.out.println("Exercise 7 :");
        exercise7();
        System.out.println("Exercise 8 :");
        exercise8();
        System.out.println("Exercise 9 :");
        exercise9();
        System.out.println("Exercise 10 :");
        exercise10();
        System.out.println("Exercise 11 :");
        exercise11();
        System.out.println("Exercise 12 :");
       // exercise12();
    }
    // Exercise 1 : List with days, then print the list
    static void exercise1()
    {
        List <String> days = new ArrayList<>(Arrays.asList ("Monday", "Tuesday", "Wednesday", "Thursday", "Saturday","Sunday"));
        System.out.println("Days : " + days); // prints the entire list

    }

    // Exercise 2 : List with days, print each day separately in far each loop
    static void exercise2()
    {
List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Saturday", "Sunday"));
for (String sep : days)
{
    System.out.println("Day : " + sep);
}
    }
   // Exercise 3 : List without Thursday, then insert Thursday in correct position
    static void exercise3()
    {
List <String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Saturday", "Sunday"));
        System.out.println("Before adding :" + days);
// Thursday should be index 3 (0 Mon, 1 tue, 2 wed, 3 thur)
        days.add(3,"Thursday");
        System.out.println("After adding : " + days);
    }
   // Exercise 4 : List with all days then create a new list with first 3 using sublist
    static void exercise4()
    {
List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Saturday", "Sunday"));
// Sublist (fromIndex, toindex) - toindex is exclusive
        List<String> firstThree = new ArrayList<>(days.subList(0,3));
        System.out.println("Original Days :" + days);
        System.out.println("First three days : " + firstThree);
    }
    /// exercise 5 : HashSet with days, print and notice order
    static void exercise5()
    {
Set<String> dayset = new HashSet<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Saturday", "Sunday"));
        System.out.println("Days :" + dayset );
    }
    // Exercise 6 : HashSet with days convert to ArrayList
    static void exercise6()
    {
Set<String> dayset = new HashSet<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Saturday", "Sunday"));
List<String> dayList = new ArrayList<>(dayset);
        System.out.println("HashSet :" + dayset);
        System.out.println("ArrayListSet :" + dayList );
    }
   // Exercise 7 : Hashset with random names -> ArraList -> manually sort alphabetically -> print
    static void exercise7()
    {
Set<String> nameSet = new HashSet<>(Arrays.asList("ABHH", "HFHYH", "GGTYU", "STEST", "LIUOIH"));
List<String> nameList = new ArrayList<>(nameSet);
// Manual sort
        for(int i =0;i<nameList.size()-1;i++)
        {
            for (int j=i+1;j<nameList.size();j++)
            {
                if (nameList.get(i).compareTo(nameList.get(j))>0)
                {
                    //swap
                    String temp = nameList.get(i);
                    nameList.set(i,nameList.get(j));
                    nameList.set(j,temp);
                }
            }
        }
        System.out.println("Sorted names :" + nameList);
    }
   // Exercise 8 : HashSet with random names -> sort using only a set (TreeSet)
    static void exercise8()
    {
Set<String> nameSet = new HashSet<>(Arrays.asList("SAJKFSK", "ESJFSF", "HDBFVJDS", "AYUDF"));
//TreeSet is a set that keeps elements in sorted order
        Set<String> sortedNames = new TreeSet<>(nameSet);
        System.out.println("Original HashSet :" + nameSet);
        System.out.println("Sorted set :" + sortedNames);
    }
   // Exercise 9 : HashSet <Integer , String > with id + car brand, print entire map
    static void exercise9()
    {
Map<Integer,String> carMap = new HashMap<>();
carMap.put(1, "Volvo");
carMap.put(2,"BMW");
carMap.put(3,"Tesla");
        System.out.println("Entier Map Output :" + carMap);
    }
   // Exercise 10 : Same map, print only keys
    static void exercise10()
    {
Map<Integer,String> carMap = new HashMap<>();
carMap.put(1, "Volvo");
carMap.put(2, "BMW");
carMap.put(3, "Tesla");
        System.out.println("Keys :" + carMap.keySet());
    }

   // Exercise 11 : Same map, print only values
    static void exercise11()
    {
        Map<Integer,String> carMap = new HashMap<>();
        carMap.put(1, "Volvo");
        carMap.put(2, "BMW");
        carMap.put(3, "Tesla");
        System.out.println("Values : " + carMap.values());
    }
   // Exercise 12 : Car class + HashMap < Integer, Car > print only brand
    /*static void exercise12()
    {
Map<Integer,String> carMap = new HashMap<>();

    }
    // Inner Class
    public class Car() {
        private int id;
        private String brand;
        private String model;
        public static void car(int id, String brand, String model) {
this.id = id;
this.brand = brand;
this.model = model;
        }

    }*/
}
