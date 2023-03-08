package co.develhope.firstapi1.controllers;

import co.develhope.firstapi1.dto.CarsDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController

public class CarsController {
    CarsDto car;
    @PostMapping("/cars")
    public String newCar(@RequestParam String modelName,@RequestParam String id ,@RequestParam double price){
        car=new CarsDto(modelName,id,price);

        System.out.println(car.toString());return "created to object";
    }

    @GetMapping("/cars")
    public CarsDto getCar(){
        return car;
    }
}
