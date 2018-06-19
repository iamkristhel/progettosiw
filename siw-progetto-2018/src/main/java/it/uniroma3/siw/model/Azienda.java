package it.uniroma3.siw.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="azienda")
public class Azienda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@OneToMany
	@JoinColumn(name="azienda_id")
	private List<Centro> listaCentri;
	
	@OneToMany
	@JoinColumn(name="azienda_id")
	private List<Allievo> listaAllievi;
	
	@OneToMany
	@JoinColumn(name="azienda_id")
	private List<Responsabile> listaResponsabili;
	
	public Azienda() {
	}
	
	public Azienda(Long id, String nome, List<Centro> listaCentri, List<Allievo> listaAllievi,
			List<Responsabile> listaResponsabili) {
		super();
		this.id = id;
		this.nome = nome;
		this.listaCentri = listaCentri;
		this.listaAllievi = listaAllievi;
		this.listaResponsabili = listaResponsabili;
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

	public List<Centro> getListaCentri() {
		return listaCentri;
	}

	public void setListaCentri(List<Centro> listaCentri) {
		this.listaCentri = listaCentri;
	}

	public List<Allievo> getListaAllievi() {
		return listaAllievi;
	}

	public void setListaAllievi(List<Allievo> listaAllievi) {
		this.listaAllievi = listaAllievi;
	}

	public List<Responsabile> getListaResponsabili() {
		return listaResponsabili;
	}

	public void setListaResponsabili(List<Responsabile> listaResponsabili) {
		this.listaResponsabili = listaResponsabili;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((listaAllievi == null) ? 0 : listaAllievi.hashCode());
		result = prime * result + ((listaCentri == null) ? 0 : listaCentri.hashCode());
		result = prime * result + ((listaResponsabili == null) ? 0 : listaResponsabili.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Azienda other = (Azienda) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (listaAllievi == null) {
			if (other.listaAllievi != null) {
				return false;
			}
		} else if (!listaAllievi.equals(other.listaAllievi)) {
			return false;
		}
		if (listaCentri == null) {
			if (other.listaCentri != null) {
				return false;
			}
		} else if (!listaCentri.equals(other.listaCentri)) {
			return false;
		}
		if (listaResponsabili == null) {
			if (other.listaResponsabili != null) {
				return false;
			}
		} else if (!listaResponsabili.equals(other.listaResponsabili)) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		return true;
	}
	
	
}
