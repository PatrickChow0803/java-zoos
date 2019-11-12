package local.patrickchow.zoo.zooassignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zoos")
public class ZooController {

    @Autowired
    ZooService zooService;

    @GetMapping(value = "/zoos")
    public ResponseEntity<?> getAll(){
        List<Zoo> list = zooService.getAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}