package epam.task.Junittest;

public class RemoveA {
		String remove(String input)
		{
			String result="";
			int flag=-1;
			if(input.charAt(0)=='A')
			{
				flag=0;
			}
			if(input.charAt(1)=='A')
			{
				flag=flag==0?2:1;
			}
			switch(flag)
			{
				case 0:result=input.substring(1);
				break;
				case 1:result=input.charAt(0)+input.substring(2);
				break;
				case 2:result=input.substring(2);
				break;
				default:result=input;
				
			}
			
			return result;
			
			
				
		}
}
