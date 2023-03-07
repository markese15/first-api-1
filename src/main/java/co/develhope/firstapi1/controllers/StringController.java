package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    @GetMapping (value= "/strings")
    public String dueString(@RequestParam(name = "name1") String name1,@RequestParam(name="name2") String name2){
        if (name2==null){
            return name1;
        }
        else{
            return name1 +" "+ name2;
        }



    }
}
