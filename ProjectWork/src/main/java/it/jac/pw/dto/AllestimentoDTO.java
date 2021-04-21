package it.jac.pw.dto;


import org.springframework.beans.BeanUtils;

import it.jac.pw.entity.Allestimento;
import lombok.Data;

@Data
public class AllestimentoDTO {
	
	private int id_Allestimento;
	
	private String descrizione;

	private int id_Modello;
	
	public static AllestimentoDTO build(Allestimento allestimento) {

		AllestimentoDTO result = new AllestimentoDTO();
		BeanUtils.copyProperties(allestimento, result);

		return result;
	}
}
