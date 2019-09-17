package com.tavisca.TodoWebApp.Controller;

import com.tavisca.TodoWebApp.dao.TodoRepo;
import com.tavisca.TodoWebApp.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TodoController {

    @Autowired
    TodoRepo todoRepo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    /*@RequestMapping("/addTodo")
    public String addTodo(Todo todo){
        todoRepo.save(todo);
        return "home.jsp";
    }*/

    @GetMapping("/todos")
    public List<Todo> getAllTodos(){
        return todoRepo.findAll();
    }

    @GetMapping(path = "/todos/{todoId}")
    public Optional<Todo> getTodoById(@PathVariable("todoId") int todoId){
        return todoRepo.findById(todoId);
    }

    @PostMapping(path = "/todos")
    public Todo addTodo(@RequestBody Todo todo){
        todoRepo.save(todo);
        return todo;
    }

    @DeleteMapping(path = "/todos/{todoId}")
    public List<Todo> deleteTodo(@PathVariable("todoId") int todoId){
        todoRepo.deleteById(todoId);
        List<Todo> todoList = todoRepo.findAll();
        return todoList;
    }

    @PutMapping(path = "/todos")
    public Todo addOrUpdateTodo(@RequestBody Todo todo){
        todoRepo.save(todo);
        return todo;
    }
}
