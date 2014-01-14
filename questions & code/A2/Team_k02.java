import java.io.*;
import java.util.*;
public class Team_k02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("輸入一個整數數字:");
        int num  = sc.nextInt();
        int repNum = 0 ;
        int []a = new int [4];
        int []re = new int [4];
        for(int i = 3 ; i >= 0 ; i --){
            a[i] = num % 10;
            num = num/10;
        }//+5
        for(int i = 0 ; i < a.length ; i ++){
            a[i] = a[i] +5;
        }
        for(int i = 0 ; i < a.length ; i ++){
            a[i] = a[i]%10;
        }
        re[0] = a[3];
        re[1] = a[2];
        re[2] = a[1];
        re[3] = a[0];
        System.out.println("加密後數字為:");
        for(int i = 0 ; i < re.length ; i ++){
            System.out.print(re[i]+"");
        }
        System.out.println("");
        
    }

}
