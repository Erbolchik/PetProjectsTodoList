package kz.petproject.todolist.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "todo")
public class Item {

    @Id
    private Long id;

    @Indexed
    private String title;

    @Field("customDescription")
    private String description;

}
