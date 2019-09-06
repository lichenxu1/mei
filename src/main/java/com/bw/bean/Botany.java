package com.bw.bean;

public class Botany {

	private int id;
	
	private String name;
	
	private String ms;
	
	private int tid;

	public Botany() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Botany(int id, String name, String ms, int tid) {
		super();
		this.id = id;
		this.name = name;
		this.ms = ms;
		this.tid = tid;
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

	public String getMs() {
		return ms;
	}

	public void setMs(String ms) {
		this.ms = ms;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	@Override
	public String toString() {
		return "Botany [id=" + id + ", name=" + name + ", ms=" + ms + ", tid=" + tid + "]";
	}
	
	
}
