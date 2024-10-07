package com.bptn.course._java_collection_list._01_arraylist._arraylist_coding_exercises;

import java.util.ArrayList;

public class ToDoList {
    
   public static void main(String[] args) {
//      // Rewrite this code to use an ArrayList instead of an array
//      String[] toDoList = new String[3];
//      toDoList[0] = "Do homework";
//      toDoList[1] = "Help make dinner";
//      toDoList[2] = "Call grandma";
//
//      // changing element at index 1
//      toDoList[1] = "Order pizza";
//
//      System.out.println(toDoList.length + " things to do!");
//      System.out.println("Here's the first thing to do: "
//           + toDoList[0] );
//
//      // remove item 0 and move everything down
//      //  (this can be done in 1 command with ArrayList)
//      toDoList[0] = toDoList[1];
//      toDoList[1] = toDoList[2];
//      toDoList[2] = "";
//
//      System.out.println("Here's the next thing to do: "
//           + toDoList[0] );
      
      ArrayList<String> newList = new ArrayList<>();
      newList.add("Do homework");
      newList.add("Help Make Dinner");
      newList.add("Call grandma");
      
      newList.set(1, "Order Pizza");
      
      System.out.println(newList.size() + " things to do!");
      
      System.out.println("Here's the first thing to do: " + newList.get(0));
      
      newList.remove(0);
      
      System.out.println("Here's the next thing to do: " + newList.get(0));
      
      
   }
}
