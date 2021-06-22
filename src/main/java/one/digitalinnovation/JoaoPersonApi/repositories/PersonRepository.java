package one.digitalinnovation.JoaoPersonApi.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.JoaoPersonApi.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
    public List<Person> findByFirstNameContainingIgnoreCase(String firstName);

    public List<Person> findByLastNameContainingIgnoreCase(String lastName);

    public List<Person> findByCpf(String cpf);

    public List<Person> findByBirthDate(LocalDate birthDate);

    public List<Person> findByBirthDateLessThan(LocalDate date);

    public List<Person> findByBirthDateGreaterThan(LocalDate date);
}
