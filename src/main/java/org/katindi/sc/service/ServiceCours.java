package org.katindi.sc.service;

import java.util.List;

import org.katindi.sc.model.Cours;

public interface ServiceCours {
	Cours ajouterCours(Cours cours);
	List<Cours> getAllCours();
	Cours coursParId(Long id);
	void mettreAjour(Cours c,Long id);
	void supprimerCours(Long id);
	

}
