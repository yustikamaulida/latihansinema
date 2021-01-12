package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ArtisService;
import com.example.demo.model.ArtisModel;

@Controller
public class ArtisController {
	
	@Autowired // depedencies injection
	private ArtisService artisService;
	
	@RequestMapping("/artis/list")
	public String artisHome(Model model) { // model = lempar data
		
		List<ArtisModel> artisModelList = new ArrayList<ArtisModel>();
		artisModelList = artisService.baca();
		model.addAttribute("artisModelList", artisModelList);
		
		String html = "/artis/list";
		return html;
		
	}
	
	@RequestMapping("artis/add")
	public String addArtis() {
		String html = "/artis/add";
		return html;		
	}
	
	@RequestMapping(value = "hasil_insert")
	public String create(HttpServletRequest request, Model model) {
		
		String kodeArtis = request.getParameter("kodeArtis");
		String namaArtis = request.getParameter("namaArtis");
		String jkArtis = request.getParameter("jkArtis");
		long bayaranArtis = Long.valueOf(request.getParameter("bayaranArtis"));
		int awardArtis = Integer.valueOf(request.getParameter("awardArtis"));
		String negaraArtis = request.getParameter("negaraArtis");
		
		ArtisModel artisModel = new ArtisModel();
		artisModel.setKodeArtis(kodeArtis);
		artisModel.setNamaArtis(namaArtis);
		artisModel.setJkArtis(jkArtis);
		artisModel.setBayaranArtis(bayaranArtis);
		artisModel.setAwardArtis(awardArtis);
		artisModel.setNegaraArtis(negaraArtis);
		
		artisService.saveArtis(artisModel); //moethod dari service
		
		model.addAttribute("artisModel", artisModel);
	
		String html = "/artis/hasil_insert";
		
		return html;
		
	}
	
	@RequestMapping("/artis/detail")
	public String detailArtis(HttpServletRequest request, Model model) {
		String namaArtis = request.getParameter("keyword");
		ArtisModel artisModel = new ArtisModel();
		artisModel = this.artisService.cariKataKunci(namaArtis);
		
		model.addAttribute("artisModel", artisModel);
		
		String html = "/artis/detail";
		
		return html;
	
	}
	
	@RequestMapping("/artis/update")
	public String update(HttpServletRequest request, Model model) {
		
		String artisID = request.getParameter("artisID");
		
		ArtisModel artisModel = new ArtisModel();
		artisModel = artisService.readById(artisID);
		model.addAttribute("artisModel", artisModel);
		
		String html = "/artis/edit";
		return html;
		
	}

	@RequestMapping("/artis/edit")
	public String edit(HttpServletRequest request, Model model) {
		String kodeArtis = request.getParameter("kodeArtis");
		String namaArtis = request.getParameter("namaArtis");
		String jkArtis = request.getParameter("jkArtis");
		long bayaranArtis = Long.valueOf(request.getParameter("bayaranArtis"));
		int awardArtis = Integer.valueOf(request.getParameter("awardArtis"));
		String negaraArtis = request.getParameter("negaraArtis");
		
		ArtisModel artisModel = new ArtisModel();
		artisModel.setKodeArtis(kodeArtis);
		artisModel.setNamaArtis(namaArtis);
		artisModel.setJkArtis(jkArtis);
		artisModel.setBayaranArtis(bayaranArtis);
		artisModel.setAwardArtis(awardArtis);
		artisModel.setNegaraArtis(negaraArtis);
		
		// start update
		artisService.update(artisModel);
		
		model.addAttribute("artisModel", artisModel);
		
		this.artisHome(model);
		
		String html = "/artis/list";
		return html;	
	}
	
	@RequestMapping("/artis/delete")
	public String deleteProduct(HttpServletRequest request, Model model) {
		String artisID = request.getParameter("artisID");
		this.artisService.delete(artisID);
		this.artisHome(model);
		
		String html = "/artis/list";
		return html;
	}
	
	
	
}
