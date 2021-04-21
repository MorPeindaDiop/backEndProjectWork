package it.jac.pw.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "Modello")
@Data


public class Modello {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Modello")
	private int id_Modello;
	
	@Column(name = "modello")
	private String modello;
	
	@Column(name = "id_Marca")
	private int id_Marca;
	
	@Column(name = "src")
	private String src;
	
	@Override
	public String toString() {
		return "Modello [id_Modello = " + id_Modello + ", modello = " + modello + ",id_Marca = " + id_Marca + " ]";
	}

}
