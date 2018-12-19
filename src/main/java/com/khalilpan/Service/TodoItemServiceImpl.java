package com.khalilpan.Service;

import com.khalilpan.model.TodoData;
import com.khalilpan.model.TodoItem;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    private TodoData tempTodoData = new TodoData();

    @Override
    public void addItem(TodoItem tempTodoItem) {
        tempTodoData.addItem(tempTodoItem);
    }

    @Override
    public void removeItem(int id) {
        tempTodoData.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return tempTodoData.getItem(id);
    }

    @Override
    public void updateItem(TodoItem tempTodoItem) {
        tempTodoData.updateItem(tempTodoItem);
    }

    @Override
    public TodoData getData() {
        return tempTodoData;
    }
}
