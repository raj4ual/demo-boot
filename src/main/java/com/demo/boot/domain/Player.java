package com.demo.boot.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Player {

	private String name;
	private String position;
	
	
	/**
	 * 
	 */
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param position
	 */
	public Player(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
