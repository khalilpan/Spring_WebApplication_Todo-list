package com.khalilpan.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {

    // fields
    private static int idValue = 1;

    private final List<TodoItem> items = new ArrayList<>();

    //constructors
    public TodoData() {

        // add some dummy data ,for use later

        addItem(new TodoItem("firstTODO","buy flower for marcia", LocalDate.now()));
        addItem(new TodoItem("secondTODO","kiss marcia", LocalDate.now()));
        addItem(new TodoItem("thirdTODO","take marcia for dinner", LocalDate.now()));
        addItem(new TodoItem("ForthTODO","say marcia TE AMO", LocalDate.now()));
    }

    //methods
    public List<TodoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    //@NonNull --> will check if the parameter was null will throw an exception
    public void addItem(@NonNull TodoItem tempTodoItem) {

        tempTodoItem.setId(idValue);
        items.add(tempTodoItem);
        idValue++;
    }

    public void removeItem(int id) {
        ListIterator<TodoItem> itemListIterator = items.listIterator();

        while (itemListIterator.hasNext()) {
            TodoItem tempTodoItem = itemListIterator.next();

            if (tempTodoItem.getId() == id) {
                itemListIterator.remove();
                break;
            }
        }
    }

    public TodoItem getItem(int id) {
        for (TodoItem item : items) {
            if (item.getId() == id) {
                return item;
            }

        }
        return null;
    }

    //@NonNull --> will check if the parameter was null will throw an exception
    public void updateItem(@NonNull TodoItem tempTodoItem) {
        ListIterator<TodoItem> itemListIterator = items.listIterator();

        while (itemListIterator.hasNext()) {
            TodoItem todoItem = itemListIterator.next();

            if (todoItem.equals(tempTodoItem)) {
                itemListIterator.set(tempTodoItem);
                break;
            }
        }
    }

}
