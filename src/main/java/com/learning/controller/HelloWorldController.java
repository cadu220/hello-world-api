package com.learning.controller;

import com.learning.dto.CountryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/country")
public class HelloWorldController {

    private List<CountryDTO> countries = new ArrayList<>();
    //CREATE
    @PostMapping
    public CountryDTO salvar(@RequestBody final CountryDTO countryDTO){
        countries.add(countryDTO);
        return countryDTO;
    }

    //READ
    @GetMapping
    public List<CountryDTO> getAll(){
//        var country = new CountryDTO(1, "Alemanha", 222_222_22L);
//        countries.clear();
//        countries.add(country);
        return countries;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryDTO> load(@PathVariable final long id){
        for (var country: countries){
            if(country.getId() ==id){
                return ResponseEntity.ok(country);
            }
        }
        return ResponseEntity.notFound().build();
    }
    //UPDATE

    //DELETE


    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
