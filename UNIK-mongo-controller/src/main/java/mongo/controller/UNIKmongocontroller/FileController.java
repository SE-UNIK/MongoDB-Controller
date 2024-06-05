package mongo.controller.UNIKmongocontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongofiles")
public class FileController {

    @Autowired
    private FileService service;

    @GetMapping
    public ResponseEntity<List<File>> getAllfiles(){
        return new ResponseEntity<List<File>>(service.allFiles(), HttpStatus.OK);
    } //ResponseEntity is a generic, we nend to pass what kind of data is being trasnfered

    @PostMapping("/add")
    public ResponseEntity<File> addnewFile(@RequestBody File file){
        File newFile = service.addFile(file);
        return new ResponseEntity<>(newFile, HttpStatus.CREATED);
    }

}

// NOTES //
/*
 * in rest APIs there are multiple layers, first is the controller, task of getting a request and giving a result(get, put)
 * service class uses the repo class and talks to the database to extract the data, conection between the controller and the repo
 * repo later getting the data back
 */