package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.repository.SucursalRepository;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.domain.PaisosUe;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.dto.SucursalDTO;

@Service
public class SucursalServicesClass {
	
	@Autowired
	private SucursalRepository sucursalRepository;
	
	public SucursalDTO sucursalToDto(Sucursal sucursal) {
		
		SucursalDTO sucursalDTO=new SucursalDTO();
		
		sucursalDTO.setNomSucursal(sucursal.getNomSucursal());
		sucursalDTO.setPaisSucursal(sucursal.getPaisSucursal());
		sucursalDTO.setPk_SucursalID(sucursal.getPk_SucursalID());
		sucursalDTO.setTipusSucursal(PaisosUe.sucursalUe(sucursalDTO.getPaisSucursal()));
		
		return sucursalDTO;
		 
	}
	
public Sucursal sucursalFromDto(SucursalDTO sucursalDTO) {
		
		Sucursal sucursal=new Sucursal();
		
		sucursal.setNomSucursal(sucursalDTO.getNomSucursal());
		sucursal.setPaisSucursal(sucursalDTO.getPaisSucursal());
		sucursal.setPk_SucursalID(sucursalDTO.getPk_SucursalID());
		
		
		return sucursal;
		 
	}

public Sucursal addSucursal(SucursalDTO sucursal) {
	
		return sucursalRepository.save(sucursalFromDto(sucursal));
}
	
	public List<SucursalDTO> getAllSucursals(){
		
		
		List<SucursalDTO> sucursalsDto=new ArrayList<SucursalDTO>();
		List<Sucursal> sucursals= new ArrayList<Sucursal>() ;
		sucursals=sucursalRepository.findAll();
		Iterator<Sucursal> iterator = sucursals.iterator();
		while(iterator.hasNext()) {
			sucursalsDto.add(sucursalToDto(iterator.next()));
				
		}
		return sucursalsDto;
		
		
	}
	
	public boolean deleteSucursal(int id) {
		boolean resp=false;
		if (getOneSucursal( id) !=null) {
			 sucursalRepository.deleteById(id);
			 resp=true;
		}
		return resp;
			
		
		
	} 
	
	public Sucursal getOneSucursal(int id) {
		
		return  sucursalRepository.findById(id).orElse(null);
	}
	
	
	

}
