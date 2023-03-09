package co.develhope.firstapi1.controllers;

import co.develhope.firstapi1.dto.CarsDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController

public class CarsController {

    @PostMapping("/cars")
    public ResponseEntity <?> newCar(@Valid @RequestBody CarsDto car ){


        System.out.println(car.toString());return ResponseEntity.status(HttpStatus.OK).body(car) ;
    }

   @GetMapping("/cars")
    public String getCar(){
        return "new car";
    }
}
