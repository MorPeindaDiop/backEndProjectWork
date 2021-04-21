package it.jac.pw.dto;


import org.springframework.beans.BeanUtils;

import it.jac.pw.entity.RiepilogoOptional;
import lombok.Data;

@Data
public class RiepilogoOptionalDTO {
	
	private int id_Riepilogo;
	
	private int id_Optional;
	
	public static RiepilogoOptionalDTO build(RiepilogoOptional riepilogoOptional) {

		RiepilogoOptionalDTO result = new RiepilogoOptionalDTO();
		BeanUtils.copyProperties(riepilogoOptional, result);

		return result;
	}

}
