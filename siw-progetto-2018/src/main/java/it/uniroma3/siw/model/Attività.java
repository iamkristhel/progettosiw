package it.uniroma3.siw.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Attività {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	
	@Column(nullable=false, unique=true)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@Temporal(TemporalType.TIME)
	private Date orario;
	
	@ManyToMany
	private List<Allievo> listaPartecipanti;
	
	@ManyToOne
	private Centro centro;
	
	public Attività() {
	}
	
	public Attività(Long id, String nome, Date data, Date orario, List<Allievo> listaPartecipanti,
						Centro centro) {
		super();
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.orario = orario;
		this.listaPartecipanti = listaPartecipanti;
		this.centro = centro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getOrario() {
		return orario;
	}

	public void setOrario(Date orario) {
		this.orario = orario;
	}

	public List<Allievo> getListaPartecipanti() {
		return listaPartecipanti;
	}

	public void setListaPartecipanti(List<Allievo> listaPartecipanti) {
		this.listaPartecipanti = listaPartecipanti;
	}

	public Centro getCentro() {
		return centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((listaPartecipanti == null) ? 0 : listaPartecipanti.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((orario == null) ? 0 : orario.hashCode());
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
		Attività other = (Attività) obj;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (listaPartecipanti == null) {
			if (other.listaPartecipanti != null)
				return false;
		} else if (!listaPartecipanti.equals(other.listaPartecipanti))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (orario == null) {
			if (other.orario != null)
				return false;
		} else if (!orario.equals(other.orario))
			return false;
		return true;
	}
	
	
}
