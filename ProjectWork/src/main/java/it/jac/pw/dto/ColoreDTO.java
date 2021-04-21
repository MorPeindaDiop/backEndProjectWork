package it.jac.pw.dto;

import org.springframework.beans.BeanUtils;

import it.jac.pw.entity.Colore;
import lombok.Data;

@Data
public class ColoreDTO {
	
	private int id_Colore;
	
	private String descrizione;
	
	private int id_Modello;
	
	public static ColoreDTO build(Colore colore) {

		ColoreDTO result = new ColoreDTO();
		BeanUtils.copyProperties(colore, result);

		return result;
	}

}
