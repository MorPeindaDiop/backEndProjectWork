package it.jac.pw.dto;

import org.springframework.beans.BeanUtils;

import it.jac.pw.entity.User;
import lombok.Data;

@Data
public class UserDTO {

	private String email;

	private String username;

	private String name;

	private String surname;

	private String password;

	public static UserDTO build(User user) {

		UserDTO result = new UserDTO();
		BeanUtils.copyProperties(user, result);

		return result;
	}

}
