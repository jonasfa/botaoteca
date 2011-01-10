package br.com.jera.botaoteca;

import android.content.Context;
import br.com.jera.botaoteca.sound.Sound;

public class Button {
	private String name;
	private ButtonColor color;
	private Sound sound;
	
	public Button(ButtonColor color, Context context, Sound sound) {
		this.color = color;
		this.sound = sound;
	}
	
	public String getName() {
		return name;
	}

	public ButtonColor getColor() {
		return color;
	}

	public void setColor(ButtonColor color) {
		this.color = color;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public Sound getSound() {
	    return sound;
	}
}
