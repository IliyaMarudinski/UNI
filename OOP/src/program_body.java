import java.util.Scanner;

public class program_body {
	   public void Program_body(String[] args) 
    { 
    	int names_count = 0;
    	boolean check_name = false;
    	Scanner scanner = new Scanner(System.in);
		System.out.print("Start of the program(OOP Java Iliya!!!!\n");
    	while (check_name != true) {
    		System.out.print("Vyvedete broi imena (mejdu 3 i 7): ");
    		names_count = scanner.nextInt();
    		scanner.nextLine();
        	if(names_count < 3 | names_count > 7) {
        		System.out.print("Nevaliden broi imena!!!! \n");
        	}
        	else {
        		check_name = true;
        	}
        }
    	String Names[] = new String[names_count];
    	for(int i = 0; i < names_count; i++) {
        	System.out.print("Enter name " + (i+1) + ": ");
    		Names[i] = scanner.nextLine();
    	}
    	
    	for(int i = 0; i < names_count; i++) {
        	System.out.print("Name "+ (i+1) + ":  " + funct.f_name_change(Names[i]) + "\n");
    	}
    	scanner.close();  	
    }             
}