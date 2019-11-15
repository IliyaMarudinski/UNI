public class program_run extends program_body{
	   public void msg(){
		      System.out.println("Here is the main method");
		   }
		   public static void main(String args[]){
		      program_run obj = new program_run();
		      obj.msg();
		      obj.Program_body(null);	      
		    }
}