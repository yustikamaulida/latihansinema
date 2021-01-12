package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ARTIS")

public class ArtisModel {

	@Id
	@Column (name= "KD_ARTIS")
	private String kodeArtis;
	
	@Column (name= "NM_ARTIS")
	private String namaArtis;
	
	@Column (name= "JK")
	private String jkArtis;
	
	@Column (name= "BAYARAN")
	private long bayaranArtis;
	
	@Column (name= "AWARD")
	private int awardArtis;
	
	@Column (name= "NEGARA")
	private String negaraArtis;

	public String getKodeArtis() {
		return kodeArtis;
	}

	public void setKodeArtis(String kodeArtis) {
		this.kodeArtis = kodeArtis;
	}

	public String getNamaArtis() {
		return namaArtis;
	}

	public void setNamaArtis(String namaArtis) {
		this.namaArtis = namaArtis;
	}

	public String getJkArtis() {
		return jkArtis;
	}

	public void setJkArtis(String jkArtis) {
		this.jkArtis = jkArtis;
	}

	public long getBayaranArtis() {
		return bayaranArtis;
	}

	public void setBayaranArtis(long bayaranArtis) {
		this.bayaranArtis = bayaranArtis;
	}

	public int getAwardArtis() {
		return awardArtis;
	}

	public void setAwardArtis(int awardArtis) {
		this.awardArtis = awardArtis;
	}

	public String getNegaraArtis() {
		return negaraArtis;
	}

	public void setNegaraArtis(String negaraArtis) {
		this.negaraArtis = negaraArtis;
	}
	
}
