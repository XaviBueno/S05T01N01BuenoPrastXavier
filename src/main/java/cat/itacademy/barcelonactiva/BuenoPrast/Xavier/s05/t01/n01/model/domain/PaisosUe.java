package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t01.n01.model.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class PaisosUe {
	
	static final  ArrayList<String> paisos=new ArrayList<>(Arrays.asList(
			"Alemania",
			"Austria",
			"Bélgica",
			"Bulgaria",
			"Chipre",
			"Croacia",
			"Dinamarca",
			"España",
			"Eslovaquia",
			"Eslovenia",
			"Estonia",
			"Finlandia",
			"Francia",
			"Grecia",
			"Hungría",
			"Irlanda",
			"Italia",
			"Letonia",
			"Lituania",
			"Luxemburgo",
			"Malta",
			"Países Bajos",
			"Polonia",
			"Portugal",
			"República Checa",
			"Rumania",
			"Suecia"));
	
	public static String sucursalUe(String pais) {
		String[] ueNoue= {"UE","Altres"};;
		String resposta;
		if(paisos.contains(pais)) {
			resposta =ueNoue[0];
		}
		else {
			resposta=ueNoue[1];
		}
			
		return resposta;
		
	}
	

}
