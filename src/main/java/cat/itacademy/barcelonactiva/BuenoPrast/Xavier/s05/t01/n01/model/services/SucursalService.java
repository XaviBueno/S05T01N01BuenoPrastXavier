package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.dto.SucursalDTO;

public interface SucursalService {
	SucursalDTO sucursalToDto(Sucursal sucursal);
	
	Sucursal sucursalFromDto(SucursalDTO sucursalDTO);
	
	Sucursal addSucursal(SucursalDTO sucursal);
	
	List<SucursalDTO> getAllSucursals();
	
	Sucursal getOneSucursal(int id);
	
	Sucursal saveSucursal(SucursalDTO sucursal);

	
	boolean deleteSucursal(int id);

}
