import java.util.*;
/**
 * クラス ex05 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class ex05
{
   public void main(){
       
       
       System.out.println(a[i]);
       
    }
   public static boolean sieve(boolean[] a){
      
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       
       for (int i=2;i<=Math.sqrt(num);i++){
         if(a[i] == true){
             
          for(double j=Math.pow(i,2.0);j<num;j=j+i){
            if (a[(int)j]==false){
            
            }
           
        }
     }
    }
    return true;
}
}
