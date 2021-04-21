package it.jac.pw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import it.jac.pw.pk.PkRiepilogoOptional;
import lombok.Data;

@Entity
@Table(name = "RiepilogoOptional")
@IdClass(PkRiepilogoOptional.class)
@Data

public class RiepilogoOptional {
	
	@Id
	@Column(name = "id_Riepilogo")
	private int id_Riepilogo;
	
	@Id
	@Column(name = "id_Optional")
	private int id_Optional;
	
	@Override
	public String toString() {
		return "RiepilogoOptional [id_Optional = " + id_Optional + ", id_Riepilogo = " + id_Riepilogo + "]";
	}

}
