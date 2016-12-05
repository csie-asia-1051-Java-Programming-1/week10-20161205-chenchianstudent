package hw;
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入4個數");
int n1=scn.nextInt();
int n2=scn.nextInt();
int n3=scn.nextInt();
int n4=scn.nextInt();
if((n1==n2&&n1==n3&&n1==n4)||(n2==n1&&n2==n3&&n2==n4)||(n3==n2&&n3==n1&&n3==n4)||(n4==n2&&n4==n3&&n4==n1)){
System.out.print("通殺");	
}else{
if((n1==n2&&n1==n3)||(n1==n2&&n1==n4)||(n1==n3&&n1==n4)){
System.out.print(n1*2);	
}else{
if((n2==n1&&n2==n3)||(n2==n1&&n2==n4)||(n2==n3&&n2==n4)){
System.out.print(n2*2);	
}else{
if((n3==n1&&n3==n2)||(n3==n1&&n3==n4)||(n3==n2&&n3==n4)){
System.out.print(n3*2);	
}else{
if((n4==n1&&n4==n2)||(n4==n1&&n4==n3)||(n4==n2&&n4==n3)){
System.out.print(n4*2);	
}else{
if((n1==n2)||(n1==n3)||(n1==n4)){
System.out.print(n1*2);
}else{
if((n2==n1)||(n2==n3)||(n2==n4)){
System.out.print(n2*2);	
}else{
if((n3==n1)||(n3==n2)||(n3==n4)){
System.out.print(n3*2);	
}else{
if((n4==n1)||(n4==n2)||(n4==n3)){
System.out.print(n4*2);	
}else{
System.out.print("R");	
}	
}	
}	
}	
}	
}	
}	
}	
}
	}	
}
	




