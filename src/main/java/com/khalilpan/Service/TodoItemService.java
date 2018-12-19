package com.khalilpan.Service;

import com.khalilpan.model.TodoData;
import com.khalilpan.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem tempTodoItem);

    void removeItem(int id);

    TodoItem getItem(int id);

    void updateItem(TodoItem tempTodoItem);

    TodoData getData();

}
