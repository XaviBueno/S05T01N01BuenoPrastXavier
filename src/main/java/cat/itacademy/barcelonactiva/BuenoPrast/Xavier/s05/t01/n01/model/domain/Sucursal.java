package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.domain;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sucursals")
public class Sucursal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="sucursal_id")
	private int pk_SucursalID;
	
	@Column(name = "sucursal")
	private String nomSucursal;
	
	 
	@Column(name = "pais")
	private String paisSucursal;


	public Sucursal() {
		
	}


	public Sucursal(int pk_SucursalID, String nomSucursal, String paisSucursal) {
		super();
		this.pk_SucursalID = pk_SucursalID;
		this.nomSucursal = nomSucursal;
		this.paisSucursal = paisSucursal;
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


	public void setPk_SucursalID(int pk_SucursalID) {
		this.pk_SucursalID = pk_SucursalID;
	}


	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}


	public void setPaisSucursal(String paisSucursal) {
		this.paisSucursal = paisSucursal;
	}

	
	
}
