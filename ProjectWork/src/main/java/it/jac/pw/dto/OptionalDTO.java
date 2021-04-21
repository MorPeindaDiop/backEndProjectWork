package it.jac.pw.dto;


import org.springframework.beans.BeanUtils;

import it.jac.pw.entity.Optional;
import lombok.Data;

@Data
public class OptionalDTO {
	
	private int id_Optional;

	private String descrizione;
	
	private int id_Modello;
	
	public static OptionalDTO build(Optional optional) {

		OptionalDTO result = new OptionalDTO();
		BeanUtils.copyProperties(optional, result);

		return result;
	}

}
