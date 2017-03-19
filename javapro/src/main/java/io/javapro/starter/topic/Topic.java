package io.javapro.starter.topic;

public class Topic {
	private String ID;
	private String name;
	private String desc;
	
	public Topic(){	
	}
	public Topic(String iD, String name, String desc) {
		super();
		this.ID = iD;
		this.name = name;
		this.desc = desc;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
