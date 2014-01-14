import java.util.*;
public class Team_K1 {
    public static void main(String[] args) {
       System.out.println("1.排序成績");
       System.out.println("2.離開");
       Scanner sc = new Scanner(System.in);
       int choice = sc.nextInt();
       ch aa = new ch();
       switch(choice){  case 1:
               aa.pr();
               break;
           case 2:
               break;
       }

      /*for(int i = 0  ;i  < a.length ; i ++){
            for(int j = 0 ; j < a.length ; j ++){
                System.out.print(a[i][j]+"   ");;
            }
            System.out.println("");
        }
    }
*/
}
}
class ch{
    public void pr(){
            System.out.println("1.排序號");
            System.out.println("2.排國文");
            System.out.println("3.排英文");
            System.out.println("4.排數學");
            System.out.println("5.排總分");
            sort aa = new sort();
          Scanner sc = new Scanner(System.in);
          int choice = sc.nextInt();

          switch(choice){
              case 1:
                aa.sortNum();
                break;
              case 2:
                aa.sortChi();
                break;
              case 3:
                aa.sortEng();
                break;
              case 4:
                aa.sortMath();
                break;
              case 5:
                aa.sortTol();
                break;
          }
            
    }
}

class sort{
        int [][]a = new int [5][5];
        int []temp = new int [6];
        
       
      void sortNum(){
         //序號
         for(int i = 0 ; i < a.length ; i ++){
            a[i][0]=i+1;
        }
       //亂數成績
        for(int i = 0  ;i  < a.length ; i ++){
            for(int j = 1 ; j < a.length-1 ; j ++){
                a[i][j] = (int)((Math.random()*101));
            }
        }
       //總分
        for(int i = 0 ; i < a.length ; i ++){
            for(int j = 1 ; j < 4 ; j ++){
                a[i][4] += a[i][j];
            }
        }
        int x,y;
        for(x= 0 ;x<a.length-1; x++){
            for(y =x+1 ; y < a.length ; y++){
                if(a[x][0]<a[y][0]){
                    temp= a [x];
                    a [x]= a[y];
                    a [y] = temp;
                }

            }
            }
       for(int i = 0  ;i  < a.length ; i ++){
            for(int j = 0 ; j < a.length ; j ++){
                System.out.print(a[i][j]+"   ");;
            }
            System.out.println("");
        }
    }
    
    public void sortChi(){
        //序號
         for(int i = 0 ; i < a.length ; i ++){
            a[i][0]=i+1;
        }
       //亂數成績
        for(int i = 0  ;i  < a.length ; i ++){
            for(int j = 1 ; j < a.length-1 ; j ++){
                a[i][j] = (int)((Math.random()*101));
            }
        }
       //總分
        for(int i = 0 ; i < a.length ; i ++){
            for(int j = 1 ; j < 4 ; j ++){
                a[i][4] += a[i][j];
            }
        }
        int x,y;
        for(x= 0 ;x<a.length-1; x++){
            for(y =x+1 ; y < a.length ; y++){
                if(a[x][1]<a[y][1]){
                    temp= a [x];
                    a [x]= a[y];
                    a [y] = temp;
                }

            }
            }
       for(int i = 0  ;i  < a.length ; i ++){
            for(int j = 0 ; j < a.length ; j ++){
                System.out.print(a[i][j]+"   ");;
            }
            System.out.println("");
        }
    }
    public void sortEng(){
        //序號
         for(int i = 0 ; i < a.length ; i ++){
            a[i][0]=i+1;
        }
       //亂數成績
        for(int i = 0  ;i  < a.length ; i ++){
            for(int j = 1 ; j < a.length-1 ; j ++){
                a[i][j] = (int)((Math.random()*101));
            }
        }
       //總分
        for(int i = 0 ; i < a.length ; i ++){
            for(int j = 1 ; j < 4 ; j ++){
                a[i][4] += a[i][j];
            }
        }
        int x,y;
        for(x= 0 ;x<a.length-1; x++){
            for(y =x+1 ; y < a.length ; y++){
                if(a[x][2]<a[y][2]){
                    temp= a [x];
                    a [x]= a[y];
                    a [y] = temp;
                }

            }
            }
       for(int i = 0  ;i  < a.length ; i ++){
            for(int j = 0 ; j < a.length ; j ++){
                System.out.print(a[i][j]+"   ");;
            }
            System.out.println("");
        }
    }
    public void sortMath(){
        //序號
         for(int i = 0 ; i < a.length ; i ++){
            a[i][0]=i+1;
        }
       //亂數成績
        for(int i = 0  ;i  < a.length ; i ++){
            for(int j = 1 ; j < a.length-1 ; j ++){
                a[i][j] = (int)((Math.random()*101));
            }
        }
       //總分
        for(int i = 0 ; i < a.length ; i ++){
            for(int j = 1 ; j < 4 ; j ++){
                a[i][4] += a[i][j];
            }
        }
        int x,y;
        for(x= 0 ;x<a.length-1; x++){
            for(y =x+1 ; y < a.length ; y++){
                if(a[x][3]<a[y][3]){
                    temp= a [x];
                    a [x]= a[y];
                    a [y] = temp;
                }

            }
            }
       for(int i = 0  ;i  < a.length ; i ++){
            for(int j = 0 ; j < a.length ; j ++){
                System.out.print(a[i][j]+"   ");;
            }
            System.out.println("");
        }
    }
    public void sortTol(){
        //序號
         for(int i = 0 ; i < a.length ; i ++){
            a[i][0]=i+1;
        }
       //亂數成績
        for(int i = 0  ;i  < a.length ; i ++){
            for(int j = 1 ; j < a.length-1 ; j ++){
                a[i][j] = (int)((Math.random()*101));
            }
        }
       //總分
        for(int i = 0 ; i < a.length ; i ++){
            for(int j = 1 ; j < 4 ; j ++){
                a[i][4] += a[i][j];
            }
        }
        int x,y;
        for(x= 0 ;x<a.length-1; x++){
            for(y =x+1 ; y < a.length ; y++){
                if(a[x][4]<a[y][4]){
                    temp= a [x];
                    a [x]= a[y];
                    a [y] = temp;
                }

            }
            }
       for(int i = 0  ;i  < a.length ; i ++){
            for(int j = 0 ; j < a.length ; j ++){
                System.out.print(a[i][j]+"   ");;
            }
            System.out.println("");
        }
    }
    }
   


    
       
    
