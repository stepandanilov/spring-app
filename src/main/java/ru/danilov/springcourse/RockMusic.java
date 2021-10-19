package ru.danilov.springcourse;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {
	public String getSong()
	{
		return "Rock music";
	}
}
