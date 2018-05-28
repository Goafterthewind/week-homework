package com.example.demo.Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SignInService {
	
      static List<String> all=new ArrayList<>();	
      Boolean Flag;
	
	   public static void main() {
		   List<String> list=new ArrayList<>();
		   list.add("老王");
		   list.add("狗强");
		   list.add("孟骚");
		   all=list;
		   
	   }

	   
   public String signIn(String name,boolean flag) {
		if(name!=null) {
		    for(int i=0;i<all.size();i++) {
		        if(name==all.get(i));
		        flag=true;
		        return name;
		 }
		    System.out.println("不存在该学生！");
		}
		
		return name;
	}
	public String query(String name) {
		if(name!=null) {
		    for(int i=0;i<all.size();i++) {
		        if(name==all.get(i)||Flag) {
		            System.out.println("已经签到");
		        }else {
		        	System.out.println("未签到");
		        }
		        return name;
		 }
		    System.out.println("不存在该学生！");
		}
		
		
		return name;
	}
  
}
