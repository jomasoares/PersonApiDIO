package one.digitalinnovation.JoaoPersonApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {
    
    @GetMapping
    public String getPerson() {
        return "API test!";
    } 
}
