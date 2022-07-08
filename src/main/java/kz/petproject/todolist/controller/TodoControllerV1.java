package kz.petproject.todolist.controller;

import kz.petproject.todolist.domain.Item;
import kz.petproject.todolist.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/todo/v1")
public class TodoControllerV1 {

    @Autowired
    private ITodoService todoService;

    @GetMapping
    public void getAll(){

    }

    @GetMapping("/{id}")
    public void get(@RequestParam String id) {

    }

    @PostMapping
    public void save(@RequestBody Item item){
        todoService.saveItem(item);
    }

    @PutMapping
    public void update(){

    }

    @DeleteMapping
    public void delete(){

    }


}
