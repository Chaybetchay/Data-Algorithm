import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all tasks");
            System.out.println("4. Search task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String titleToAdd = scanner.nextLine();
                    list.addTask(titleToAdd);
                    break;

                case 2:
                    System.out.print("Enter task title to delete: ");
                    String titleToDelete = scanner.nextLine();
                    list.deleteTask(titleToDelete);
                    break;

                case 3:
                    list.printTasks();
                    break;

                case 4:
                    System.out.print("Enter task title to search: ");
                    String titleToSearch = scanner.nextLine();
                    if (list.contains(titleToSearch)) {
                        System.out.println("\nTask found!");
                    } else {
                        System.out.println("\nTask not found.");
                    }
                    break;

                case 5:
                    System.out.println("\nExiting program...");
                    break;

                default:
                    System.out.println("\nInvalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}