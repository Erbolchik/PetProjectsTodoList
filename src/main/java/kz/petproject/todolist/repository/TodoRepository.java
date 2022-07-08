package kz.petproject.todolist.repository;

import kz.petproject.todolist.domain.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Item, String> {
}
