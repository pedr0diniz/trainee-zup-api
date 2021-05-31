package com.zup.trainee.model;

import java.util.Date;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Vacina {
	
	@Id //chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincremento
	private Long id;
	
	private String nomeVacina;
	
	private String emailUsuario;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date dataVacina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public Date getDataVacina() {
		return dataVacina;
	}

	public void setDataVacina(Date dataVacina) {
		this.dataVacina = dataVacina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vacina other = (Vacina) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
