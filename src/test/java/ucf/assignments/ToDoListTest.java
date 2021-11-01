package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void addItem() {
        /*
            ToDoList list = new ToDoList()
            Item newItem = new Item("homework", "COP3330", "Nov 1", 0)
            list.addItem(newItem)

            assertEquals(newItem, list.itemList[0])
         */
    }

    @Test
    void removeItem() {
        /*
            create new list
            add 2 items
            removeItem(item1)
            check to see item list only contain item2
         */
    }

    @Test
    void editItemDescription() {
        /*
            create new list
            add item
            editItemDescription(item)
            check to see if item's description change
         */
    }

    @Test
    void editItemDueDate() {
        /*
            create new list
            add item
            editItemDueDate(item)
            check to see if item's due date change
         */
    }

    @Test
    void markComplete() {
        /*
            create new list
            add item
            markComplete(item)
            check to see if item's status change
         */
    }

    @Test
    void displayAllItem() {
        /*
            create new list
            add 2 items
            displayAllItem()
            check to see if item's information is fully displayed + in input order
         */
    }

    @Test
    void displayIncompleteItem() {
        /*
            create new list
            add 3 items
            markComplete(item2)
            displayIncompleteItem()
            check to see if the number of incomplete items + complete items = nItem
         */
    }

    @Test
    void displayCompleteItem() {
        /*
            create new list
            add 3 items
            markComplete(item2)
            displayIncompleteItem()
            check to see if the number of incomplete items + complete items = nItem
         */
    }
}