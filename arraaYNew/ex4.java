
/**
 * クラス ex4 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex4{
    public static void main(){
      int []num={2,4,56,46,6,43,64,39,58};
      System.out.println(indexOfMax(num));
  
     }
    public static int indexOfMax(int[]num){
        int min,max;
        min= num[0];
        max = 0;
     for (int i=0;i<num.length;i++){
         if (min>num[i])  {
       min=num[i];
        } 
       else if (min<num[i])  {
         max = num[i];
           } 
  
          }
     return max;
      }

}
   