   public class funct {
    	
    	public static String f_name_change(String name_in) {
        	String out_str = "";
        	
        	for (char ch: name_in.toCharArray()) {
        		out_str = out_str + ch + " ";
        	}        	
        	return out_str;
        }
    	
	}