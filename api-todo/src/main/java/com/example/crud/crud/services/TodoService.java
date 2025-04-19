package com.example.crud.crud.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crud.crud.models.TodoModel;

@Service
public class TodoService {

    List<TodoModel> todos = new ArrayList<>(Arrays.asList(
            new TodoModel(1, "Create a new todo", "Create a new todo", false),
            new TodoModel(2, "Update an existing todo", "Update an existing todo", false),
            new TodoModel(3, "Delete an existing todo", "Delete an existing todo", false)));

    public List<TodoModel> getTodos() {
        return todos;
    }

    public TodoModel getTodoById(int id) {
        return todos.stream().filter(t -> t.getId() == id).findFirst()
                .orElse(new TodoModel(0, "No Data", "Sorry no data found", false));
    }

    public TodoModel addTodo(TodoModel todo) {
        todos.add(todo);
        return todo;
    }

    public boolean updateTodo(TodoModel todo) {
        for (int i = 0; i < todos.size(); i++) {
            TodoModel t = todos.get(i);
            if (t.getId() == todo.getId()) {
                todos.set(i, todo);
                return true;
            }
        }
        return false;
    }

    public boolean deleteTodo(int id) {
        for (int i=0; i<todos.size(); i++) {
            if (todos.get(i).getId() == id) {
                todos.remove(i);
                return true;
            }
        }
        return false;
    }

}
