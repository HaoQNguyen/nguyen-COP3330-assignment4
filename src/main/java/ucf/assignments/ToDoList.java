package ucf.assignments;

import java.util.ArrayList;

public class ToDoList {

    private String title;
    private int nItem;
    private ArrayList<Item> itemList;

    public ToDoList() {
        this.title = "";
        this.nItem = 0;
        this.itemList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getnItem() {
        return nItem;
    }

    public void setnItem(int nItem) {
        this.nItem = nItem;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    private int findItem(String name)
    {
        /*  given name of an item, find its index

            for i = 0:itemList.size()
                if (itemList[i] == name)
                    return i
         */

        return -1;
    }

    public Item addItem()
    {
        Item newItem = new Item();
        itemList.add(newItem);
        ++nItem;

        return newItem;
    }

    public int removeItem(String name)
    {
        /*
            int ind = findItem(name) // find index of item to be removed
            itemList.remove(ind)
            --nItem

            return findItem(name) // check if item is still in list (return -1 if not found)
         */

        return -1;
    }

    public String editItemDescription(String name, String newDescription)
    {
        /*
            int ind = findItem(name) // find index of item to be edited
            itemList[ind].setDescription = newDescription

            return itemList[ind].getDescription // check if item's description is updated
         */

        return "";
    }

    public String editItemDueDate(String name, String newDueDate)
    {
        /*
            int ind = findItem(name) // find index of item to be edited
            itemList[ind].setDueDate = newDueDate

            return itemList[ind].getDueDate // check if item's due date is updated
         */

        return "";
    }

    public int markComplete(String name)
    {
        /*
            int ind = findItem(name)
            itemList[ind].setStatus = 1

            return itemList[ind] // check if item's status is updated
         */

        return 0;
    }

    public int displayAllItem()
    {
        /*
            for i = 0:itemList.size()
                Item item = itemList[i]
                print(item.getName + item.getDescription + item.getDueDate + item.Status)
         */

        return itemList.size();
    }

    public int displayIncompleteItem()
    {
        /*
            int nIncomplete = 0
            int nComplete = 0

            for i = 0:itemList.size()
                if (itemList[i].getStatus == 0)
                    print(item.getName + item.getDescription + item.getDueDate + item.Status)
                    ++nIncomplete
                else
                    ++nComplete

            return nIncomplete + nComplete
         */

        return 0;
    }

    public int displayCompleteItem()
    {
        /*
            int nIncomplete = 0
            int nComplete = 0

            for i = 0:itemList.size()
                if (itemList[i].getStatus == 1)
                    print(item.getName + item.getDescription + item.getDueDate + item.Status)
                    ++nComplete
                else
                    ++nIncomplete

            return nIncomplete + nComplete
         */

        return 0;
    }
}