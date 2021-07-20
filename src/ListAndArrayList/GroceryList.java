package ListAndArrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public void printList(){
        for(int i =0; i<groceryList.size(); i++){
            System.out.println(groceryList.get(i));
        }
    }

    public void replaceItem(int pos, String item){
        groceryList.set(pos,item);

    }

    public void removeItem(int pos){
        groceryList.remove(pos);
    }
    public String findItem(String item){
//        boolean ex = groceryList.contains(item);
        int position = groceryList.indexOf(item);
        if(position>=0){
            return groceryList.get(position);
        }
        return null;
    }

}
