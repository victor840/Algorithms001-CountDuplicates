package hbcu.stay.ready.algorithms;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     *
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input) {
        return counterMethod(input);
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     *
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input) {
        return counterMethod(input);
    }

    private Integer counterMethod(Object[] input) {

/*
        HashSet<Object> inputSet = new HashSet<>(Arrays.asList(input));

        // Solving with Hash Map
        HashMap<Object, Integer> duplicateMap = new HashMap<>();
      for(int i = 0; i < input.length; i ++) {
          Integer currentIntger = (Integer) input[i];
          duplicateMap.put(currentIntger,
                  duplicateMap.containsKey(currentIntger)
                          ? duplicateMap.get(currentIntger) + 1 : 1);

      /  if(duplicateMap.containsKey(currentIntger)){
              duplicateMap.put(currentIntger, duplicateMap.get(currentIntger) + 1);
          }else {
              duplicateMap.put(currentIntger, 1);
          }
          // Does the map currently have the key/intger ? If it does just add one more to what the excisting value for the key already is -- otherwise, make it 1 because we have not encournted this value before
      }
      }
        System.out.println(duplicateMap.toString()); //
        int amountOfDuplicates =
        duplicateMap.values().stream().mapToInt(i -> {
            if(i>1){
                return 1;
            }
            return 0;
        }).reduce(0, Integer::sum);
          // return amountOfDuplicates;


       Collection<Integer> duplicates = duplicateMap.values();
       int secondAmountOfDuplicates = 0;
        for(Integer integer: duplicates){
            if(integer > 1){
                secondAmountOfDuplicates++;
            }
        }
        //return secondAmountOfDuplicates;
    */
        Arrays.sort(input);
        Object currentValue = null;
        int duplicates = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if ((input[i] == input[i + 1]) && (input[i] != currentValue)) {
                duplicates++;
                currentValue = input[i];
            }
        }
        return duplicates;
    }
}

       // return input.length - inputSet.size();



