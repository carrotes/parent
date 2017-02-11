package com.itcuc.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
		 public static void main(String[] args) {
		        
	}
		 
		 //��һ��  ����һ��  ����һ��  ��
		 /**
		     * ��֤����
		     * @param email
		     * @return
		     */
		    public static boolean checkEmail(String email){
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
		     
 /* ��֤�ֻ�����
 * @param mobiles
 * @return
  */
		    public static boolean checkMobileNumber(String mobileNumber){
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
 * ���ܣ��ж��ַ����Ƿ�Ϊ����
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
 *  * �ж��ַ��Ƿ�Ϊ��
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
 * ��֤URL��ַ
 * 
 * */		  
		  public static boolean checkURL(String URL){
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
 * ��֤���֤����
 * 
 */
		  public static boolean checkIDNumber(String IDNumber){
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
 * ����ת��Ϊ�ַ���
 */
//		  public static String NumberToString(Number Number){
//			  String s=null;
//		        try{
//		               s=Integer.toString(Number);
//		            }catch(Exception e){
//		               return null;
//		            }
//		        return s;
//		    }		  
		  
/*
 * �ַ���ת��Ϊ����
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
		  
		  /*
		   * �ַ���ת��Ϊ������
		   */
		  
		  /*
		   * �ַ���ת��Ϊdouble
		   */
		  
		 
}
