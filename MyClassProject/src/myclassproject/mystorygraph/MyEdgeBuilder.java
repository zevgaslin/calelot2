package myclassproject.mystorygraph;

import java.util.List;

import com.storygraph.BuilderMethod;
import com.storygraph.Node;
import com.storygraph.NodeBuilder;

public class MyEdgeBuilder extends NodeBuilder {
	/**
	 * Initializes the list of story graph nodes.
	 * @param list A list of all story graph nodes.
	 */
	public MyEdgeBuilder(List<Node> list) {
		super(list);
	}

	/**
	 * Write a method for each node. 
	 * Use get to get a reference to the node using its label.
	 * The method should add the edges of the node one by one. 
	 * These methods must have a BuilderMethod annotation.
	 */
	@BuilderMethod
	public void root() {
		Example:
		var root = get(NodeLabels.root.toString());
		var choice = new MenuChoice(MenuChoice.Options.Start);
		var nextNode = get(NodeLabels.Town.toString());
		root.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void atTown() {
		var node = get(NodeLabels.Town.toString());

		var choice1 = new PlayerInteraction(ChoiceLabels.Wall.toString(), campLog, Icons.coins, "Go to the Begging Spot");
		var nextNode1 = get(NodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.TownGeneralStore.toString(), campStall, Icons.door, "Go to the General Store");
		var nextNode2 = get(NodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(ChoiceLabels.Gate.toString(), campExit, Icons.bridge, "Go to the City");
		var nextNode3 = get(NodeLabels.Gate.toString());
		node.add(new Edge(choice3, nextNode3));
	}
	@BuilderMethod
	public void TownGeneralStore() {
		var node = get(NodeLabels.TownGeneralStoreActions.toString());

		var choice1 = new PlayerInteraction(ChoiceLabels.Apple.toString(), storageBarrel , Icons.apple, "Purchase Apple ");
		var nextNode1 = get(NodeLabels.Apple.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.Twinkie.toString(), storageChest, Icons.bread, "Purchase Twinkie");
		var nextNode2 = get(NodeLabels.Twinkie.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(ChoiceLabels.VerySourGrapes.toString(), storageShelf, Icons.skulls, "Purchase Very Sour Grapes");
		var nextNode3 = get(NodeLabels.VerySourGrapes.toString());
		node.add(new Edge(choice3, nextNode3));
		
		var choice4 = new PlayerInteraction(ChoiceLabels.Town.toString(), storageDoor, Icons.exit, "Exit Store");
		var nextNode4 = get(NodeLabels.Town.toString());
		node.add(new Edge(choice4, nextNode4));
	}
	@BuilderMethod
	public void Apple() {
		var node = get(NodeLabels.Apple.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(NodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(NodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void Twinkie() {
		var node = get(NodeLabels.Twinkie.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(NodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(NodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void VerySourGrapes() {
		var node = get(NodeLabels.VerySourGrapes.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(NodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(NodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void GeneralStore() {
		var node = get(NodeLabels.GeneralStoreActions.toString());

		var choice1 = new PlayerInteraction(ChoiceLabels.Apple.toString(), storageBarrel , Icons.apple, "Purchase Apple ");
		var nextNode1 = get(NodeLabels.Apple1.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.Twinkie.toString(), storageChest, Icons.bread, "Purchase Twinkie");
		var nextNode2 = get(NodeLabels.Twinkie1.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(ChoiceLabels.VerySourGrapes.toString(), storageShelf, Icons.skulls, "Purchase Very Sour Grapes");
		var nextNode3 = get(NodeLabels.VerySourGrapes1.toString());
		node.add(new Edge(choice3, nextNode3));
		
		var choice4 = new PlayerInteraction(ChoiceLabels.Town.toString(), storageDoor, Icons.exit, "Exit Store");
		var nextNode4 = get(NodeLabels.City.toString());
		node.add(new Edge(choice4, nextNode4));
	}
	@BuilderMethod
	public void Apple1() {
		var node = get(NodeLabels.Apple.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(NodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(NodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void Twinkie1() {
		var node = get(NodeLabels.Twinkie.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(NodeLabels.GeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(NodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void VerySourGrapes1() {
		var node = get(NodeLabels.VerySourGrapes.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(NodeLabels.GeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(NodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	public void atGate() {
		var node = get(NodeLabels.Gate.toString());
		
		var choice1 = new DialogChoice("Pay 20 Coins");
		var nextNode1 = get(NodeLabels.City.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Return to Town");
		var nextNode2 = get(NodeLabels.Town.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	public void atCity() {
		var node = get(NodeLabels.City.toString());

		var choice1 = new CloseNarrationChoice(ChoiceLabels.BeggingSpot.toString(), cityFountain, Icons.coins, "Go to the Begging Spot");
		var nextNode1 = get(NodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.GeneralStore.toString(), cityRedHouseDoor, Icons.door, "Go to the General Store");
		var nextNode2 = get(NodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice2 = new PlayerInteraction(ChoiceLabels.AlchemyStore.toString(), cityBrownHouseDoor, Icons.door, "Go to the Alchemy Store");
		var nextNode2 = get(NodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice2 = new PlayerInteraction(ChoiceLabels.Forest.toString(), cityRedHouseDoor, Icons.tree, "Go to the Forest");
		var nextNode2 = get(NodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice2 = new PlayerInteraction(ChoiceLabels.Docks.toString(), cityRedHouseDoor, Icons.ship, "Go to the Docks");
		var nextNode2 = get(NodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice2 = new PlayerInteraction(ChoiceLabels.Blacksmith.toString(), cityBlueHouseDoor, Icons.anvil, "Go to the Blacksmith");
		var nextNode2 = get(NodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(ChoiceLabels.Castle.toString(), campExit, Icons.bridge, "Go to the Castle");
		var nextNode3 = get(NodeLabels.Gate.toString());
		node.add(new Edge(choice3, nextNode3));
	}
	public void atDocks() {
		var node = get(NodeLabels.Dock.toString());

		var choice1 = new DialogChoice("Yar!");
		var nextNode1 = get(NodeLabels.PirateFightActions.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("Nar...");
		var nextNode2 = get(NodeLabels.No.toString());
		node.add(new Edge(choice2, nextNode2));

	}
	public void atDocks1() {
		var node = get(NodeLabels.Dock.toString());

		var choice 3 = new DialogChoice("I have ye Parrot");
		var nextNode3 = get(NodeLabels.PirateEnding.toString());
		node.add(new Edge(choice3, nextNode2));
	}

	public void PirateFight() {
			var node = get(NodeLabels.PirateFightActions.toString());

			var choice1 = new DialogChoice("Do yee stab me");
			var nextNode1 = get(NodeLabels.PirateEnding.toString());
			node.add(new Edge(choice1, nextNode1));

			var choice2 = new DialogChoice("Do yee surrender");
			var nextNode2 = get(NodeLabels.City.toString());
			node.add(new Edge(choice2, nextNode2));
		}
	public void No() {
		var node = get(NodeLabels.No.toString());

		var choice1 = new DialogChoice("Do yee want to be a pirate");
		var nextNode1 = get(NodeLabels.Arg.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("No");
		var nextNode2 = get(NodeLabels.Docs.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	public void Arg() {
		var node = get(NodeLabels.Arg.toString());

		var choice1 = new DialogChoice("Investigate the forest");
		var nextNode1 = get(NodeLabels.Forest2.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("Go Home");
		var nextNode2 = get(NodeLabels.Cty.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	public void Dungeon() {
		var node = get(NodeLabels.Dungeon.toString());
		
		var choice1 = new CloseNarrationChoice(ChoiceLabels.FightPrisoner.toString(), npc2, Icons.swords, "Hey, im going to fight you!!!");
		var nextNode1 = get(NodeLabels.FightPrisoner.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.Chair.toString(), dungeonChair, Icons.chair, "Sit");
		var nextNode2 = get(NodeLabels.Dungeon.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	public void FightPrisoner() {
		var node = get(NodeLabels.FightPrisonerActions.toString());
		
		var choice1 = new DialogChoice("Return to city");
		var nextNode1 = get(NodeLabels.City.toString());
		node.add(new Edge(choice1, nextNode1));
		
	}

	
	@BuilderMethod
	public void BeggingSpot() {
		var node = get(NodeLabels.BeggingSpot.toString());
		var nextNode1 = get(NodeLabels.BegForCoins.toString());
		var choice1 = new PlayerInteraction(ChoiceLabels.BegForCoins.toString(), npc1, Icons.coins, "Beg For Coins");
		node.add(new Edge(choice1, nextNode1));


		var node = get(NodeLabels.BeggingSpot.toString());
		var nextNode2 = get(NodeLabels.BegForCoins.toString());
		var choice2  new PlayerInteraction(ChoiceLabels.PickPocket.toString(), npc1, Icons.mug, "Attempt pickpocket");
		node.add(new Edge(choice2, nextNode2));
		
		var node = get(NodeLabels.BeggingSpot.toString());
		var nextNode3 = get(NodeLabels.Fight.toString());
		var choice3 = new PlayerInteraction(ChoiceLabels.Fight.toString(), npc1, Icons.sword, "Fight");
		node.add(new Edge(choice3, nextNode3));
		
		var node = get(NodeLabels.BeggingSpot.toString());
		var nextNode4 = get(NodeLabels.Leave.toString());
		var choice4 = new PlayerInteraction(ChoiceLabels.Leave.toString(), npc1, Icons.exit, "Go back to town");
		node.add(new Edge(choice4, nextNode4));
	}
	@BuilderMethod
	public void BegForCoins() {
		var node = get(NodeLabels.BegForCoins.toString());
		
		var choice1 = new DialogChoice("You got 10 coins. Return to begging spot.");
		var nextNode1 = get(NodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void AttemptPickPocket() {
		var node = get(NodeLabels.AttemptPickPocket.toString());
		
		var choice1 = new DialogChoice("Pickpocket works. You get 20 coins");
		var nextNode1 = get(NodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Pickpocket doesn't work. Looks like you picked a fight.");
		var nextNode2 = get(NodeLabels.Fight.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void Fight() {
		var node = get(NodeLabels.Fight.toString());
		
		var choice1 = new DialogChoice("You won the fight! You tok 20 coins. Go back to the begging spot?");
		var nextNode1 = get(NodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("You lost the fight. :( Go to the dungeon now.");
		var nextNode2 = get(NodeLabels.Dungeon.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void Blacksmith() {
		var node = get(NodeLabels.Blacksmith.toString());
		var nextNode = get(NodeLabels.Upgrade.toString());
		var choice = new PlayerInteraction(ChoiceLabels.upgrade.toString(), blacksmith, Icons.forge, "Upgrade your weapon.");
		node.add(new Edge(choice, nextNode));
		
		var choice4 = new PlayerInteraction(ChoiceLabels.Town.toString(), storageDoor, Icons.exit, "Exit Store");
		var nextNode4 = get(NodeLabels.Town.toString());
		node.add(new Edge(choice4, nextNode4));
	}
	@BuilderMethod
	public void Upgrade() {
		var node = get(NodeLabels.Upgrade.toString());
		
		var choice1 = new DialogChoice("Upgrade");
		var nextNode1 = get(NodeLabels.Blacksmith.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Upgrade");
		var nextNode2 = get(NodeLabels.Blacksmith.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void Alchemy() {
		var node = get(NodeLabels.Alchemy.toString());
		var nextNode = get(NodeLabels.GetBook.toString());
		var choice = new PlayerInteraction(ChoiceLabels.upgrade.toString(), alchemist, Icons.book, "Want this old book, its taking up space in my shop?");
		node.add(new Edge(choice, nextNode));
		var choice4 = new PlayerInteraction(ChoiceLabels.Town.toString(), storageDoor, Icons.exit, "Exit Store");
		var nextNode4 = get(NodeLabels.Town.toString());
		node.add(new Edge(choice4, nextNode4));
		
	}
	@BuilderMethod
	public void GetBook() {
		var node = get(NodeLabels.GetBook.toString());
		
		var choice1 = new DialogChoice("Upgrade");
		var nextNode1 = get(NodeLabels.Blacksmith.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Upgrade");
		var nextNode2 = get(NodeLabels.Blacksmith.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	@BuilderMethod
	public void Forest() {
		var node = get(NodeLabels.Forest.toString());

		var choice3 = new DialogChoice("As you enter the dark, magic forest on the outskirts of the city, you can’t help but shake the feeling that you are being watched by beings beyond your comprehension.");
		var choice1 = new DialogChoice("Go to the Fountain?");
		var nextNode1 = get(NodeLabels.Fountain.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("Go to the Loud and Obnoxious tree?");
		var nextNode2 = get(NodeLabels.Tree.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void Fountain() {
		var node = get(NodeLabels.Fountain.toString());
		
		var choice3 = new DialogChoice("You see a book shaped in the fountain. What do you choose to do?");
		var choice1 = new DialogChoice("Put book in fountain");
		var nextNode1 = get(NodeLabels.InfiniteGold.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void InfiniteGold() {
		var node = get(NodeLabels.Fountain.toString());
		
		var choice1 = new DialogChoice("You place the book in the fountian and a stream of an uncountable number of gold coins comes streaming out. You recieve 10000000000 coins!!!!!!!");
		var nextNode1 = get(NodeLabels.Forest.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void Forest2() {
		var node = get(NodeLabels.Forest.toString());

		var choice3 = new DialogChoice("You look around the forest to try adn find what the pirate was talkign about. You come across a Loud and Obnoxious tree.");
		var choice2 = new DialogChoice("Go to the Loud and Obnoxious tree?");
		var nextNode2 = get(NodeLabels.Tree.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void Tree() {
		var node = get(NodeLabels.Tree.toString());

		var choice3 = new DialogChoice("Lookign through the spyglass, you see a parrot flying up in the tree.");
		var choice1 = new DialogChoice("Grab him?");
		var nextNode1 = get(NodeLabels.AtDocks1.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("Go home?");
		var nextNode2 = get(NodeLabels.AtDocks.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	

	
	
	
	
	

	
}
