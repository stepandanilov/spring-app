package ru.danilov.springcourse;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@Component
public class MusicPlayer {
	private Music music1;
	private Music music2;
	
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
	
	public String getName()
	{
		return name;
	}
	public int getVolume()
	{
		return volume;
	}
	
	
	@Autowired
	public MusicPlayer(@Qualifier("rockMusic")Music music1, @Qualifier("classicalMusic")Music music2)
	{
		this.music1 = music1;
		this.music2 = music2;
	}
	
	public MusicPlayer() {}
	
	public String playMusic()
	{
		//return "playing " + classicalMusic.getSong();
		return "playing " + music1.getSong() + ", " + music2.getSong();
	}
}
