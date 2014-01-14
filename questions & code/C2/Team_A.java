import java.util.Scanner;

public class C2 {  
    public static void main(String[] args){  
        C2 pascal = new C2();  
        Scanner scanner = new Scanner(System.in);  
        System.out.println(請輸入巴斯卡三角行數：);  
        int num = scanner.nextInt();  
        pascal.pascalAssemble(num);  
    }  
      
    public void pascalAssemble(int num){  
        int[][] value = new int[num][num];  
        for(int i = 0; i  num ;i++){  
            value[i][0] = 1;  
            value[i][i] = 1;  
            if(i  1){  
                for(int j = 1; j  i ;j++){  
                    value[i][j] = value[i-1][j-1] + value[i-1][j];  
                }  
            }  
        }  
        for(int i = 0; i  num ;i++){  
            for(int k = 0; k = num - i;k++){  
                System.out.print(   );  
            }  
            for(int j = 0; j= i ;j++){  
                System.out.print(value[i][j]+     );  
            }  
            System.out.println();  
        }  
    }  
}  
