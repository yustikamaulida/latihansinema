package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ArtisModel;
import com.example.demo.repository.ArtisRepository;

@Service
@Transactional
public class ArtisService {
	
	@Autowired
	private ArtisRepository artisRepository;

	public List<ArtisModel> baca() {
		// TODO Auto-generated method stub
		return artisRepository.findAll();
	}

	public void saveArtis(ArtisModel artisModel) {
		// TODO Auto-generated method stub
		artisRepository.save(artisModel);
	}

	public ArtisModel cariKataKunci(String namaArtis) {
		// TODO Auto-generated method stub
		return this.artisRepository.cariKataKunci(namaArtis);
	}

	public void update(ArtisModel artisModel) {
		// TODO Auto-generated method stub
		artisRepository.save(artisModel);
	}

	public ArtisModel readById(String artisID) {
		// TODO Auto-generated method stub
		return artisRepository.noPasien(artisID);
	}

	public void delete(String artisID) {
		// TODO Auto-generated method stub
		artisRepository.deleteById(artisID);
	}
	
	

}
