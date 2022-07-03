package com.denismamoni.workshopmongo.dto;

import java.io.Serializable;
import java.util.Objects;

import com.denismamoni.workshopmongo.domain.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String nome;
	private String email;

	public UserDTO() {
	}

	public UserDTO(User obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.email = obj.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(id, other.id);
	}

}
