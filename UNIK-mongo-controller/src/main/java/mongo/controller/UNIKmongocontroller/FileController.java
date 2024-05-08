package mongo.controller.UNIKmongocontroller;

//import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//import java.util.Optional;

@RestController
@RequestMapping("/template")
public class FileController {

    @Autowired
    private FileService service;

    @GetMapping
    public ResponseEntity<List<File>> getAllfiles(){
        return new ResponseEntity<List<File>>(service.allFiles(), HttpStatus.OK);
    } //ResponseEntity is a generic, we nend to pass what kind of data is being trasnfered

    //@GetMapping("/{id}") //search file based on id
    //public ResponseEntity<Optional<File>> getSingleFile(@PathVariable ObjectId id) {
    //  return new ResponseEntity<Optional<File>>(service.singleFile(id), HttpStatus.OK);
    //}
}

// NOTES //
/*
 * in rest APIs there are multiple layers, first is the controller, task of getting a request and giving a result(get, put)
 * service class uses the repo class and talks to the database to extract the data, conection between the controller and the repo
 * repo later getting the data back
 */