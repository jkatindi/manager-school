package org.katindi.sc.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table(name="session")
public class CoursSession {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date debut;
	private Date fin;
	private Long profId;
	private Long horaireId;


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cours")
    @JsonBackReference
	private Cours cours;
	
	
	public CoursSession(Date debut, Date fin, Long profId) {
		this.debut = debut;
		this.fin = fin;
		this.profId = profId;
	}
	
	public CoursSession(Date debut, Date fin, Long profId, Long horaireId) {
		this.debut = debut;
		this.fin = fin;
		this.profId = profId;
		this.horaireId = horaireId;
	}
	public CoursSession(){}
	
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDebut() {
		return debut;
	}
	public void setDebut(Date debut) {
		this.debut = debut;
	}
	public Date getFin() {
		return fin;
	}
	public void setFin(Date fin) {
		this.fin = fin;
	}
	public Long getProfId() {
		return profId;
	}
	public void setProfId(Long profId) {
		this.profId = profId;
	}
	public Long getHoraireId() {
		return horaireId;
	}
	public void setHoraireId(Long horaireId) {
		this.horaireId = horaireId;
	}

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	@Override
	public String toString() {
		return "CoursSession [id=" + id + ", debut=" + debut + ", fin=" + fin + ", profId=" + profId + ", horaireId="
				+ horaireId + "]";
	}
	
	
	
	

}
