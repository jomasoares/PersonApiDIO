package one.digitalinnovation.JoaoPersonApi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.JoaoPersonApi.dto.mappers.PersonMapper;
import one.digitalinnovation.JoaoPersonApi.dto.request.PersonDTO;
import one.digitalinnovation.JoaoPersonApi.dto.response.MessageResponseDTO;
import one.digitalinnovation.JoaoPersonApi.entities.Person;
import one.digitalinnovation.JoaoPersonApi.repositories.PersonRepository;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public MessageResponseDTO create(PersonDTO personDTO) {
        Person person = PersonMapper.INSTANCE.toModel(personDTO);
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
        .builder()
        .message("created person with ID " + savedPerson.getId())
        .build();
    }
}
