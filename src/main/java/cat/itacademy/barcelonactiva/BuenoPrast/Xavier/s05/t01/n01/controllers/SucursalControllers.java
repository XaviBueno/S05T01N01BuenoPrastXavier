package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.dto.SucursalDTO;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.services.SucursalServices;
import jakarta.persistence.Id;

@Controller

public class SucursalControllers {
	
	@Autowired
	private SucursalServices sucursalServices;
	
	
 
	
	@GetMapping("/sucursals/getAll")
	
	public String getAll(Model model) {
		List<SucursalDTO> sucursals=new ArrayList<SucursalDTO>();
		sucursals= sucursalServices.getAllSucursals();
		model.addAttribute("sucursals", sucursals);
		return "getAll";
	}

	@GetMapping("/sucursals/add")
	public String inputSucursal(Model model){
		SucursalDTO sucursal=new SucursalDTO(); 
		model.addAttribute("sucursal", sucursal);
		return "addSucursal";
		
	}
	
	@PostMapping("/sucursals/add")
	
	public String registraSucursal( SucursalDTO sucursal) {
		
		sucursalServices.saveSucursal(sucursal);
		return "redirect:/sucursals/add";
	}

	@GetMapping("/sucursals/delete/{id}")
	public String deleteSucursal(Model model,@PathVariable("id") int id){
		String resp="La sucursal no existeix o hi ha succeït un error ";
		String redirect="";
		if(sucursalServices.deleteSucursal(id)) {
		 resp="Sucursal eliminada";
		}
		model.addAttribute("resp", resp);
		model.addAttribute("redirect", redirect);
		return "result";
	}
	
	
	
	
	@GetMapping("/sucursals/getOne/{id}")
	
	public String getOne(Model model, @PathVariable("id") int id) {
		SucursalDTO sucursalDTO=new SucursalDTO();
		Sucursal sucursal=new Sucursal();
		sucursal=sucursalServices.getOneSucursal(id);
		if(sucursal!=null) {
			sucursalDTO=sucursalServices.sucursalToDto(sucursal);
			
		}	
		
		
		model.addAttribute("sucursal", sucursalDTO);
		return "getOne";
		
		}
	
	
		

		
	@GetMapping("/sucursals/update")
	public String inputID(Model model){
		Integer idSucursal=0;
		model.addAttribute("idSucursal",  idSucursal);
		return "inputID";
		
	}
	
	@PostMapping("/sucursals/update")
	
	public String update(Integer idSucursal, Model model) {
		String form="result";
		SucursalDTO sucursalDto=new SucursalDTO();
		Sucursal sucursal= new Sucursal();
		sucursal= sucursalServices.getOneSucursal(idSucursal);
		if(sucursal !=null) {
			sucursalDto= sucursalServices.sucursalToDto(sucursal);
			model.addAttribute("sucursalDto", sucursalDto);
			form="update";
		}
		else {
			String resp="Sucursal no existeix";
			String redirect="/sucursals/update";
			model.addAttribute("resp", resp);
			model.addAttribute("redirect", redirect);
		}
			
		return form;
		
	}
	@PostMapping("/sucursals/update/save")
	
	public String updateSave(SucursalDTO sucursalDto,Model model) {
		
		String resp="Sucursal modificada";
		String redirect="/sucursals/update";
		sucursalServices.saveSucursal(sucursalDto);
		model.addAttribute("resp", resp);
		model.addAttribute("redirect", redirect);
		return "result";
	}

	
	 class ForceErrorJspController {
		 
	    @GetMapping("/sucursals/exception")
	    public void throwException() {
	        throw new IllegalArgumentException("\"I am the error message from JSP Controller\"");
	    }
	 
	}
}

