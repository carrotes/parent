package com.itcuc.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
		 public static void main(String[] args) {
		        
	}
		 
		 
		 /**
		     * 验证邮箱
		     * @param email
		     * @return
		     */
		    public static boolean isEmail(String email){
		        boolean flag = false;
		        try{
		                String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		                Pattern regex = Pattern.compile(check);
		                Matcher matcher = regex.matcher(email);
		                flag = matcher.matches();
		            }catch(Exception e){
		                flag = false;
		            }
		        return flag;
		    }
		     
 /*
  * 验证电话
  * 
 * @param mobiles
 * @return
  */
		    public static boolean isMobileNumber(String mobileNumber){
		        boolean flag = false;
		        try{
		                Pattern regex = Pattern.compile("^(((13[0-9])|(15([0-3]|[5-9]))|(18[0-9]))\\d{8})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{7})$");
		                Matcher matcher = regex.matcher(mobileNumber);
		                flag = matcher.matches();
		            }catch(Exception e){
		                flag = false;
		            }
		        return flag;
		    }
		    
		    
 /** 
 * 验证字符串是否为数字
 * 
 */  
		  public static boolean isNumer(String str) {  
		        Pattern pattern = Pattern.compile("[0-9]*");  
		        Matcher isNum = pattern.matcher(str);  
		        if (isNum.matches()) {  
		            return true;  
		        } else {  
		            return false;  
		        }  
		    }  
		  
/*
 *  * 验证字符串是否为空
*/
		
		  public static boolean isNULL(String str){
	         
	         if (str.trim().isEmpty()|str==null)
	         {
	            return true;
	         }
	        else 
	        {
	           return false;
	        }
	   }
/*
 * 验证URLַ
 * 
 * */		  
		  public static boolean isURL(String URL){
		        boolean flag = false;
		        try{
		                Pattern regex = Pattern.compile( "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?");
		                Matcher matcher = regex.matcher(URL);
		                flag = matcher.matches();
		            }catch(Exception e){
		                flag = false;
		            }
		        return flag;
		    } 
	
		  
/*
 * 验证身份证
 * 
 */
		  public static boolean isIDNumber(String IDNumber){
		        boolean flag = false;
		        try{
		                Pattern regex = Pattern.compile("(^\\d{18}$)|(^\\d{15}$)");
		                Matcher matcher = regex.matcher(IDNumber);
		                flag = matcher.matches();
		            }catch(Exception e){
		                flag = false;
		            }
		        return flag;
		    }		  

/*
 * s数字转换为字符串
 */
		  public static String NumberToString(int Number){
			  String s=null;
		        try{
		               s=Integer.toString(Number);
		            }catch(Exception e){
		               return null;
		            }
		        return s;
		    }		  
		  
/*
 * 字符串转换为整数
 */
		  public static int StringToNumber(String str){
			  int Number=0;
		        try{
		               Number=Integer.parseInt(str);
		            }catch(Exception e){
		               return 0;
		            }
		        return Number;
		    }	
		  
		
		  
		 
}
