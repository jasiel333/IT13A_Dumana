
package MIDTERM;


public class MantexDumana_Multi_Dimentional {
 
    public static void main (String[] args) {
      int[] [] array = {
          {1, 2, 3, 4},
        {5, 6, 7, 8},
      {9, 10, 11, 12}
     };
   for (int i = 0; i < array.length; i++) {
    System.out.print ("The element in Row" + (i + 1) + " : ");
    for (int j = 0; j < array[i].length; j++) {
    System.out.print (array[i][j] + " ");    
}
  System.out.println();  
    }
   }
    }

