public class CharTest
{
	public static void main(String[] args){
	
	 String s="ew45re67g7hj8r4";
	 char[] c= s.toCharArray();
	
	
	 for(char ch:c){

      System.out.print(ch+"\t");
	 }
	 System.out.println();
	 //String[] str=new String[c.length];

	 char[] result=new char[c.length];

	 for(int i=0;i<c.length;i++){
	   
		  //str[i]= String.valueOf(c[i]);
		  if('1'<=c[i] && c[i]<='9'){
		      result[i]=c[i];
		  }
		 
	 }

	 //去除null
	String string= new String(result);
    String ns=string.trim();
	System.out.println("中间含有空格：("+ns+")");
     
    String reg=" +";

	String[] nsArr=ns.split(reg);
	System.out.println(nsArr.length);
	for(String outS:nsArr){
	   System.out.println(outS);
	}

	/*
    System.out.println(trimAllSpace(string));

	 System.out.println();
	 for(char st:result){

      System.out.print(st+"\t");
	 }
    
	}
	public static String trimAllSpace(String str){
	   String temp="";
	   for(int i=0;i<str.length();i++){
	      if(str.charAt(i)!=" ")
			  temp+=str[i].toString();
	   }
	   return temp;
	   */
	}
    
		
}