package mongo.controller.UNIKmongocontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.Optional;

//Database access methods, add, gett all, delete...
@Service
public class FileService {

    @Autowired //inicializar variables
    private FileRepository repository;

    public List<File> allFiles(){
        return repository.findAll(); //described inside the mongo repo class
    }

    // public Optional<File> singleFile(ObjectId id){
    // return repository.findById(id);
    // }
}