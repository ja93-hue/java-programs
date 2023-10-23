package myprogram;
import java.util.Scanner;
public class choco {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("what is your name: ");
        String name = read.nextLine();
        System.out.println("how old are you");
        int age = read.nextInt();
        read.nextLine();
        System.out.println("what is your favourite food");
        String food = read.nextLine();
        
        System.out.println("hello "+name);
        System.out.println("you are "+age+" years old");
        System.out.println("you like "+food);
        
        
	}

}
