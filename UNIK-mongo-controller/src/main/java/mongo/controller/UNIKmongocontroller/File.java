package mongo.controller.UNIKmongocontroller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "pdfdetails") //nombre de la colecion en mongodb
@Data //getters y los setters
@AllArgsConstructor //creates a constructor and takes all the private variables as arguments
@NoArgsConstructor

public class File {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genre;
    private List<String> backdrops;
}
