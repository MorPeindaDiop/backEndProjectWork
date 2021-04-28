package it.jac.pw.dto;

import org.springframework.beans.BeanUtils;

import it.jac.pw.entity.Configurazione;
import lombok.Data;
@Data
public class ConfigurazioneDTO {
	
	private int id_Riepilogo;

	private String id_Motorizzazione;

	private String id_Colore;

	private String id_Allestimento;

	private String id_Marca;

	private String id_Modello;

	private String id_Utente;
	
	public static ConfigurazioneDTO build(Configurazione configurazione) {

		ConfigurazioneDTO result = new ConfigurazioneDTO();
		BeanUtils.copyProperties(configurazione, result);

		return result;
	}

}
