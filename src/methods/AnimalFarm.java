package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	String animal = JOptionPane.showInputDialog(null, "What animal do you want to hear?");
	if (animal.equals("cow")) {
		playMoo();
}
	else if (animal.equals("duck")) {
		playQuack();
	}
	else if (animal.equals("dog")) {
		playWoof();
	}
	else if (animal.equals("cat")) {
		playMeow();
	}
	else if (animal.equals("llama")) {
		playLlama();
	}


	}

void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}
void playMeow() {
	playNoise(meowFile);
}
void playLlama() {
	playNoise(llamaFile);
}

String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

