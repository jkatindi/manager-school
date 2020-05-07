package org.katindi.sc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "cours")
public class Cours {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String intitule;
	private int credit;

	@OneToMany(mappedBy ="cours",cascade = CascadeType.ALL)
    @JsonManagedReference
	private List<CoursSession> nosSessions=new ArrayList<>();
	
	public Cours(String code, String intitule, int credit) {
		super();
		this.code = code;
		this.intitule = intitule;
		this.credit = credit;
	}
	public Cours() { }
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public List<CoursSession> getNosSessions() {
		return nosSessions;
	}
	public void setNosSessions(List<CoursSession> nosSessions) {
		this.nosSessions = nosSessions;
	}
	
	
	

}
