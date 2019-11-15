import java.util.Scanner;

public class program_body {
	   public void Program_body(String string) 
    {
    	int programs_num  = 1;
    	int select_progr  = 0;
    	String scaner_line= "";
    	boolean exit_pointer = false;
    	Scanner scanner = new Scanner(System.in);
    	
		System.out.print("Start of the program(OOP Java Iliya!!!!\n");		
    	while (exit_pointer != true) {
    		System.out.print("\n Izberete programa mejdu 1 i " + programs_num);
    		scaner_line = scanner.nextLine();
    		if (funct.check_int(scaner_line)) {
    			select_progr = Integer.parseInt(scaner_line);
            	if(select_progr < 1 | select_progr > programs_num) {
            		System.out.print("\n Nqma takava programa!!!!");
            	}
            	else {
            		switch(select_progr) {
            		    case 1:
            		    	funct.program_1();
            			break;
            		}
            	}
    		}
    		else {
        		if (scaner_line.equals("exit")) {
        			exit_pointer = true;
        			System.out.print("Exit programming");
        		} else {
        			System.out.print("\n Nevalidno vyvedeno chislo!!!!");      			
        		}
    		}
        }	
    scanner.close(); 
    }             
}