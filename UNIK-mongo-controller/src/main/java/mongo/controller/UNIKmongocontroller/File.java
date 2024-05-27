package mongo.controller.UNIKmongocontroller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "files") //nombre de la colecion en mongodb
@Data //getters y los setters
@AllArgsConstructor //creates a constructor and takes all the private variables as arguments
@NoArgsConstructor

public class File {
    @Id
    private ObjectId id;
    private String title;
    private String publishDate;
    private String content;
}
