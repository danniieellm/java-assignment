import java.util.Scanner;

class Student{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);

		//prompt user for their units marks
		System.out.print("Enter  java programming marks:");
		int javaprogramingmarks = scanner.nextInt();
		System.out.print("Enter  application programing marks:");
		int applicationprogramingmarks = scanner.nextInt();
		System.out.print("Enter  network design marks");
		int networkdesignmarks= scanner.nextInt();
		System.out.print("Enter   structured cabling marks");
		int  structuredcablingmarks = scanner.nextInt();
		System.out.print("Enter  control system marks");
		int controlsystemmarks = scanner.nextInt();

		double average = ( javaprogramingmarks + applicationprogramingmarks +  networkdesignmarks + structuredcablingmarks + controlsystemmarks) / 5;

        System.out.printf("The average marks is: %.2f%n", average);

        



	}
}