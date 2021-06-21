package one.digitalinnovation.JoaoPersonApi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.JoaoPersonApi.dto.request.PersonDTO;
import one.digitalinnovation.JoaoPersonApi.dto.response.MessageResponseDTO;
import one.digitalinnovation.JoaoPersonApi.services.PersonService;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping
    public String getPerson() {
        return "API test!";
    } 

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody  @Valid PersonDTO personDTO){
        // System.out.println("olaaaaaaaaaaa MUNDOOOOOOO!");
        return personService.create(personDTO);
    }
}
