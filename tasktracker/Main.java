package tasktracker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TaskManager user = new TaskManager();
		while(true) {
			System.out.println("Welcome to Task Tracker\r\n" + "1. Add Task\r\n" + "2. View Tasks\r\n"
					+ "3. Update Task\r\n" + "4. Delete Task\r\n" + "5. Exit");
			System.out.print("Enter your choice : ");
			Scanner s = new Scanner(System.in);
			int choice = s.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter the description of the task : ");
				s.nextLine();
				String description = s.nextLine();
				user.addTask(description);

				break;
			case 2:
				System.out.println(user.list());;
				break;
			case 3:
				System.out.print("Enter the taskId you want to update : ");
				int taskId = s.nextInt();
				System.out.print("Enter the description of the task : ");
				s.nextLine();
				description = s.nextLine();
				user.updateTask(taskId, description);

				break;
			case 4:
				System.out.print("Enter the taskId want to delete : ");
				taskId = s.nextInt();
				user.deleteTask(taskId);
				break;
			
			case 5 : System.out.println("Thanks and Bye!!");
					return;
			default : System.out.println("Invalid Input");
			}
			
		}
	}
}
