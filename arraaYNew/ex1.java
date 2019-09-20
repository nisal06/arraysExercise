
/**
 * クラス ex1 の注釈をここに書きます.
 * 
 * @author (Nisala)
 * @version (28/06/2019)
 */
import java.util.Random;
import java.util.Arrays;
public class ex1{
    public static void main(String[]args){
        int numValues = 50;
        int[]a = randomArray(numValues);
        System.out.println(Arrays.toString(a));
        
  
     }
     public static int[]randomArray(int size){
         Random random = new Random();
         int []a =new int [size];
         for (int i=0;i<a.length;i++){
             a[i]=random.nextInt(100);
    }
    return a;
   }
      
}
