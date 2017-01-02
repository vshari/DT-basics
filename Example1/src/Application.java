import java.util.*;
public class Application {
	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);

        System.out.println("choose what to start: ");
        String text = input.nextLine();

        switch (text) {
        case "laptop":
            System.out.println("laptop started!");
            break;

        case "mobile":
            System.out.println("mobile started!");
            break;

        default:
            System.out.println("Error ");
        }
        
	}
}
