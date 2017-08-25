package br.edu.iftm.systems;

import java.util.ArrayList;

import br.edu.iftm.characters.Character;

public class Party {
	private ArrayList<Character> group;
	private String name;
	
	
	
	public Party(String name) {
		group = new ArrayList<Character>();
		this.name = name;
	}

	public String toString()
	{
		String strGroup = "Grupo '" + name + "' (" + group.size() + "):\n";
		for(Character character : group)
		{
			strGroup += character + "\n";
		}
		return strGroup;
	}
	
	public int getSize()
	{
		return group.size();
	}
	
	public void attack()
	{
		System.out.println("O grupo " + name + " começou o ataque!");
		for(Character character : group)
		{
			character.attack();
		}
	}
	
	public void addMember(Character newMember)
	{
		group.add(newMember);
	}
	
	public void removeMember(Character member)
	{
		group.remove(member);
	}
	
	public void removeMember(int index)
	{
		group.remove(index);
	}
	
	public ArrayList<Character> getMembers()
	{
		return group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
