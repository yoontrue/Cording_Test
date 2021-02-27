package com.yoontrue.kim;


public class New_Id_Recommended {
	 
	  
	  public static void main(String[] args) {
		  String new_id = "...!@BaT#*..y.abcdefghijklm";
		  String answer = "";
		  answer = new_id.toLowerCase();
		  String exclude_str = "~!@#$%^&*()=+[{]}:?,<>/";
		  
		  for(int i=0;i<answer.length();i++){
			  for(int j=9;j<exclude_str.length();j++){
//	                if(answer[i].equals(exclude_str[j])){
//	                    answer.replaceAll(exclude_str[j],"");
//	                }
			  }
		  }
		  
		  System.out.println(answer);
		  
	}
}
