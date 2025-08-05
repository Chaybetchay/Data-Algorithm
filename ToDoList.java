public class ToDoList {
    private TaskNode head;

    public void addTask(String title) {
        TaskNode newNode = new TaskNode(title);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("\nTask added!");
    }

    
    public void deleteTask(String title) {
        if (head == null) {
            System.out.println("\nTask list is empty.");
            return;
        }

        if (head.title.equals(title)) {
            head = head.next;
            System.out.println("\nTask deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null && !current.next.title.equals(title)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("\nTask not found.");
        } else {
            current.next = current.next.next;
            System.out.println("\nTask deleted.");
        }
    }

    public void printTasks() {
        if (head == null) {
            System.out.println("\nYour task list is empty.");
            return;
        }

        System.out.println("\nYour Tasks:");
        TaskNode current = head;
        while (current != null) {
            System.out.println("- " + current.title);
            current = current.next;
        }
    }

    public boolean contains(String title) {
        TaskNode current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

  
    public int countTasks() {
        int count = 0;
        TaskNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}