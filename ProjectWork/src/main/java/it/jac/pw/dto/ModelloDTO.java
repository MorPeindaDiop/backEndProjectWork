package it.jac.pw.dto;

import org.springframework.beans.BeanUtils;

import it.jac.pw.entity.Modello;
import lombok.Data;

@Data
public class ModelloDTO {
	
	private int id_Modello;

	private String modello;
	
	private int id_Marca;
	
	private String src;
	
	
	public static ModelloDTO build(Modello modello) {

		ModelloDTO result = new ModelloDTO();
		BeanUtils.copyProperties(modello, result);

		return result;
	}
	

}
