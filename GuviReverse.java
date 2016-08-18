
public class GuviReverse {
	public static void main(String[] args) {
		String s1="WeLCome To GuVi";
        
		String[] split=s1.split(" ");
		String rev=" ";
		for(int i=0;i<split.length;i++)
		{
			
			
			{
				StringBuffer sb=new StringBuffer(split[i]);
				rev=rev+" "+ sb.reverse();
				
			}
			
		}
		System.out.println(rev);
	}

	

}
