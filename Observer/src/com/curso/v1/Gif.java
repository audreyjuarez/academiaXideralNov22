package com.curso.v1;

public class Gif extends Observer {
	
	private String gif;

	public Gif(String gif) {
		this.gif = gif;
	}
	
	void showGif() {
		System.out.println("Gif: "+gif);
	}

	@Override
	void update() {
		showGif();
	}

}
