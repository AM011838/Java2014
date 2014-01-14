import java.io.*;
import java.util.*;
public class TeamJ

{
 public static void main(String[] args)
 {
  PrintStream o=new PrintStream(System.out);
  Scanner in=new Scanner(System.in);
  int k=0;
  do{
  o.print("¿ï¾Ü:\n1)C to F\n2)F to C\n-1)Exit\n");
  o.print("(1or2or-1): ");
  
  int opt=in.nextInt();
 
  switch(opt)
  {
  case 1:
   o.printf("Input C: ");
   double c=in.nextDouble();
   o.printf("%.1f C= %.1f F\n",c,f(c));
   break;
  case 2:
   o.printf("Input F: ");
   double f=in.nextDouble();
   o.printf("%.1f F= %.1f C\n",f,c(f));
   break;
  default:
	  k=100;
   o.printf("Program Terminated.\n");
    break;
  }
  
  }while(k!=100);
  
 }
 

 public static double f(double c)
 {
  return 9.0*c/5+32;
 }
 public static double c(double f)
 {
  return 5.0*(f-32)/9;
 }
}