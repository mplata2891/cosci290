/*
	Mike Plata
CoSci 290

*/

import java.util.*;
public class TestClass{

	public static void main(String[] args) {

		ArrayList<GamePiece> list = new ArrayList<>();

		Cloak cl1 = new Cloak();
		Fighter fi1 = new Fighter();
		Item it1 = new Item();
		Knife ki1 = new Knife();
		LeatherArmor le1 = new LeatherArmor();
		LightArmor li1 = new LightArmor();
		MagicUser mu1 = new LightArmor();
		MysticalBlast mb1 = new MysticalBlast();
		Rogue ro1 = new Rogue();
		Sword sw1 = new Sword();

		list.add(cl1);
		list.add(fi1);
		list.add(it1);
		list.add(ki1);
		list.add(le1);
		list.add(li1);
		list.add(mu1);
		list.add(mb1);
		list.add(ro1);
		list.add(sw1);

		it1.setName("Dragon's Tooth");
		it1.setStrMod(1);
		it1.setTufMod(2);
		it1.setSklMod(3);

		it1.toString();
	}
}
