package one.digitalinnovation.JoaoPersonApi.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import one.digitalinnovation.JoaoPersonApi.dto.request.PersonDTO;
import one.digitalinnovation.JoaoPersonApi.dto.response.MessageResponseDTO;
import one.digitalinnovation.JoaoPersonApi.exceptions.NotFoundException;
import one.digitalinnovation.JoaoPersonApi.services.PersonService;

@RestController
@RequestMapping("api/v1/person")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private PersonService personService;
    
    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.listAll();
    } 

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody  @Valid PersonDTO personDTO){
        return personService.create(personDTO);
    }

    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable Long id) throws NotFoundException {
        return personService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws NotFoundException {
        personService.deleteById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws NotFoundException {
        return personService.update(id, personDTO);
    }

    @GetMapping("/firstName/{name}")
    public List<PersonDTO> findByFirstName(@PathVariable String name) {
        return personService.findByFirstName(name);
    }

    @GetMapping("/cpf/{cpf}")
    public List<PersonDTO> findByCpf(@PathVariable String cpf) {
        return personService.findByCpf(cpf);
    }

    @GetMapping("/birthDate/before/{dateString}")
    public List<PersonDTO> findByBirthDateBefore(@PathVariable String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        formatter = formatter.withLocale( Locale.getDefault() );
        LocalDate date = LocalDate.parse(dateString, formatter);

        return personService.findByBirthDateBefore(date);
    }

    @GetMapping("/birthDate/after/{dateString}")
    public List<PersonDTO> findByBirthDateAfter(@PathVariable String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        formatter = formatter.withLocale( Locale.getDefault() );
        LocalDate date = LocalDate.parse(dateString, formatter);

        return personService.findByBirthDateAfter(date);
    }

    @GetMapping("/birthDate/{dateString}")
    public List<PersonDTO> findByBirthDate(@PathVariable String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        formatter = formatter.withLocale( Locale.getDefault() );
        LocalDate date = LocalDate.parse(dateString, formatter);

        return personService.findByBirthDate(date);
    }
}
