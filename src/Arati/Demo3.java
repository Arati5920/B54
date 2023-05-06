/**
 * 
 */
package Arati;
import java.util.Scanner;

/**
 * @author Arati Kumbar
 *
 */
public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a number between 1-4");
    int num=scan.nextInt();
        switch(num) {
        case 1:
        	System.out.println("enter the number 1");
        	break;
        case 2:
        	System.out.println("enter the number 2");
        	break;
        case 3:
        	System.out.println("enter the number 3");
        	break;
        case 4:
        	System.out.println("enter the number 4");
        	break;
        default:
        	System.out.println("Read the message properly");
        	
        }
    
    	
    }

}
