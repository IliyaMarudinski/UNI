import java.util.Scanner;

public class funct {
    	
    	public static String f_name_change(String name_in) {
        	String out_str = "";
        	
        	for (char ch: name_in.toCharArray()) {
        		out_str = out_str + ch + " ";
        	}        	
        	return out_str;
        }
    	
    	public static boolean check_int(String str) {
        	if(str.matches("^-?\\d+$")) {
        		return true;
        	}
        	else {
        		return false;
        	}
        	
            
        }
    	
    	public static void program_1() {
        	int names_count = 0;
        	boolean check_name = false;
        	Scanner sc = new Scanner(System.in);
        	String scaner_line= "";
    		System.out.print("Start of the program(OOP Java Iliya!!!!\n");
        	while (check_name != true) {
        		System.out.print("Vyvedete broi imena (mejdu 3 i 7): ");
        		scaner_line= sc.nextLine();
        		if (funct.check_int(scaner_line)) {
        			names_count = Integer.parseInt(scaner_line);
                	if(names_count < 3 | names_count > 7) {
                		System.out.print("Nevaliden broi imena!!!! \n");
                	}
                	else {
                		check_name = true;
                	}
        		}
        		else {
        			System.out.print("Nevalidno vyvedeno chislo!!!! \n");
        		}
            }
        	String Names[] = new String[names_count];
        	for(int i = 0; i < names_count; i++) {
            	System.out.print("Enter name " + (i+1) + ": ");
        		Names[i] = sc.nextLine();
        	}
        	
        	for(int i = 0; i < names_count; i++) {
            	System.out.print("\n Name  Ilia"+ (i+1) + ":  " + funct.f_name_change(Names[i]));
        	}
        	//sc.close();  	
    	}
    	
    	public static void program_2() {

        	System.out.print("\n Vtora programa \n");
 
    	}
    	
	}