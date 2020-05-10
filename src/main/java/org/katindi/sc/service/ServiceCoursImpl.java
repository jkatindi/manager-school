package org.katindi.sc.service;

import java.util.List;
import java.util.Set;

import org.katindi.sc.model.Cours;
import org.katindi.sc.repositories.CoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServiceCoursImpl implements ServiceCours {
    @Autowired
	private CoursRepository repository;
	@Override
	public Cours ajouterCours(Cours cours) {
		// TODO Auto-generated method stub
		return repository.save(cours);
	}

	@Override
	public List<Cours> getAllCours() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cours coursParId(Long id) {
		// TODO Auto-generated method stub
		return repository.getCoursById(id);
	}

	@Override
	public void mettreAjour(Cours c) {
		// TODO Auto-generated method stub
        repository.updateCours(c.getId(),c.getCode(),c.getIntitule(),c.getCredit());
	}

	@Override
	public void supprimerCours(Long id) {
		// TODO Auto-generated method stub
        repository.delete(repository.getCoursById(id));
	}

}
