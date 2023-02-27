// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.List;
import java.util.ArrayList;

class HelloWorld {
    public static void main(String[] args) {
        int[] myArray = {-10,-5,-6,-3,-8,-5,-7,-4,-5,-8,6,-1,-6};
        String ff = "Kofi has a ball and kwame and he has a dick";
        int count  = summing(myArray);
        System.out.println(count);
    }
    
    
    public static int summing (int[] myArray){
       List<Integer> mylist = new ArrayList<Integer>();
       Integer max = myArray[0]>myArray[1]? myArray[0]: myArray[1];
       Integer secondMax= myArray[0]>myArray[1]? myArray[0]: myArray[1];
       for(int a: myArray){
           mylist.add(a);
       }
      for(Integer s: mylist){
          if(s>max){
              max = s;
          }else if (s<max && s>secondMax){
            secondMax= s;
          }
      }
      
       return secondMax;
    }
        
}
