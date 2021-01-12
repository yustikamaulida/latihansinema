package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NEGARA")

public class NegaraModel {

	@Id
	@Column (name= "KD_NEGARA")
	private String kodeNegara;
	
	@Column (name= "NM_NEGARA")
	private String namaNegara;

	public String getKodeNegara() {
		return kodeNegara;
	}

	public void setKodeNegara(String kodeNegara) {
		this.kodeNegara = kodeNegara;
	}

	public String getNamaNegara() {
		return namaNegara;
	}

	public void setNamaNegara(String namaNegara) {
		this.namaNegara = namaNegara;
	}
		
	
}
