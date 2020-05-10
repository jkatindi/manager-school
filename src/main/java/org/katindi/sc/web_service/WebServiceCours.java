package org.katindi.sc.web_service;

import java.util.List;

import org.katindi.sc.model.Cours;
import org.katindi.sc.service.ServiceCours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/cours")
public class WebServiceCours {
	@Autowired
	private ServiceCours service;
	
	@GetMapping(value="/getAllCours")
	public List<Cours> coursDispo()
	{
	   return service.getAllCours();	
	}
	
	@GetMapping(value="/getAllCours/{id}")
	public Cours recherchParId(@PathVariable Long id)
	{
		return service.coursParId(id);
	}
	
	@PostMapping(value="/addNewCours")
	public Cours nouveauCours(@RequestBody Cours cours)
	{
		return service.ajouterCours(cours);
	}
	
	@DeleteMapping(value="/supp/{id}")
	public void removeCours(@PathVariable("id") Long id)
	{
		service.supprimerCours(id);
	}

	@PutMapping(value="/update/{id}")
	public void misAjourCours(@RequestBody Cours c,@PathVariable Long id)
	{   c.setId(id);
		service.mettreAjour(c);
	}
}
