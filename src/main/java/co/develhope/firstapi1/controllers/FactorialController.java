package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {
    @GetMapping (value= "/fac{factorial}")
    public String factorial(@PathVariable String factorial){
        return factorial;
    }


}
