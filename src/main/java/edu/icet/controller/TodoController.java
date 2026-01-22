package edu.icet.controller;

import edu.icet.dto.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Todo")
public class TodoController {

    private final RestTemplate restTemplate;

    @GetMapping("/get-todo/{id}")
    public Todo getTodo(@PathVariable Integer id){
        String url="https://jsonplaceholder.typicode.com/todos/"+id;
        Todo forObject=restTemplate.getForObject(url, Todo.class);
        return forObject;
    }

    @GetMapping("/get-todos")
    public Todo[] getTodos(){
        String url="https://jsonplaceholder.typicode.com/todos";
        Todo[] forObject=restTemplate.getForObject(url, Todo[].class);
        return forObject;
    }
}
