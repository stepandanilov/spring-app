package ru.danilov.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
	
	private ClassicalMusic(){}

	public static ClassicalMusic getClassicalMusic()
	{
		return new ClassicalMusic();
	}
	
	public void doMyInit()
	{
		System.out.println("Doing my initialization");
	}
	public void doMyDestroy()
	{
		System.out.println("Doing my destruction");
	}
	
	public String getSong()
	{
		return "Classical music";
	}
}
