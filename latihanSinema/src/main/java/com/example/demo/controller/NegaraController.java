package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.NegaraModel;
import com.example.demo.service.NegaraService;


@Controller
public class NegaraController {
	
	@Autowired // depedencies injection
	private NegaraService negaraService;
	
	@RequestMapping("/negara/list")
	public String artisHome(Model model) { // model = lempar data
		
		List<NegaraModel> negaraModelList = new ArrayList<NegaraModel>();
		negaraModelList = negaraService.baca();
		model.addAttribute("negaraModelList", negaraModelList);
		
		String html = "/negara/list";
		return html;
		
	}
}
