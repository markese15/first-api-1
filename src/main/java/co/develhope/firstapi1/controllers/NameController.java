package co.develhope.firstapi1.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping (value= "/name")
    public String getName(){
        return "mirko"; }
    @PostMapping (value= "/name")
    public StringBuilder postName(){
       StringBuilder name= new StringBuilder(new StringBuilder("mirko").reverse().toString());
       return name ;
    }

}