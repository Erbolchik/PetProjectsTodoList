package kz.petproject.todolist.service;

import kz.petproject.todolist.domain.Item;
import kz.petproject.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements ITodoService{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public void saveItem(Item item) {
        todoRepository.insert(item);
    }

}
