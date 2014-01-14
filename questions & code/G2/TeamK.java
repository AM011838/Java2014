import java.util.*;
public class TeamK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0,d=0,k=0,total=0;
        int[] dol=new int[80];
        int[] num=new int[80];
        String[] n=new String[80];
        String[] s1= {"","青江菜","花椰菜","高麗菜","空心菜"};
        String[] s2= {"","牛肉","豬肉","雞肉","羊肉"};
        String[] s3= {"","蛤蠣","蝦子","鮭魚","小卷"};
        String[] s4= {"","榴槤","火龍果","荔枝","哈密瓜"};
        int[] a1={0,20,25,40,20};
        int[] a2={0,200,150,100,100};
        int[] a3={0,160,200,150,100};
        int[] a4={0,100,60,90,150};
        System.out.print("選擇1.蔬菜2.肉品3.海鮮4.水果5.結束:");
        a=sc.nextInt();
        while(a<5){//選擇品類迴圈
            if(a==1){
                System.out.println("選擇:"+"\n"+"1.青江菜20元"+"\n"+"2.花椰菜25元"+"\n"+"3.高麗菜40元"+"\n"+"4.空心菜20元"+"\n"+"5.返回");
                System.out.println("號碼:");
                c=sc.nextInt();
                while(c<5){//選擇單品迴圈
                    System.out.println("數量:");
                    d=sc.nextInt();
                    for(int t=1;t<5;t++){
                        if(t==c){
                            n[k]=s1[c];
                            dol[k]=a1[c];
                            num[k]=d;
                            k++;
                        }
                    }
                    System.out.println("號碼:");
                    c=sc.nextInt();
                }
            }
            else if(a == 2){
                System.out.println("選擇:"+"\n"+"1.牛肉200元"+"\n"+"2.豬肉150元"+"\n"+"3.雞肉100元"+"\n"+"4.羊肉100元"+"\n"+"5.返回");
                System.out.println("號碼:");
                c=sc.nextInt();
                while(c<5){//選擇單品迴圈
                    System.out.println("數量:");
                    d=sc.nextInt();
                    for(int t=1;t<5;t++){
                        if(t==c){
                            n[k]=s2[c];
                            dol[k]=a2[c];
                            num[k]=d;
                            k++;
                        }
                    }
                    System.out.println("號碼:");
                    c=sc.nextInt();
                }
            }
            else if(a==3){
                System.out.println("選擇:"+"\n"+"1.蛤蠣160元"+"\n"+"2.蝦子200元"+"\n"+"3.鮭魚150元"+"\n"+"4.小卷100元"+"\n"+"5.返回");
                System.out.println("號碼:");
                c=sc.nextInt();
                while(c<5){//選擇單品迴圈
                    System.out.println("數量:");
                    d=sc.nextInt();
                    for(int t=1;t<5;t++){
                        if(t==c){
                            n[k]=s3[c];
                            dol[k]=a3[c];
                            num[k]=d;
                            k++;
                        }
                    }
                    System.out.println("號碼:");
                    c=sc.nextInt();
                }
            }
            else if(a==4){
                System.out.println("選擇:"+"\n"+"1.榴槤100元"+"\n"+"2.火龍果60元"+"\n"+"3.荔枝90元"+"\n"+"4.哈密瓜150元"+"\n"+"5.返回");
                System.out.println("號碼:");
                c=sc.nextInt();
                while(c<5){//選擇單品迴圈
                    System.out.println("數量:");
                    d=sc.nextInt();
                    for(int t=1;t<5;t++){
                        if(t==c){
                            n[k]=s4[c];
                            dol[k]=a4[c];
                            num[k]=d;
                            k++;
                        }
                    }
                    System.out.println("號碼:");
                    c=sc.nextInt();
                }
            }
            System.out.print("選擇1.蔬菜2.肉品3.海鮮4.水果5.結束:");
            a=sc.nextInt();
        }
        for(int y=0;y<k;y++){
              System.out.println(n[y]+dol[y]+"元*"+num[y]);
              total+=dol[y]*num[y];
        }
        System.out.println("總額:"+total);
    }
}