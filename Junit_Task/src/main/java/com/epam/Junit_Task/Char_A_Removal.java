package com.epam.Junit_Task;
public class Char_A_Removal {
	public String remove_A(String string)
	{
		int stringLength=string.length();
		String result = string;
		StringBuilder sb=new StringBuilder(string);
			if(stringLength<=1 && stringLength!=0 && string.charAt(0)=='A')
			{
				result=sb.delete(0,1).toString();
			}
			else if(stringLength<=1)
			{
				result=string;
			}
			else
			{
				if(string.charAt(0)=='A' && string.charAt(1)=='A')
				{
					result= sb.delete(0,2).toString();
				}
				else if(string.charAt(0)=='A') 
				{
					result=sb.delete(0,1).toString();
				}
				else if(string.charAt(1)=='A')
				{
					result= sb.delete(1,2).toString();
				}
			}
		
		return result;
	}
}

