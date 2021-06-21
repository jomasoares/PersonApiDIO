package one.digitalinnovation.JoaoPersonApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.JoaoPersonApi.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
