package pl.zlecenia.klienta.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.zlecenia.klienta.entity.Klient;
import pl.zlecenia.klienta.repository.KlientRepository;

@Service
public class KlientService {
	private KlientRepository klientRepository;

	@Autowired
	public KlientService(KlientRepository klientRepository) {
		this.klientRepository = klientRepository;
	}
	
	public Klient dodajKlienta(Klient nowyKlient) {
		return klientRepository.save(nowyKlient);
	}
	
	public Iterable<Klient> pobierzWszystkich()
	{
		return klientRepository.findAll();
	}
	
	public void usunKlienta(long id)
	{
		klientRepository.deleteById(id);
	}
	
	public Klient pobierzKlienta(long id)
	{
		try {
		Optional<Klient> klient = klientRepository.findById(id);
		return klient.get();
		} catch (NoSuchElementException e)
		{
			System.out.println("Nie znaleziono elementu!"+e);
		}
		return null;
	}
}
