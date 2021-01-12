package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.NegaraModel;
import com.example.demo.repository.NegaraRepository;

@Service
@Transactional
public class NegaraService {

	@Autowired
	private NegaraRepository negaraRepository;
	
	public List<NegaraModel> baca() {
		// TODO Auto-generated method stub
		return negaraRepository.findAll();
	}
}
