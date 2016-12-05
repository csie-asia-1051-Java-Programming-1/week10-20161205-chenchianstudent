package ex;
import java.util.Scanner;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021007 陳麒安
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入度數");
float x=scn.nextFloat();
summer(x);
nosummer(x);
	}
public static void summer(float x){
if(x<=120){
	System.out.println((float)x*2.10);
	}else{
if(x<=330&&x>=121){
	System.out.println((float)252+((x-120)*3.02));
}else{
if(x>=331&&x<=500){
	System.out.println((float)252+634+(x-330)*4.39);
}else{
if(x>=501&&x<=700){
	System.out.println((float)252+634+746+(x-500)*4.97);
}else{
if(x>=701){
	System.out.println((float)252+634+746+994+(x-700)*5.63);
}	
}	
}	
}		
	}	
	
}
public static void nosummer(float x){
	if(x<=120){
		System.out.println((float)x*2.10);
		}else{
	if(x<=330&&x>=121){
		System.out.println((float)252+((x-120)*2.68));
	}else{
	if(x>=331&&x<=500){
		System.out.println((float)252+562+(x-330)*3.61);
	}else{
	if(x>=501&&x<=700){
		System.out.println((float)252+562+613+(x-500)*4.01);
	}else{
	if(x>=701){
		System.out.println((float)252+562+613+900+(x-700)*4.50);
	}	
	}	
	}	
	}		
		}}	
}
