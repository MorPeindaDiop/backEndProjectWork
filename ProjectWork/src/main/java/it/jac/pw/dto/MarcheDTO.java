package it.jac.pw.dto;

import org.springframework.beans.BeanUtils;

import it.jac.pw.entity.Marche;
import lombok.Data;

@Data
public class MarcheDTO {
	
	private int id_Marca;
	
	private String marca;
	
	private String src;
	
	public static MarcheDTO build(Marche marche) {

		MarcheDTO result = new MarcheDTO();
		BeanUtils.copyProperties(marche, result);

		return result;
	}

}
