package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.ui.ModelMap;

public class SucursalDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private int pk_SucursalID;
	private String nomSucursal;
	private String paisSucursal;
	private String tipusSucursal;
	
	
	
	
	
	
	
	public SucursalDTO() {
	}





	public SucursalDTO(int pk_SucursalID, String nomSucursal, String paisSucursal, String tipusSucursal) {
		
		this.pk_SucursalID = pk_SucursalID;
		this.nomSucursal = nomSucursal;
		this.paisSucursal = paisSucursal;
		this.tipusSucursal = tipusSucursal;
	}
	
	
	


	public int getPk_SucursalID() {
		return pk_SucursalID;
	}
	public String getNomSucursal() {
		return nomSucursal;
	}
	public String getPaisSucursal() {
		return paisSucursal;
	}
	public String getTipusSucursal() {
		return tipusSucursal;
	}
	public void setPk_SucursalID(int pk_SucursalID) {
		this.pk_SucursalID = pk_SucursalID;
	}
	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}
	public void setPaisSucursal(String paisSucursal) {
		this.paisSucursal = paisSucursal;
	}
	public void setTipusSucursal(String tipusSucursal) {
		this.tipusSucursal = tipusSucursal;
	}
	
	  
	  
	  
	  
	  
	
	

}
