
public class BalanceOrNot {
	
	
	
	static int[] balancedOrNot(String[] expressions, int[] MaxReplacments)
	{
		int less=0;
		int gre=0;
		int[] result=new int[expressions.length];
		for(int i=0;i<expressions.length;i++)
		{
			String s=expressions[i];
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='<')
				{
					less++;
				} else if(s.charAt(i)=='>'){
					gre++;
				} else {
					break;
				}
			}
			if(less==gre)
			{
				result[i]=0;
			} else if(less>=gre)
			{
				int less_result=less-gre;
				if(MaxReplacments[i]>=less_result)
				{
					result[i]=0;
				} else {
					result[i]=1;
				}
				
			} else {
				int gre_result=gre-less;
				if(MaxReplacments[i]>=gre_result)
				{
					result[i]=0;
				} else {
					result[i]=1;
				}
			}
			
		}
		for(int i=0;i<result.length;i++)
		{
		System.out.println(result[i]);
		}
		return result;
		
		
	}
	
	
	  public static void main(String[] args) {
		
		String[] expression= new String[Integer.parseInt(args[0])];
		int[] maxReplacement= new int[5];
		int k=0;
		int j=0;
		if(args!=null)
		{
			
			for(int i=1;i<=Integer.parseInt(args[0]);i++)
			{
				expression[k]=args[i];
				k++;
			}
			
			for(int i=Integer.parseInt(args[0])+2;i<=args.length-1;i++)
			{
				maxReplacement[j]=Integer.parseInt(args[i]);
				j++;
			}
			
		}
		
		BalanceOrNot.balancedOrNot(expression, maxReplacement);

	}

}
