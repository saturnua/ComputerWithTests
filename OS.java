package myPack;
import java.util.Scanner;

public class OS {

	static void startOS() throws Exception{
			
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		System.out.println(" If you Want start OS please enter 1, if not - 2 ");
		
		switch (sc.nextInt()) {
            case 1:
                System.out.println("-- OS started");
                workWithCalculatorAndFileManager();
                break;
            case 2:
                System.out.println("-- OS not started");
				WorkingComputer.turnOn();
                break;
            default: 
                System.out.println("You choise is wrong, please enter 1 or 2");
				startOS();
                break;
        }
	}	
	
	static void workWithCalculatorAndFileManager() throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		System.out.println(" If you Want lunch Calculator please enter 1, if - FileManager - 2 ");
		
		switch (sc.nextInt()) {
        case 1:
            CalculatorWithSwitch.main(null);
            break;
        case 2:
            FileManager.copyFileText();
            break;
        default: 
            System.out.println("You choise is wrong, please enter 1 or 2");
			startOS();
            break;
		}
	}
}
