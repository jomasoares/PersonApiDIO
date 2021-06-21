package one.digitalinnovation.JoaoPersonApi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.JoaoPersonApi.dto.mappers.PersonMapper;
import one.digitalinnovation.JoaoPersonApi.dto.request.PersonDTO;
import one.digitalinnovation.JoaoPersonApi.dto.response.MessageResponseDTO;
import one.digitalinnovation.JoaoPersonApi.entities.Person;
import one.digitalinnovation.JoaoPersonApi.exceptions.NotFoundException;
import one.digitalinnovation.JoaoPersonApi.repositories.PersonRepository;

@Service
public class PersonService {
    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public MessageResponseDTO create(PersonDTO personDTO) {
        Person person = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(person);
        return createMessageResponse("Person successfully created with ID ", savedPerson.getId());
    }

    public List<PersonDTO> listAll() {
        List<Person> people = personRepository.findAll();
        return people.stream()
            .map(personMapper::toDTO)
            .collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws NotFoundException {
        Person person = verifyIfExists(id);

        return personMapper.toDTO(person);
    }

    public void deleteById(Long id) throws NotFoundException {
        verifyIfExists(id);

        personRepository.deleteById(id);
        
    }

    public MessageResponseDTO update(Long id, PersonDTO personDTO) throws NotFoundException {
        verifyIfExists(id);

        Person updatedPerson = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(updatedPerson);

        return createMessageResponse("Person successfully updated with ID ", savedPerson.getId());
    }

    private Person verifyIfExists(Long id) throws NotFoundException {
        return personRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Person", id));
    }

    private MessageResponseDTO createMessageResponse(String s, Long id) {
        return MessageResponseDTO.builder()
                .message(s + id)
                .build();
    }
}
