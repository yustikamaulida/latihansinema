package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.ArtisModel;

public interface ArtisRepository extends JpaRepository<ArtisModel, String> {

	@Query("SELECT A FROM ArtisModel A where A.namaArtis = ?1")
	ArtisModel cariKataKunci(String namaArtis);


    @Query("SELECT A FROM ArtisModel A WHERE A.kodeArtis = ?1")
    ArtisModel noPasien(String artisID);
	
	/*
	 * @Query("SELECT A.namaArtis, A.jkArtis, A.bayaranArtis, A.awardArtis, N.namaNegara FROM ArtisModel A RIGHT JOIN negaraModel N ON A.negaraArtis = N.kodeNegara"
	 * ) List<ArtisModel> joinBelajar();
	 */
	
}
