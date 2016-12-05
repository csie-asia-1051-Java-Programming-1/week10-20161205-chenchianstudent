package hw;
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入有幾位學生");
int n=scn.nextInt();
int i=1;
while(i<=n){
	System.out.println();	
System.out.print("請輸入聽力成績");
int l=scn.nextInt();
System.out.print("請輸入閱讀成績");	
int r=scn.nextInt();
System.out.print("請輸入口說成績");	
int s=scn.nextInt();
int sum=l+r+s;
if(l>=60&&s>=60&&r>=60){
System.out.print(l+" "+r+" "+s+" "+" P");	
}else{
if((sum>=220&&l<60)||(sum>=220&&r<60)||(sum>=220&&s<60)){
System.out.print(l+" "+r+" "+s+" "+" P");	
}else{
if((sum<220&&l>=60&&r>=60)||(sum<220&&r>=60&&s>=60)||(sum<220&&s>=60&&l>=60)){
System.out.print(l+" "+r+" "+s+" "+" M");	
}else{
if((l>=80&&r<60&&s<60)||(r>=80&&l<60&&s<60)||(s>=80&&l<60&&r<60)){
System.out.print(l+" "+r+" "+s+" "+" M");	
}else{
System.out.print(l+" "+r+" "+s+" "+" F");	
}	
}	
}	
}
i++;	
}	

	
	}

}
