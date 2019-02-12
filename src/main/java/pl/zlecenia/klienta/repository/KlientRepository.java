package pl.zlecenia.klienta.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.zlecenia.klienta.entity.Klient;

@Repository
public interface KlientRepository extends CrudRepository<Klient, Integer> {
	List <Klient> findByNazwisko(String nazwisko);
	void deleteById(long id);
	Optional<Klient> findById(long id);
}
