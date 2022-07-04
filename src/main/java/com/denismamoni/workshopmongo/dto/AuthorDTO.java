package com.denismamoni.workshopmongo.dto;

import java.util.Objects;

import com.denismamoni.workshopmongo.domain.User;

public class AuthorDTO {

	private String id;
	private String nome;

	public AuthorDTO() {
	}

	public AuthorDTO(User user) {
		this.id = user.getId();
		this.nome = user.getNome();
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
		AuthorDTO other = (AuthorDTO) obj;
		return Objects.equals(id, other.id);
	}

}
