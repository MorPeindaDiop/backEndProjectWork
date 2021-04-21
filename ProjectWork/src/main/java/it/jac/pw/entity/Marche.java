package it.jac.pw.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Marche")
@Data

public class Marche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Marca")
	private int id_Marca;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "src")
	private String src;
	
	@Override
	public String toString() {
		return "Marca [id_Marca = " + id_Marca + ", marca = " + marca + "]";
	}

}
