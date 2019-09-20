
/**
 * クラス ex02 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex02{

    public static int banana(int[] a){
     // Storing result of calculation
      int kiwi = 1;
      // Storing index to travserse `a`
      int i = 0;
      while (i < a.length){
         kiwi = kiwi * a[i];
         i++;
      }
      return kiwi;
   }
   
   /**
   * Finds the index of first `grape` in `a`
   * indexOf(`grape`)
   * @return Index of `grape`; -1 if not found
   */
   public static int grapefruit(int[]a, int grape){
      for (int i=0;i<a.length;i++){
         if (a[i] == grape){
            return i;
         }
      }
      return -1;
   }
   
  
   public static int pineapple(int[] a, int apple){
      // Storing total number of `apple`
      int pear = 0;
      for (int pine: a){
         if (pine == apple){
            pear++;
         }
      }
      return pear;
   }
}