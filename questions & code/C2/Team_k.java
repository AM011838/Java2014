import java.util.Scanner;
public class Team_k {
    public static void main(String[] args){
         Team_k pascal = new Team_k();        
        pascal.pascalAssemble(10);
    }

public void pascalAssemble(int num){
        int[][] value = new int[10][10];
        for(int i = 0; i < 10 ;i++){
            value[i][0] = 1;
            value[i][i] = 1;
            if(i > 1){
                for(int j = 1; j < i ;j++){
                    value[i][j] = value[i-1][j-1] + value[i-1][j];
                }
            }
        }
        for(int i = 0; i < 10 ;i++){
            for(int k = 0; k <= 10 - i;k++){
                System.out.print("   ");
            }
            for(int j = 0; j<= i ;j++){
                System.out.print(value[i][j]+"     ");
            }
            System.out.println();
        }
    }
}