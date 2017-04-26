package com.example.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Menu {
	
	private String name;
	private String link;
	private List<Menu> subMenus;

	public Menu(String name, String link, List<Menu> subMenus) {
		super();
		this.name = name;
		this.link = link;
		this.subMenus = subMenus;
	}

		
	public Menu() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<Menu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<Menu> subMenus) {
		this.subMenus = subMenus;
	}
}
