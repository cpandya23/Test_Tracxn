
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message= "12345.123.1";
		  if(message.matches("[0-9.]*")){
	           String m[]= message.split("[.]",message.length());
	           for(int i=0;i<m.length-1;i++){
	        	   System.out.println(m[i].length());
	             if( (m[i].length()==m[i+1].length()) || 
	              (m[i].length()==m[i+1].length()+2))
	             {
	            	 if(!(m[i].substring(0,1).equals("0"))) {
	            		 
	            	 }
	            	 else {
	            		 System.out.println("no");
	            	 }
	                  
	              }
	            else{
	              System.out.println("no");
	               }
	           }
	           
	     }
	     else{
	    	 System.out.println("no");
	     }
	}

}
