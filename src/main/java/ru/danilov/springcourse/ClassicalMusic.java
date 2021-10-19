package ru.danilov.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
	
	@PostConstruct
	public void doMyInit()
	{
		System.out.println("Doing my initialization");
	}
	@PreDestroy
	public void doMyDestroy()
	{
		System.out.println("Doing my destruction");
	}
	private ClassicalMusic(){}

	public static ClassicalMusic getClassicalMusic()
	{
		return new ClassicalMusic();
	}
	
	public String getSong()
	{
		return "Classical music";
	}
}
