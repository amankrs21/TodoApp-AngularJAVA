package com.example.crud.crud.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.example.crud.crud.models.TodoModel;
import com.example.crud.crud.services.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<TodoModel> getTodos() {
        return todoService.getTodos();
    }

    @GetMapping("/todos/{id}")
    public TodoModel getTodo(@PathVariable int id) {
        return todoService.getTodoById(id);
    }

    @PostMapping("/todos")
    public TodoModel addTodo(@RequestBody TodoModel todo) {
        return todoService.addTodo(todo);
    }

    @PutMapping("todos")
    public boolean updateTodo(@RequestBody TodoModel todo) {
        return todoService.updateTodo(todo);
    }
    
    @DeleteMapping("todos/{id}")
    public boolean deleteTodo(@PathVariable int id) {
        return todoService.deleteTodo(id);
    }
}
