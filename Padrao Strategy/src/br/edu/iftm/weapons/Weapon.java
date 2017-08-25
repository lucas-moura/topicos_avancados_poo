package br.edu.iftm.weapons;

public class Weapon implements WeaponBehavior{
	public int damage;
	public int defense;
	public String weaponName;
	
	public Weapon(int damage, int defense, String weaponName) {
		this.damage = damage;
		this.defense = defense;
		this.weaponName = weaponName;
	}
	
	public String toString()
	{
		return weaponName + "(A: "+damage+" D: "+defense+")";
	}

	@Override
	public void attack() {
		System.out.println("\tAtacou com a arma " + toString());
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	
	
}
