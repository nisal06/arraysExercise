
/**
 * クラス ex5New の注釈をここに書きます.
 * 
 * @author (Nisala)
 * @version (27-09-2019)
 */
public class ex05New
{
   public static void main(){
       
       boolean []result= new boolean [30];
       for(int j =0 ;j<result.length;j++){
        result[j]=true;
        }
       for (int i=2;i<result.length;i++){
        if(sieve(result,i)){
            System.out.println(i);
        }
        }
       
    }
     public static boolean sieve(boolean[] n,int j){
      if (j<1){
        return false;
        }
      
      for (int number=2;number<=Math.sqrt(j);number++){
         if (j % number == 0){
            return false;
         }
      }
      return true;
   } 
}
