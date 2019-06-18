import java.util.ArrayList;

public class TodoFunction {
    private ArrayList<String> todoList = new ArrayList<>();

    // Add item
    public void addItem(String item){
        todoList.add(item);
    }

    //remove item
    public void removeItem(int index){
        todoList.remove(index);
    }

    //printing list
    public void print(){
        System.out.println("TODO List consist of "+todoList.size()+" items");
        for(int i =0;i<todoList.size();i++){
            System.out.println("Item at position "+(i+1)+" is "+todoList.get(i));
        }
    }

    //update item
    public void todoUpdate(int index,String list){
        todoList.set(index,list);
        System.out.println("Updation complete at position"+ (index+1));
    }

    //search for item
    public String findItem(String searchItem){
        int index =todoList.indexOf(searchItem);
        if(index==-1)
            return null;
        else
            return todoList.get(index);
    }
}
