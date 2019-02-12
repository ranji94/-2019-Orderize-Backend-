package pl.zlecenia.klienta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pl.zlecenia.klienta.entity.Klient;
import pl.zlecenia.klienta.services.KlientService;

@RestController
public class KlientController {
	private KlientService klientService;

	@Autowired
	public KlientController(KlientService klientService) {
		this.klientService = klientService;
	}
	
	@CrossOrigin
	@PostMapping("/client/add")
	public Klient dodajKlienta(@RequestBody Klient nowyKlient)
	{	
		return this.klientService.dodajKlienta(nowyKlient);
	}
	
	@CrossOrigin
	@GetMapping("/client/get")
	public Iterable<Klient> pobierzKlientow()
	{
		return klientService.pobierzWszystkich();
	}
	
	@CrossOrigin
	@GetMapping("/client/get/{id}")
	public Klient pobierzKlientow(@PathVariable long id)
	{
		return klientService.pobierzKlienta(id);
	}
	
	@CrossOrigin
	@Transactional
	@DeleteMapping("/client/delete/{id}")
	public void usunKlienta(@PathVariable long id)
	{
		klientService.usunKlienta(id);
	}
}
