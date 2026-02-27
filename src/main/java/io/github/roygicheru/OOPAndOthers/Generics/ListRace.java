package io.github.roygicheru.OOPAndOthers.Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRace {
     private static final int ELEMENTS= 100_000;
     
     private static void timeHeadInsertion(List<Integer> list, String listType){
         long startTime = System.currentTimeMillis();

         for(int i = 0; i < ELEMENTS; i++){
             list.add(0, i);
         }

         long endTime = System.currentTimeMillis();
         System.out.println(listType + " took: " + (endTime - startTime) + "ms");

     }

     private static void timeRandomAccess(List<Integer> list, String listType){
         long startTime = System.currentTimeMillis();

         for(int i = 0; i < ELEMENTS; i++){
             list.get(ELEMENTS / 2);
         }
         long endTime = System.currentTimeMillis();
         System.out.println(listType + " took: " + (endTime - startTime) + "ms");
     }

     public static void main(String[] args) {
         List<Integer> arrayList = new ArrayList<>();
         List<Integer> linkedList = new LinkedList<>();

         System.out.println("--- The performance Race (Distance: " + ELEMENTS + ") ---");
         timeHeadInsertion(arrayList, "arrayList");
         timeHeadInsertion(linkedList, "linkedList");
         timeRandomAccess(arrayList, "arrayList");
         timeRandomAccess(linkedList, "linkedList");
     }
}
