package myclassproject.mystorygraph;

import java.util.List;


import com.playerInput.*;
import com.playerInput.PlayerInteraction.Icons;
import com.storygraph.BuilderMethod;
import com.storygraph.Edge;
import com.storygraph.NodeBuilder;
import com.storygraph.Node;
import myclassproject.mystorygraph.MyStoryEntities;

public class MyEdgeBuilder extends MyNodeBuilder {
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
	
	//Zev Gaslin Code
	
	public void root() { 
		var root = get(MyNodeLabels.root.toString());
		var choice = new MenuChoice(MenuChoice.Options.Start);
		var nextNode = get(MyNodeLabels.Town.toString());
		root.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void atTown() {
		var node = get(MyNodeLabels.Town.toString());

		var choice1 = new PlayerInteraction(MyChoiceLabels.Wall.toString(), MyStoryEntities.npc1, Icons.coins, "Go to the Begging Spot");
		var nextNode1 = get(MyNodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(MyChoiceLabels.TownGeneralStore.toString(), MyStoryEntities.merchant, Icons.door, "Go to the General Store");
		var nextNode2 = get(MyNodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(MyChoiceLabels.Gate.toString(), MyStoryEntities.gaurd, Icons.bridge, "Go to the City");
		var nextNode3 = get(MyNodeLabels.Gate.toString());
		node.add(new Edge(choice3, nextNode3));
	}
	@BuilderMethod
	public void atTownGeneralStore() {
		var node = get(MyNodeLabels.GeneralStoreActions.toString());

		var choice1 = new PlayerInteraction(MyChoiceLabels.Apple.toString(), MyStoryEntities.apple , Icons.apple, "Purchase Apple ");
		var nextNode1 = get(MyNodeLabels.Apple.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(MyChoiceLabels.Twinkie.toString(), MyStoryEntities.bread, Icons.bread, "Purchase Twinkie");
		var nextNode2 = get(MyNodeLabels.Twinkie.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(MyChoiceLabels.VerySourGrapes.toString(), MyStoryEntities.grapes, Icons.skull, "Purchase Very Sour Grapes");
		var nextNode3 = get(MyNodeLabels.VerySourGrapes.toString());
		node.add(new Edge(choice3, nextNode3));
		
		var choice4 = new PlayerInteraction(MyChoiceLabels.Town.toString(), MyStoryEntities.merchant, Icons.exit, "Exit Store");
		var nextNode4 = get(MyNodeLabels.Town.toString());
		node.add(new Edge(choice4, nextNode4));
	}
	@BuilderMethod
	public void Apple() {
		var node = get(MyNodeLabels.Apple.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(MyNodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(MyNodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	//Joshua Haddad Code
	@BuilderMethod
	public void Twinkie() {
		var node = get(MyNodeLabels.Twinkie.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(MyNodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(MyNodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	//Zev Gaslin Code
	@BuilderMethod
	public void VerySourGrapes() {
		var node = get(MyNodeLabels.VerySourGrapes.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(MyNodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(MyNodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void GeneralStore() {
		var node = get(MyNodeLabels.GeneralStoreActions.toString());

		var choice1 = new PlayerInteraction(MyChoiceLabels.Apple.toString(), MyStoryEntities.apple , Icons.apple, "Purchase Apple ");
		var nextNode1 = get(MyNodeLabels.Apple1.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(MyChoiceLabels.Twinkie.toString(), MyStoryEntities.bread, Icons.bread, "Purchase Twinkie");
		var nextNode2 = get(MyNodeLabels.Twinkie1.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(MyChoiceLabels.VerySourGrapes.toString(), MyStoryEntities.grapes, Icons.skull, "Purchase Very Sour Grapes");
		var nextNode3 = get(MyNodeLabels.VerySourGrapes1.toString());
		node.add(new Edge(choice3, nextNode3));
		
		var choice4 = new PlayerInteraction(MyChoiceLabels.Town.toString(), MyStoryEntities.merchant, Icons.exit, "Exit Store");
		var nextNode4 = get(MyNodeLabels.City.toString());
		node.add(new Edge(choice4, nextNode4));
	}
	@BuilderMethod
	public void Apple1() {
		var node = get(MyNodeLabels.Apple.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(MyNodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(MyNodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void Twinkie1() {
		var node = get(MyNodeLabels.Twinkie.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void VerySourGrapes1() {
		var node = get(MyNodeLabels.VerySourGrapes.toString());
		
		var choice1 = new DialogChoice("Purchase");
		var nextNode1 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Purchase");
		var nextNode2 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	//Joshua Haddad Code
	public void atGate() {
		var node = get(MyNodeLabels.Gate.toString());
		
		var choice1 = new DialogChoice("Pay 20 Coins");
		var nextNode1 = get(MyNodeLabels.City.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Return to Town");
		var nextNode2 = get(MyNodeLabels.Town.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	public void atCity() {
		var node = get(MyNodeLabels.City.toString());

		var choice1 = new CloseNarrationChoice(MyChoiceLabels.BeggingSpot.toString(), cityFountain, Icons.coins, "Go to the Begging Spot");
		var nextNode1 = get(MyNodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(MyChoiceLabels.GeneralStore.toString(), cityRedHouseDoor, Icons.door, "Go to the General Store");
		var nextNode2 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.AlchemyStore.toString(), cityBrownHouseDoor, Icons.door, "Go to the Alchemy Store");
		var nextNode2 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.Forest.toString(), cityRedHouseDoor, Icons.tree, "Go to the Forest");
		var nextNode2 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.Docks.toString(), cityRedHouseDoor, Icons.ship, "Go to the Docks");
		var nextNode2 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.Blacksmith.toString(), cityBlueHouseDoor, Icons.anvil, "Go to the Blacksmith");
		var nextNode5= get(MyNodeLabels.Blacksmith.toString());
		node.add(new Edge(choice2, nextNode5));
		
		var choice3 = new PlayerInteraction(MyChoiceLabels.Castle.toString(), campExit, Icons.bridge, "Go to the Castle");
		var nextNode3 = get(MyNodeLabels.Gate.toString());
		node.add(new Edge(choice3, nextNode3));
	}
	public void atDocks() {
		var node = get(MyNodeLabels.Dock.toString());

		var choice1 = new DialogChoice("Yar!");
		var nextNode1 = get(MyNodeLabels.PirateFightActions.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("Nar...");
		var nextNode2 = get(MyNodeLabels.No.toString());
		node.add(new Edge(choice2, nextNode2));

	}
	public void atDocks1() {
		var node = get(MyNodeLabels.Dock.toString());

		var choice3 = new DialogChoice("I have ye Parrot");
		var nextNode3 = get(MyNodeLabels.PirateEnding.toString());
		node.add(new Edge(choice3, nextNode2));
	}

	public void PirateFight() {
			var node = get(MyNodeLabels.PirateFightActions.toString());

			var choice1 = new DialogChoice("Do yee stab me");
			var nextNode1 = get(MyNodeLabels.PirateEnding.toString());
			node.add(new Edge(choice1, nextNode1));

			var choice2 = new DialogChoice("Do yee surrender");
			var nextNode2 = get(MyNodeLabels.City.toString());
			node.add(new Edge(choice2, nextNode2));
		}
	public void No() {
		var node = get(MyNodeLabels.No.toString());

		var choice1 = new DialogChoice("Do yee want to be a pirate");
		var nextNode1 = get(MyNodeLabels.Arg.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("No");
		var nextNode2 = get(MyNodeLabels.Docs.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	public void Arg() {
		var node = get(MyNodeLabels.Arg.toString());

		var choice1 = new DialogChoice("Investigate the forest");
		var nextNode1 = get(MyNodeLabels.Forest2.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("Go Home");
		var nextNode2 = get(MyNodeLabels.Cty.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	public void Dungeon() {
		var node = get(MyNodeLabels.Dungeon.toString());
		
		var choice1 = new CloseNarrationChoice(MyChoiceLabels.FightPrisoner.toString(), npc2, Icons.swords, "Hey, im going to fight you!!!");
		var nextNode1 = get(MyNodeLabels.FightPrisoner.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(MyChoiceLabels.Chair.toString(), dungeonChair, Icons.chair, "Sit");
		var nextNode2 = get(MyNodeLabels.Dungeon.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	public void FightPrisoner() {
		var node = get(MyNodeLabels.FightPrisonerActions.toString());
		
		var choice1 = new DialogChoice("Return to city");
		var nextNode1 = get(MyNodeLabels.City.toString());
		node.add(new Edge(choice1, nextNode1));
		
	}

	//Jaedan Curcio Code
	@BuilderMethod
	public void BeggingSpot() {
		var node = get(MyNodeLabels.BeggingSpot.toString());
		var nextNode1 = get(MyNodeLabels.BegForCoins.toString());
		var choice1 = new PlayerInteraction(MyChoiceLabels.BegForCoins.toString(), npc1, Icons.coins, "Beg For Coins");
		node.add(new Edge(choice1, nextNode1));


		var node = get(MyNodeLabels.BeggingSpot.toString());
		var nextNode2 = get(MyNodeLabels.BegForCoins.toString());
		var choice2 = new PlayerInteraction(MyChoiceLabels.PickPocket.toString(), npc1, Icons.mug, "Attempt pickpocket");
		node.add(new Edge(choice2, nextNode2));
		
		var node = get(MyNodeLabels.BeggingSpot.toString());
		var nextNode3 = get(MyNodeLabels.Fight.toString());
		var choice3 = new PlayerInteraction(MyChoiceLabels.Fight.toString(), npc1, Icons.sword, "Fight");
		node.add(new Edge(choice3, nextNode3));
		
		var node = get(MyNodeLabels.BeggingSpot.toString());
		var nextNode4 = get(MyNodeLabels.Leave.toString());
		var choice4 = new PlayerInteraction(MyChoiceLabels.Leave.toString(), npc1, Icons.exit, "Go back to town");
		node.add(new Edge(choice4, nextNode4));
	}
	@BuilderMethod
	public void BegForCoins() {
		var node = get(MyNodeLabels.BegForCoins.toString());
		
		var choice1 = new DialogChoice("You got 10 coins. Return to begging spot.");
		var nextNode1 = get(MyNodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void AttemptPickPocket() {
		var node = get(MyNodeLabels.AttemptPickPocket.toString());
		
		var choice1 = new DialogChoice("Pickpocket works. You get 20 coins");
		var nextNode1 = get(MyNodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Pickpocket doesn't work. Looks like you picked a fight.");
		var nextNode2 = get(MyNodeLabels.Fight.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void Fight() {
		var node = get(MyNodeLabels.Fight.toString());
		
		var choice1 = new DialogChoice("You won the fight! You tok 20 coins. Go back to the begging spot?");
		var nextNode1 = get(MyNodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("You lost the fight. :( Go to the dungeon now.");
		var nextNode2 = get(MyNodeLabels.Dungeon.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void Blacksmith() {
		var node = get(MyNodeLabels.Blacksmith.toString());
		var nextNode = get(MyNodeLabels.Upgrade.toString());
		var choice = new PlayerInteraction(MyChoiceLabels.upgrade.toString(), blacksmith, Icons.forge, "Upgrade your weapon.");
		node.add(new Edge(choice, nextNode));
		
		var choice4 = new PlayerInteraction(MyChoiceLabels.Town.toString(), storageDoor, Icons.exit, "Exit Store");
		var nextNode4 = get(MyNodeLabels.Town.toString());
		node.add(new Edge(choice4, nextNode4));
	}
	@BuilderMethod
	public void Upgrade() {
		var node = get(MyNodeLabels.Upgrade.toString());
		
		var choice1 = new DialogChoice("Upgrade");
		var nextNode1 = get(MyNodeLabels.Blacksmith.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Upgrade");
		var nextNode2 = get(MyNodeLabels.Blacksmith.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void Alchemy() {
		var node = get(MyNodeLabels.Alchemy.toString());
		var nextNode = get(MyNodeLabels.GetBook.toString());
		var choice = new PlayerInteraction(MyChoiceLabels.upgrade.toString(), alchemist, Icons.book, "Want this old book, its taking up space in my shop?");
		node.add(new Edge(choice, nextNode));
		var choice4 = new PlayerInteraction(MyChoiceLabels.Town.toString(), storageDoor, Icons.exit, "Exit Store");
		var nextNode4 = get(MyNodeLabels.Town.toString());
		node.add(new Edge(choice4, nextNode4));
		
	}
	@BuilderMethod
	public void GetBook() {
		var node = get(MyNodeLabels.GetBook.toString());
		
		var choice1 = new DialogChoice("Upgrade");
		var nextNode1 = get(MyNodeLabels.Blacksmith.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Do not Upgrade");
		var nextNode2 = get(MyNodeLabels.Blacksmith.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	@BuilderMethod
	public void Forest() {
		var node = get(MyNodeLabels.Forest.toString());

		var choice3 = new DialogChoice("As you enter the dark, magic forest on the outskirts of the city, you can’t help but shake the feeling that you are being watched by beings beyond your comprehension.");
		var choice1 = new DialogChoice("Go to the Fountain?");
		var nextNode1 = get(MyNodeLabels.Fountain.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("Go to the Loud and Obnoxious tree?");
		var nextNode2 = get(MyNodeLabels.Tree.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void Fountain() {
		var node = get(MyNodeLabels.Fountain.toString());
		
		var choice3 = new DialogChoice("You see a book shaped in the fountain. What do you choose to do?");
		var choice1 = new DialogChoice("Put book in fountain");
		var nextNode1 = get(MyNodeLabels.InfiniteGold.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	
	//Zev Gaslin Code
	@BuilderMethod
	public void InfiniteGold() {
		var node = get(MyNodeLabels.Fountain.toString());
		
		var choice1 = new DialogChoice("You place the book in the fountian and a stream of an uncountable number of gold coins comes streaming out. You recieve 10000000000 coins!!!!!!!");
		var nextNode1 = get(MyNodeLabels.Forest.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void Forest2() {
		var node = get(MyNodeLabels.Forest.toString());

		var choice3 = new DialogChoice("You look around the forest to try adn find what the pirate was talkign about. You come across a Loud and Obnoxious tree.");
		var choice2 = new DialogChoice("Go to the Loud and Obnoxious tree?");
		var nextNode2 = get(MyNodeLabels.Tree.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void Tree() {
		var node = get(MyNodeLabels.Tree.toString());

		var choice3 = new DialogChoice("Lookign through the spyglass, you see a parrot flying up in the tree.");
		
		var choice1 = new DialogChoice("Grab him?");
		var nextNode1 = get(MyNodeLabels.AtDocks1.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("Go home?");
		var nextNode2 = get(MyNodeLabels.AtDocks.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	//Jaedan Curcio Code
	public void CastleGate() {
		var node = get(MyNodeLabels.CastleGate.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.CastleGate.toString(), castleCrossroadsWestEnd, Icons.city, "Return to the City");
		var nextNode1 = get(MyNodeLabels.City.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.CastleGate.toString(), gaurd, Icons.coins, "Bribe the Gaurd");
		var nextNode2 = get(MyNodeLabels.BribeTheGaurd1.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(MyChoiceLabels.CastleGate.toString(), gaurd, Icons.draw, "Fight the Gaurd");
		var nextNode3 = get(MyNodeLabels.FightTheGuard.toString());
		node.add(new Edge(choice3, nextNode3));
	}
	
	public void GuardFight() {
		var node = get(MyNodeLabels.CastleGate.toString());
		
		var choice = new DialogChoice("You win!");
		var nextNode = get(MyNodeLabels.ThroneRoom.toString());
		node.add(new Edge(choice, nextNode));
	}
	
	public void GuardBribe1() {
		var node = get(MyNodeLabels.BribeTheGuard1.toString());
		
		var choice = newDialogChoice("Progress to next room");
		var nextNode = get(MyNodeLabels.MainHallUnsafe.toString());
		
		node.add(new Edge(choice, nextNode));
	}
	
	public void MainHall1() {
		var node = get(MyNodeLabels.MainHallUnsafe.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe.toString(), gaurd, Icons.coins, "Bribe the Gaurd");
		var nextNode1 = get(MyNodeLabels.BribeTheGaurd2.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe.toString(), gaurd, Icons.draw, "Fight the Gaurd");
		var nextNode2 = get(MyNodeLabels.FightTheGuard.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	public void GuardBribe2() {
		var node = get(MyNodeLabels.BribeTheGuard2.toString());
		
		var choice = newDialogChoice("Progress to next room");
		var nextNode = get(MyNodeLabels.MainHallUnsafe2.toString());
		
		node.add(new Edge(choice, nextNode));
	}
	
	public void MainHall2() {
		var node = get(MyNodeLabels.MainHallUnsafe2.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe2.toString(), gaurd, Icons.coins, "Bribe the Gaurd");
		var nextNode1 = get(MyNodeLabels.BribeTheGaurd3.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe2.toString(), gaurd, Icons.draw, "Fight the Gaurd");
		var nextNode2 = get(MyNodeLabels.FightTheGuard.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	public void GuardBribe3() {
		var node = get(MyNodeLabels.BribeTheGuard3.toString());
		
		var choice = newDialogChoice("Progress to next room");
		var nextNode = get(MyNodeLabels.MainHallUnsafe3.toString());
		
		node.add(new Edge(choice, nextNode));
	}
	public void MainHall3() {
		var node = get(MyNodeLabels.MainHallUnsafe3.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe3.toString(), gaurd, Icons.coins, "Bribe the Gaurd");
		var nextNode1 = get(MyNodeLabels.BribeTheGaurd4.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe3.toString(), gaurd, Icons.draw, "Fight the Gaurd");
		var nextNode2 = get(MyNodeLabels.FightTheGuard.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	public void GuardBribe4() {
		var node = get(MyNodeLabels.BribeTheGuard4.toString());
		
		var choice = newDialogChoice("Progress to Throne Room");
		var nextNode = get(MyNodeLabels.ThroneRoom.toString());
		
		node.add(new Edge(choice, nextNode));
	}
	
	public void atThroneRoom() {
		var node = get(MyNodeLabels.ThroneRoom.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.ThroneRoom.toString(), king, Icons.coins, "Buy your land back");
		var nextNode1 = get(MyNodeLabels.LandEnding.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.FightKing.toString(), king, Icons.draw, "Fight the King");
		var nextNode2 = get(MyNodeLabels.FightKing.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(MyChoiceLabels.ThroneRoom.toString(), king, Icons.casgtle, "Buy the kingdom");
		var nextNode3 = get(MyNodeLabels.BuyKingdom.toString());
		node.add(new Edge(choice3, nextNode3));
	   
	
	}
	
	public void KingFight() {
		var node = get(MyNodeLabels.FightKing.toString());
		
		var choice1 = new DialogChoice("You won!");
		var nextNode = get(MyNodeLabels.LandEnding());
		
		node.add(new Edge(choice1, nextNode));
		
	}
	
	public void BuyKingdom() {
		var node = get(MyNodeLabels.BuyKingdom.toString());
		var choice = new DialogChoice("Buy the Kingdom");
		var nextNode = get(MyNodeLabels.KingdomEnding());
		
		node.add(new Edge(choice, nextNode));
	}
	
	
	

	
	
	
	
	

	
}
