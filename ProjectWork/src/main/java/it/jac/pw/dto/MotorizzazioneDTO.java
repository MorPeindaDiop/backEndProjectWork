package it.jac.pw.dto;


import org.springframework.beans.BeanUtils;

import it.jac.pw.entity.Motorizzazione;
import lombok.Data;

@Data
public class MotorizzazioneDTO {
	
private int id_Motorizzazione;
	
	
	private int id_Modello;
	
	private String motore;
	
	private String alimentazione;
	
	private String cambio;
	
	private String consumo;
	
	
	public static MotorizzazioneDTO build(Motorizzazione motorizzazione) {

		MotorizzazioneDTO result = new MotorizzazioneDTO();
		BeanUtils.copyProperties(motorizzazione, result);

		return result;
	}
	

}
