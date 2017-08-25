package br.edu.iftm.tests;

import br.edu.iftm.characters.Archer;
import br.edu.iftm.characters.Knight;
import br.edu.iftm.characters.Priest;
import br.edu.iftm.characters.Wizard;
import br.edu.iftm.systems.Party;
import br.edu.iftm.weapons.HolyBible;
import br.edu.iftm.weapons.LongSword;
import br.edu.iftm.weapons.MagicStick;
import br.edu.iftm.weapons.SimpleBow;

public class Main {

	public static void main(String[] args) {
		Archer archer = new Archer("Lucas");
		archer.equipWeapon(new SimpleBow());
		
		Knight knight = new Knight("Grande Kina");
		knight.equipWeapon(new LongSword());
		
		Wizard wizard = new Wizard("Gandolfo");
		wizard.equipWeapon(new MagicStick());
		
		Priest priest = new Priest("Padre Betias");
		priest.equipWeapon(new HolyBible());
		
		Party party = new Party("Os Malas");
		party.addMember(archer);
		party.addMember(knight);
		party.addMember(wizard);
		party.addMember(priest);
		
		System.out.println(party);
		party.attack();
		
	}

}
