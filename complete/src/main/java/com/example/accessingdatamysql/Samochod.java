package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Samochod {
	private @Id @GeneratedValue Long id;
	private String marka;
	private int moc;
	private int przebieg;
	private boolean wypozyczony;
	
	public Samochod() {

	}
	public Samochod(String marka, int moc, boolean wypozyczony) {
		this.marka=marka;
		this.moc=moc;
		this.wypozyczony=wypozyczony;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getMoc() {
		return moc;
	}
	public void setMoc(int moc) {
		this.moc = moc;
	}
	public int getPrzebieg() {
		return przebieg;
	}
	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}
	public boolean isWypozyczony() {
		return wypozyczony;
	}
	public void setWypozyczony(boolean wypozyczony) {
		this.wypozyczony = wypozyczony;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("marka: ")
		.append(marka)
		.append("moc: ")
        .append(moc)
        .append("wypozyczony: ")
        .append(wypozyczony);
		return sb.toString();
	}
	
	
	
	
}
