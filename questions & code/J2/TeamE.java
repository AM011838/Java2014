import java.util.*;
import java.lang.Math;
public class TeamE{
  public static void main(String args[]){    
  	Scanner sc = new Scanner(System.in);
	System.out.println(transString(sc.nextInt()));
    }
    
  
  
  public static String transString(int num){
    String rs = "";
    int ind;
    String[] rw = {"I" ,"V", "X" ,"L" ,"C" ,"D"  ,"M"};
    int []   rn = { 1,   5,  10,  50, 100, 500, 1000};
    Arrays.sort(rn);
    
    while(num > 0){
      ind = Arrays.binarySearch(rn, num);
      if (ind == -8){
        ind  = 6;
      }else if(ind <0){
        ind = -1 * ind - 2;
        int i = ind / 2 * 2;
        if (num + rn[i] >= rn[ind + 1]){
          rs += rw[i];
          num += rn[i];
          ind++;
        }
      }
      rs += rw[ind];
      num -= rn[ind];
    }    
    return rs;
  }  
  
}/*¸ê®Æ¨Ó·½:http://www.javaworld.com.tw/jute/post/view?bid=20&id=282108*/