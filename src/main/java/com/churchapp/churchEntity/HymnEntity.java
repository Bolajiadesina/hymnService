package com.churchapp.churchEntity;

public class HymnEntity {
	
	private int hymnNumber;
	private String hymnTitle;
	private String hymnLyrics;
	
	public int getHymnNumber() {
		return hymnNumber;
	}
	public void setHymnNumber(int hymnNumber) {
		this.hymnNumber = hymnNumber;
	}
	public String getHymnTitle() {
		return hymnTitle;
	}
	public void setHymnTitle(String hymnTitle) {
		this.hymnTitle = hymnTitle;
	}
	public String getHymnLyrics() {
		return hymnLyrics;
	}
	public void setHymnLyrics(String hymnLyrics) {
		this.hymnLyrics = hymnLyrics;
	}
	@Override
	public String toString() {
		return "HymnEntity [hymnNumber=" + hymnNumber + ", hymnTitle=" + hymnTitle + ", hymnLyrics=" + hymnLyrics + "]";
	}
	
	
	
	

}
