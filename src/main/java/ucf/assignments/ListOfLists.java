package ucf.assignments;

import java.util.ArrayList;

public class ListOfLists {

    private ArrayList<ToDoList> listOfLists;
    private int nList;

    public ListOfLists() {
        this.listOfLists = new ArrayList<>();
        this.nList = 0;
    }

    public ToDoList addList()
    {
        ToDoList newList = new ToDoList();
        listOfLists.add(newList);
        ++nList;

        return newList;
    }

    private int findList(String name)
    {
        /*  given name of a list, find its index

            for i = 0:listOfLists.size()
                if (listOfLists[i] == name)
                    return i
         */

        return -1;
    }

    public int removeList(String name)
    {
        /*
            int ind = findList(name) // find index of list to be removed
            listOfLists.remove(ind)
            --nList

            return findList(name) // check if item is still in list (return -1 if not found)
         */

        return -1;
    }

    public String editListTitle(String name, String newTitle)
    {
        /*
            int ind = findList(name) // find index of list to be edited
            listOfLists[ind].setTitle = newTitle

            return listOfLists[ind].getTitle // check if list's title is updated
         */

        return "";
    }

    public Item addListItem(String name)
    {
        /*
            int ind = findList(name)
            return listOfLists[ind].addItem()
         */
        return null;
    }

    public int removeListItem(String listName, String itemName)
    {
        /*
            int ind = findList(name)
            return listOfLists[ind].removeItem(itemName)
         */

        return -1;
    }

    public String editListItemDescription(String listName, String itemName, String newDescription)
    {
        /*
            int ind = findList(name)
            return listOfLists[ind].editItemDescription(itemName, newDescription)
         */

        return "";
    }

    public String editListItemDueDate(String listName, String itemName, String newDueDate)
    {
        /*
            int ind = findList(name)
            return listOfLists[ind].editItemDueDate(itemName, newDueDate)
         */

        return "";
    }

    public int markListItemComplete(String listName, String itemName)
    {
        /*
            int ind = findList(name)
            return listOfLists[ind].markItemComplete(itemName)
         */

        return 0;
    }

    public int displayListAllItem(String listName)
    {
        /*
            int ind = findList(name)
            return listOfLists[ind].displayAllItem();
         */

        return 0;
    }

    public int displayListIncompleteItem(String listName)
    {
        /*
            int ind = findList(name)
            return listOfLists[ind].displayIncompleteItem();
         */

        return 0;
    }

    public int displayListCompleteItem(String listName)
    {
        /*
            int ind = findList(name)
            return listOfLists[ind].displayCompleteItem();
         */

        return 0;
    }

    public String listSaveList()
    {
        /*
            int ind = findList(name)
            return listOfLists[ind].saveList();
         */
        return "";
    }

    public String saveAllLists()
    {
        /*
            Scanner input = new Scanner(System.in)
            String path = input.nextLine()
            String name = input.next()

            try
            {
                FileWriter output = new FileWriter(path + name)
                for i = 0:listOfLists.size()

                    ToDoList list = listOfLists[i]

                    for j = 0:list.itemList.size()
                        output.write(itemList[j].item.getName + itemList[j].item.getDescription + itemList[j].item.getDueDate + itemList[j].item.Status)
                return "Successfully saved"
            } catch (Exception e)
            {
                return "Fail to create output file"
            }
         */
        return "";
    }

    public String listLoadSingleList()
    {
        /*
            Scanner input = new Scanner(System.in)
            String path = input.nextLine()
            ToDoList newList = new ToDoList()

            try
            {
                newList = parseFile(path)
                listOfLists.add(newList)
                return "Successfully load list"
            } catch (Exception e)
            {
                return "Failed to load input file"
            }
         */
        return "";
    }

    public String listLoadMultipleLists()
    {
        /*
            Scanner input = new Scanner(System.in)
            String path = input.nextLine()
            ToDoList newList = new ToDoList()

            while (path.hasNextLine())
            {
                try
                {
                    newList = parseFile(path)
                    listOfLists.add(newList)
                } catch (Exception e)
                {
                    return "Failed to load input file completely"
                }
            }
            return "Successfully loaded input file"
         */
        return "";
    }
}