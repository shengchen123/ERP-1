package com.erp.pojo;

import java.util.Date;
import java.util.Scanner;

public class Order {
	public static final String TOP="200"; 

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date date=new Date();
		StringBuffer sb=new StringBuffer();
		/*sb.append(TOP);*/
		sb.append(date.getYear()+1900);
		sb.append(date.getMonth()+1);
		sb.append(date.getDate());
		String center=new String(sb);
		/*System.out.println("请输入");
		int num=sc.nextInt();
		if(num<10&&num>0){
			sb.append("000");
			sb.append(num);
		}else if(num<100){
			sb.append("00");
			sb.append(num);
		}else if(num<1000){
			sb.append("0");
			sb.append(num);
		}else{
			sb.append(num);
		}
		System.out.println(sb.toString());*/
		System.out.println("请再次输入一个字符串");
		System.out.println(center);
		//	String str="200201610170010";
		String str=sc.next();
		if(str.length()>=14){
			String str1=str.substring(3, 11);
			System.out.println(str1);
			if(!center.equals(str1)){
				str=200+center+"0001";
				System.out.println("1111111");
			}else{
				String str2=str.substring(0,11);
				String str3=str.substring(12,15);
				int n=Integer.valueOf(str3);
				StringBuffer bs=new StringBuffer();
				if(n+1<10){
					bs.append("000");
					bs.append(new String().valueOf(n+1));
				}else if(n+1<100){
					bs.append("00");
					bs.append(new String().valueOf(n+1));
				}else if(n+1<1000){
					bs.append("0");
					bs.append(new String().valueOf(n+1));
				}else{
					bs.append(new String().valueOf(n+1));
				}
				str=str2+bs.toString();
			}
			System.out.println(str);
		}
		
		sc.close();
	}

}
