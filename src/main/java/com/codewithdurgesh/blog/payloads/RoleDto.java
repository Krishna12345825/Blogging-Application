package com.codewithdurgesh.blog.payloads;

import lombok.Data;

@Data
public class RoleDto {
	private int id;
	private String name;
	
	public RoleDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "RoleDto [id=" + id + ", name=" + name + "]";
	}
	
	
}
