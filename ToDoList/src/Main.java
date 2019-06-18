import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static TodoFunction todoList = new TodoFunction();

    public static void main(String args[]){
        int command =0;
        boolean exit = false;
        printCommand();
        while(!exit){
            System.out.println("Enter your command/choice: ");
            command = in.nextInt();
            in.nextLine();
            switch(command){
                case 0: printCommand();
                    break;
                case 1: todoList.print();
                    break;
                case 2: addItem();
                    break;
                case 3: updateItem();
                    break;
                case 4: removeItem();
                    break;
                case 5: searchItem();
                    break;
                case 6: exit=true;
                    break;
                    default:
                        System.out.println("Please pick only one from given command.");
            }
        }
    }
    public static void printCommand(){
        System.out.println("\nCommand:" +
                "\n Press 0: To Print Instruction"+
                "\n Press 1: To Print All the List"+
                "\n Press 2: To add list in ToDo"+
                "\n Press 3: To modify item in ToDo"+
                "\n Press 4: To remove item from ToDo"+
                "\n Press 5: To search An item from ToDo"+
                "\n Press 6: To exit the app");
    }

    public static void addItem(){
        System.out.println("Enter item to add in todo list: ");
        todoList.addItem(in.nextLine());
    }
    public static void removeItem(){
        System.out.println("Enter item number to be deleted: ");
        int index =in.nextInt();
        in.nextLine();
        todoList.removeItem(index-1);
    }
    public static void updateItem(){
        System.out.println("Enter the item number: ");
        int index =in.nextInt();
        in.nextLine();
        System.out.println("Enter new item to added: ");
        String myNewItem= in.nextLine();
        todoList.todoUpdate(index-1,myNewItem);
    }
    public static void searchItem(){
        System.out.println("Enter string to be searched: ");
        String searchItem =in.nextLine();
        if(todoList.findItem(searchItem)==null)
        System.out.println("Item not found");
        else
        System.out.println(searchItem+" was found in your list");

    }
}
