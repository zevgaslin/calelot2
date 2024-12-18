package myclassproject.mystorygraph;
//test
import java.util.List;


import com.playerInput.*;
import static com.playerInput.PlayerInteraction.Icons;
import com.storygraph.BuilderMethod;
import com.storygraph.Edge;
import com.storygraph.NodeBuilder;
import com.storygraph.Node;
import myclassproject.mystorygraph.MyStoryEntities;
//import myclassproject.questexample.DialogChoice;
//import myclassproject.questexample.NodeLabels;

import com.playerInput.CloseNarrationChoice;
//import myclassproject.questexample.CloseNarrationChoice;

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
	
	
	//Zev Gaslin Code
	@BuilderMethod
	public void rootEdges() { 
		var root = get(MyNodeLabels.root.toString());
		var choice = new MenuChoice(MenuChoice.Options.Start);
		var nextNode = get(MyNodeLabels.FarmNar.toString());
		root.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void atFarmNarEdges() { 
		var node = get(MyNodeLabels.FarmNar.toString());
		var choice = new CloseNarrationChoice();
		var nextNode = get(MyNodeLabels.FarmAct.toString());
		node.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void atFarmActEdges() { 
		var node = get(MyNodeLabels.FarmAct.toString());
		var choice = new PlayerInteraction(MyStoryEntities.player, MyChoiceLabels.Relocate.toString(), MyStoryEntities.farmExit);
		var nextNode = get(MyNodeLabels.Town1.toString());
		node.add(new Edge(choice, nextNode));
	}

	@BuilderMethod
	public void atTownactEdges() { 
		var node = get(MyNodeLabels.Town1.toString());
		var choice1 = new PlayerInteraction(MyChoiceLabels.Talk1.toString(), MyStoryEntities.npc1, Icons.apple, "Buy Apple");
		var nextNode1 = get(MyNodeLabels.AppleTalk.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.Talk2.toString(), MyStoryEntities.npc1, Icons.bread, "Buy Bread");
		var nextNode2 = get(MyNodeLabels.BreadTalk.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(MyChoiceLabels.Talk3.toString(), MyStoryEntities.npc1, Icons.potion, "Buy Grapes");
		var nextNode3 = get(MyNodeLabels.GrapesTalk.toString());
		node.add(new Edge(choice3, nextNode3));
	
		
		var choice4 = new PlayerInteraction(MyChoiceLabels.Steal.toString(), MyStoryEntities.npc2, Icons.kneel, "Pickpocket");
		var nextNode4 = get(MyNodeLabels.PickPocket1.toString());
		node.add(new Edge(choice4, nextNode4));
		var choice5 = new PlayerInteraction(MyChoiceLabels.Kill.toString(), MyStoryEntities.npc2, Icons.skull, "Mug");
		var nextNode5 = get(MyNodeLabels.Kill1.toString());
		node.add(new Edge(choice5, nextNode5));
		var choice6 = new PlayerInteraction(MyStoryEntities.player, MyChoiceLabels.Relocated.toString(), MyStoryEntities.townExit);
		var nextNode6 =  get(MyNodeLabels.Bradge.toString());
		node.add(new Edge(choice6, nextNode6));

	}
	
	@BuilderMethod
	public void AppleTalk() { 
		var node = get(MyNodeLabels.AppleTalk.toString());
		node.clearEdges();
		var choice1 = new DialogChoice("Yes");
		var nextNode1 = get(MyNodeLabels.AppleTalkYes.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("No");
		var nextNode2 = get(MyNodeLabels.AppleTalkNo.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void AppleTalkYes() { 
			var node = get(MyNodeLabels.AppleTalkYes.toString());
			node.clearEdges();
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.Town1.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void AppleTalkNo() { 
			var node = get(MyNodeLabels.AppleTalkNo.toString());
			node.clearEdges();
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.Town1.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	
	@BuilderMethod
	public void BreadTalk() { 
		var node = get(MyNodeLabels.BreadTalk.toString());
		node.clearEdges();
		var choice1 = new DialogChoice("Yes");
		var nextNode1 = get(MyNodeLabels.BreadTalkYes.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("No");
		var nextNode2 = get(MyNodeLabels.BreadTalkNo.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void BreadTalkYes() { 
		var node = get(MyNodeLabels.BreadTalkYes.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.Town1.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void BreadTalkNo() { 
		var node = get(MyNodeLabels.BreadTalkNo.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.Town1.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void GrapeTalk() { 
		var node = get(MyNodeLabels.GrapesTalk.toString());
		var choice1 = new DialogChoice("Yes");
		var nextNode1 = get(MyNodeLabels.GrapesTalkYes.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("No");
		var nextNode2 = get(MyNodeLabels.GrapesTalkNo.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	@BuilderMethod
	public void GrapeTalkYes() { 
		var node = get(MyNodeLabels.GrapesTalkYes.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.Town1.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void GrapeTalkNo() { 
		var node = get(MyNodeLabels.GrapesTalkNo.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.Town1.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	
	@BuilderMethod
	public void PickPocket() {
		var node = get(MyNodeLabels.PickPocket1.toString());
		node.clearEdges();
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.Town1.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void Kill() {
		var node = get(MyNodeLabels.Kill1.toString());
		node.clearEdges();
		var choice1 = new DialogChoice("Win");
		var nextNode1 = get(MyNodeLabels.Town1.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Lose");
		var nextNode2 = get(MyNodeLabels.Youdied.toString());
		node.add(new Edge(choice2, nextNode2));
	}

	
	//Joshua Haddad Code
	@BuilderMethod
	public void atGate() {
		var node = get(MyNodeLabels.Bradge.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.Talk.toString(), MyStoryEntities.gaurd, Icons.talk, "Talk to Guard");
		var nextNode1 = get(MyNodeLabels.GuardTalk.toString());
		node.add(new Edge(choice1, nextNode1));
		
		//var choice2 = new PlayerInteraction(MyChoiceLabels.Relocat.toString(), MyStoryEntities.SouthEnd, Icons.exit, "Enter City");
		//var nextNode2 = get(MyNodeLabels.City.toString());
		//node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void GuardTalk() {
		var node = get(MyNodeLabels.GuardTalk.toString());
		var choice1 = new DialogChoice("Fine");
		var nextNode1 = get(MyNodeLabels.GuardTalkYes.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Fine");
		var nextNode2 = get(MyNodeLabels.GuardTalkNo.toString());
		node.add(new Edge(choice2, nextNode2));
		
	}
		
	
	@BuilderMethod
	public void GuardTalkYes() {
		var node = get(MyNodeLabels.GuardTalkYes.toString());
		
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.CityNar.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void GuardTalkNo() {
		var node = get(MyNodeLabels.GuardTalkNo.toString());
		
		var choice2 = new DialogChoice("Continue");
		var nextNode2 = get(MyNodeLabels.Bradge.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void CityNared() {
		var node = get(MyNodeLabels.CityNar.toString());
		var choice1 = new CloseNarrationChoice();
		var nextNode1 = get(MyNodeLabels.CityAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void CityActed() {
		var node = get(MyNodeLabels.CityAct.toString());
		var choice1 =  new PlayerInteraction(MyStoryEntities.player, MyChoiceLabels.Relocated4.toString(), MyStoryEntities.Dockdoor);
		var nextNode1 = get(MyNodeLabels.DockNar.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice5 = new PlayerInteraction(MyChoiceLabels.Relocated5.toString(), MyStoryEntities.Blackdoor, Icons.door, "Go to Blacksmith");
		var nextNode5 = get(MyNodeLabels.BlacksmithNar.toString());
		node.add(new Edge(choice5, nextNode5));
		
		var choice8 = new PlayerInteraction(MyChoiceLabels.Relocated8.toString(), MyStoryEntities.WhichDoor, Icons.door, "Go to Alchemy Shop");
		var nextNode8 = get(MyNodeLabels.AlchemistNar.toString());
		node.add(new Edge(choice8, nextNode8));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.Talk4.toString(), MyStoryEntities.npc1, Icons.apple, "Buy Apple");
		var nextNode2 = get(MyNodeLabels.AppleTalk1.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(MyChoiceLabels.Talk5.toString(), MyStoryEntities.npc1, Icons.bread, "Buy Bread");
		var nextNode3 = get(MyNodeLabels.BreadTalk1.toString());
		node.add(new Edge(choice3, nextNode3));
		
		var choice4 = new PlayerInteraction(MyChoiceLabels.Talk6.toString(), MyStoryEntities.npc1, Icons.potion, "Buy Grapes");
		var nextNode4 = get(MyNodeLabels.GrapesTalk1.toString());
		node.add(new Edge(choice4, nextNode4));
		
		var choice6 = new PlayerInteraction(MyChoiceLabels.Steal2.toString(), MyStoryEntities.npc2, Icons.kneel, "Pickpocket");
		var nextNode6 = get(MyNodeLabels.PickPocket2.toString());
		node.add(new Edge(choice6, nextNode6));
		
		var choice7 = new PlayerInteraction(MyChoiceLabels.Kill2.toString(), MyStoryEntities.npc2, Icons.skull, "Mug");
		var nextNode7 = get(MyNodeLabels.Kill2.toString());
		node.add(new Edge(choice7, nextNode7));
		
		var choice9 = new PlayerInteraction(MyChoiceLabels.Wish.toString(), MyStoryEntities.fountain, Icons.star, "Wish to the well ~Reqiures Cursed Book~");
		var nextNode9 = get(MyNodeLabels.Wish.toString());
		node.add(new Edge(choice9, nextNode9));
		
		var choice10 =  new PlayerInteraction(MyStoryEntities.player, MyChoiceLabels.Relocated12.toString(), MyStoryEntities.cityexit);
		var nextNode10 = get(MyNodeLabels.Crossroads.toString());
		node.add(new Edge(choice10, nextNode10));;
		
	}
	
	@BuilderMethod
	public void AppleTalk1() { 
		var node = get(MyNodeLabels.AppleTalk1.toString());
		node.clearEdges();
		var choice1 = new DialogChoice("Yes");
		var nextNode1 = get(MyNodeLabels.AppleTalkYes1.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("No");
		var nextNode2 = get(MyNodeLabels.AppleTalkNo1.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void AppleTalkYes1() { 
			var node = get(MyNodeLabels.AppleTalkYes1.toString());
			node.clearEdges();
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.CityAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void AppleTalkNo1() { 
			var node = get(MyNodeLabels.AppleTalkNo1.toString());
			node.clearEdges();
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.CityAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	
	@BuilderMethod
	public void BreadTalk1() { 
		var node = get(MyNodeLabels.BreadTalk1.toString());
		node.clearEdges();
		var choice1 = new DialogChoice("Yes");
		var nextNode1 = get(MyNodeLabels.BreadTalkYes1.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("No");
		var nextNode2 = get(MyNodeLabels.BreadTalkNo1.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void BreadTalkYes1() { 
		var node = get(MyNodeLabels.BreadTalkYes1.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.CityAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void BreadTalkNo1() { 
		var node = get(MyNodeLabels.BreadTalkNo1.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.CityAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void GrapeTalk1() { 
		var node = get(MyNodeLabels.GrapesTalk1.toString());
		var choice1 = new DialogChoice("Yes");
		var nextNode1 = get(MyNodeLabels.GrapesTalkYes1.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("No");
		var nextNode2 = get(MyNodeLabels.GrapesTalkNo1.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	@BuilderMethod
	public void GrapeTalkYes1() { 
		var node = get(MyNodeLabels.GrapesTalkYes1.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.CityAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void GrapeTalkNo1() { 
		var node = get(MyNodeLabels.GrapesTalkNo1.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.CityAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void BlackSmithNared() { 
		var node = get(MyNodeLabels.BlacksmithNar.toString());
		var choice1 = new CloseNarrationChoice();
		var nextNode1 = get(MyNodeLabels.BlacksmithAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void BlackSmithActed() { 
		var node = get(MyNodeLabels.BlacksmithAct.toString());
		var choice1 = new PlayerInteraction(MyChoiceLabels.Relocated6.toString(), MyStoryEntities.Blackreturndoor, Icons.door, "Go to City");
		var nextNode1 = get(MyNodeLabels.CityNar.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void PickPocket2() {
		var node = get(MyNodeLabels.PickPocket2.toString());
		node.clearEdges();
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.CityAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void Kill2() {
		var node = get(MyNodeLabels.Kill2.toString());
		node.clearEdges();
		var choice1 = new DialogChoice("Win");
		var nextNode1 = get(MyNodeLabels.CityAct.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Lose");
		var nextNode2 = get(MyNodeLabels.Youdied.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	@BuilderMethod
	public void AlchemistNarration() {
		var node = get(MyNodeLabels.AlchemistNar.toString());
		var choice1 = new CloseNarrationChoice();
		var nextNode1 = get(MyNodeLabels.AlchemistAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void AlchemistActions() {
		var node = get(MyNodeLabels.AlchemistAct.toString());
		var choice1 = new PlayerInteraction(MyChoiceLabels.Relocated9.toString(), MyStoryEntities.WhichreturnDoor, Icons.door, "Go to City");
		var nextNode1 = get(MyNodeLabels.CityNar.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.WhichTalk1.toString(), MyStoryEntities.alchemist, Icons.darkmagic, "Speak to Alchemist");
		var nextNode2 = get(MyNodeLabels.WhichTalk.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	@BuilderMethod
	public void WhichTalk() { 
		var node = get(MyNodeLabels.WhichTalk.toString());
		var choice1 = new DialogChoice("Yes");
		var nextNode1 = get(MyNodeLabels.WhichTalkYes.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("No");
		var nextNode2 = get(MyNodeLabels.WhichTalkNo.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	
	@BuilderMethod
	public void WhichTalkYes() { 
		var node = get(MyNodeLabels.WhichTalkYes.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.AlchemistAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void WhichTalkNo() { 
		var node = get(MyNodeLabels.WhichTalkNo.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.AlchemistAct.toString());
		node.add(new Edge(choice1, nextNode1));
	}

	
	@BuilderMethod
	public void DungeonActions() {
		var node = get(MyNodeLabels.Youdied.toString());
		var choice1 = new CloseNarrationChoice();
		var nextNode1 = get(MyNodeLabels.FarmNar.toString());
		node.add(new Edge(choice1, nextNode1));
		
	}	
	
	@BuilderMethod
	public void Wished() {
		var node = get(MyNodeLabels.Wish.toString());
		var choice1 = new CloseNarrationChoice();
		var nextNode1 = get(MyNodeLabels.CityAct.toString());
		node.add(new Edge(choice1, nextNode1));

	}
	
	
	@BuilderMethod
	public void CrossedRoads() {
		var node = get(MyNodeLabels.Crossroads.toString());
		var choice1 = new PlayerInteraction(MyChoiceLabels.Talk.toString(), MyStoryEntities.gaurd, Icons.talk, "Talk to Guard");
		var nextNode1 = get(MyNodeLabels.GuardTalk3.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void GuardTalk3() {
		var node = get(MyNodeLabels.GuardTalk3.toString());
		var choice1 = new DialogChoice("Bribe");
		var nextNode1 = get(MyNodeLabels.GuardBribe3.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Fight");
		var nextNode2 = get(MyNodeLabels.GuardFight3.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	@BuilderMethod
	public void GuardBribe3() {
		var node = get(MyNodeLabels.GuardBribe3.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.Castle.toString());
		node.add(new Edge(choice1, nextNode1));
		

	}

	@BuilderMethod
	public void GuardFight3() {
		var node = get(MyNodeLabels.GuardFight3.toString());
		var choice1 = new DialogChoice("Win");
		var nextNode1 = get(MyNodeLabels.Castle.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Lose");
		var nextNode2 = get(MyNodeLabels.Youdied.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	
	@BuilderMethod
	public void DockNarEdges() {
		var node = get(MyNodeLabels.DockNar.toString());
		var choice = new CloseNarrationChoice();
		var nextNode = get(MyNodeLabels.Dock.toString());
		node.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void DockActEdge() {
		var node = get(MyNodeLabels.Dock.toString());
		var choice1 = new PlayerInteraction(MyChoiceLabels.Talk7.toString(), MyStoryEntities.pirate, Icons.talk, "Talk to the pirate.");
		var nextNode1 = get(MyNodeLabels.DockTalk.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void DockTalk() {
		var node = get(MyNodeLabels.DockTalk.toString());
		var choice1 = new DialogChoice("Yar!");
		var nextNode1 = get(MyNodeLabels.PirateFight1.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("Nar...");
		var nextNode2 = get(MyNodeLabels.No.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void PirateFightTalk() {
		var node = get(MyNodeLabels.PirateFight1.toString());
		var choice1 = new DialogChoice("Win");
		var nextNode1 = get(MyNodeLabels.PirateFight2.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new DialogChoice("Lose");
		var nextNode2 = get(MyNodeLabels.Youdied.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void PirateEnd() {
		var node = get(MyNodeLabels.PirateFight2.toString());
		var choice1 = new CloseNarrationChoice();
		var nextNode1 = get(MyNodeLabels.PirateEnding.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	
	@BuilderMethod
	public void PirateTalk() {
		var node = get(MyNodeLabels.No.toString());
		var choice1 = new DialogChoice("Yes");
		var nextNode1 = get(MyNodeLabels.Arg.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("No");
		var nextNode2 = get(MyNodeLabels.TooBad.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void PirateNo() {
		var node = get(MyNodeLabels.TooBad.toString());
		var choice1 = new DialogChoice("Continue");
		var nextNode1 = get(MyNodeLabels.Dock.toString());
		node.add(new Edge(choice1, nextNode1));
	}	
	@BuilderMethod
	public void PirateYes() {
		var node = get(MyNodeLabels.Arg.toString());
		var choice1 = new DialogChoice("Go to forest");
		var nextNode1 = get(MyNodeLabels.PirateForest.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void PirateForest() {
		var node = get(MyNodeLabels.PirateForest.toString());
		var choice = new CloseNarrationChoice();
		var nextNode = get(MyNodeLabels.PirateTree.toString());
		node.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void FindTree() {
		var node = get(MyNodeLabels.PirateTree.toString());
		var choice = new PlayerInteraction(MyStoryEntities.player, MyChoiceLabels.Relocate25.toString(), MyStoryEntities.pirateTree);
		var nextNode = get(MyNodeLabels.FindBird.toString());
		node.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void GetBird(){
		var node = get(MyNodeLabels.FindBird.toString());
		var choice = new PlayerInteraction(MyChoiceLabels.TalkToBird.toString(), MyStoryEntities.parrot, Icons.talk, "Talk to Bird");
		var nextNode = get(MyNodeLabels.TalkBird.toString());
		node.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void TalkTuaBird(){
		var node = get(MyNodeLabels.TalkBird.toString());
		var choice = new DialogChoice("Yes");
		var nextNode = get(MyNodeLabels.PirateGoodEnding.toString());
		node.add(new Edge(choice, nextNode));
		var choice1 = new DialogChoice("No");
		var nextNode1 = get(MyNodeLabels.FindBird.toString());
		node.add(new Edge(choice1, nextNode1));
	}
	@BuilderMethod
	public void GiveBird(){
		var node = get(MyNodeLabels.PirateGoodEnding.toString());
		var choice = new PlayerInteraction(MyChoiceLabels.TalkToPirate.toString(), MyStoryEntities.pirate, Icons.talk, "Give Bird to Pirate");
		var nextNode = get(MyNodeLabels.TalkPirateAboutBird.toString());
		node.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void GiveBird2(){
		var node = get(MyNodeLabels.TalkPirateAboutBird.toString());
		var choice = new DialogChoice("Join the pirates");
		var nextNode = get(MyNodeLabels.PirateEnd2.toString());
		node.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void PirateEnd2() {
		var node = get(MyNodeLabels.PirateEnd2.toString());
		var choice1 = new CloseNarrationChoice();
		var nextNode1 = get(MyNodeLabels.PirateEnding.toString());
		node.add(new Edge(choice1, nextNode1));
	}

	@BuilderMethod
	public void AproachKing() {
		var node = get(MyNodeLabels.Castle.toString());
		var choice = new PlayerInteraction(MyChoiceLabels.TalkToKing.toString(), MyStoryEntities.king, Icons.talk, "Talk to the King");
		var nextNode = get(MyNodeLabels.TalkingToKing.toString());
		node.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void TalkTuaKing(){
		var node = get(MyNodeLabels.TalkingToKing.toString());
		var choice = new DialogChoice("I am here to fight you tyrant! This is revenge for rasing my taxes ~500 Health~");
		var nextNode = get(MyNodeLabels.KingFight.toString());
		node.add(new Edge(choice, nextNode));
		var choice1 = new DialogChoice("Hold on there. I just want to buy my land back. ~10000 Coins~");
		var nextNode1 = get(MyNodeLabels.BuyTalk.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("I am here to buy your whole kingdom! ~1000000 Coins~");
		var nextNode2 = get(MyNodeLabels.BuyAllTalk.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	//test
	@BuilderMethod
	public void BuyLandTalk(){
		var node = get(MyNodeLabels.BuyTalk.toString());
		var choice = new DialogChoice("Continue");
		var nextNode = get(MyNodeLabels.CastleWin.toString());
		node.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void BuyAllTalk(){
		var node = get(MyNodeLabels.BuyAllTalk.toString());
		var choice = new DialogChoice("Continue");
		var nextNode = get(MyNodeLabels.CastleWin.toString());
		node.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void KingFightEnd(){
		var node = get(MyNodeLabels.KingFight.toString());
		var choice = new CloseNarrationChoice();
		var nextNode = get(MyNodeLabels.CastleWin.toString());
		node.add(new Edge(choice, nextNode));
	}
	/*
	public void atCity() {
		var node = get(MyNodeLabels.City.toString());

		var choice1 = new PlayerInteraction(MyChoiceLabels.BeggingSpot.toString(), MyStoryEntities.npc1, Icons.coins, "Go to the Begging Spot");
		var nextNode1 = get(MyNodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(MyChoiceLabels.GeneralStore.toString(), MyStoryEntities.merchant, Icons.door, "Go to the General Store");
		var nextNode2 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(MyChoiceLabels.AlchemyStore.toString(), MyStoryEntities.alchemist, Icons.door, "Go to the Alchemy Store");
		var nextNode3 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice3, nextNode3));
		
		var choice4 = new PlayerInteraction(MyChoiceLabels.Forest.toString(), MyStoryEntities.apple, Icons.tree, "Go to the Forest");
		var nextNode4 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice4, nextNode4));
		
		var choice5 = new PlayerInteraction(MyChoiceLabels.Docks.toString(), MyStoryEntities.compass, Icons.ship, "Go to the Docks");
		var nextNode5 = get(MyNodeLabels.GeneralStore.toString());
		node.add(new Edge(choice5, nextNode5));
		
		var choice6 = new PlayerInteraction(MyChoiceLabels.Blacksmith.toString(), MyStoryEntities.blacksmith, Icons.anvil, "Go to the Blacksmith");
		var nextNode6= get(MyNodeLabels.Blacksmith.toString());
		node.add(new Edge(choice6, nextNode6));
		
		var choice7 = new PlayerInteraction(MyChoiceLabels.Castle.toString(), MyStoryEntities.gaurd, Icons.bridge, "Go to the Castle");
		var nextNode7 = get(MyNodeLabels.Gate.toString());
		node.add(new Edge(choice7, nextNode7));
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
		node.add(new Edge(choice3, nextNode3));
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
		var nextNode2 = get(MyNodeLabels.Dock.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	public void Arg() {
		var node = get(MyNodeLabels.Arg.toString());

		var choice1 = new DialogChoice("Investigate the forest");
		var nextNode1 = get(MyNodeLabels.Forest2.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new DialogChoice("Go Home");
		var nextNode2 = get(MyNodeLabels.City.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	public void Dungeon() {
		var node = get(MyNodeLabels.Dungeon.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.FightPrisoner.toString(), MyStoryEntities.npc2, Icons.swords, "Hey, im going to fight you!!!");
		var nextNode1 = get(MyNodeLabels.FightPrisoner.toString());
		node.add(new Edge(choice1, nextNode1));
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
		var choice1 = new PlayerInteraction(MyChoiceLabels.BegForCoins.toString(), MyStoryEntities.npc1, Icons.coins, "Beg For Coins");
		node.add(new Edge(choice1, nextNode1));

		var nextNode2 = get(MyNodeLabels.BegForCoins.toString());
		var choice2 = new PlayerInteraction(MyChoiceLabels.PickPocket.toString(), MyStoryEntities.npc1, Icons.mug, "Attempt pickpocket");
		node.add(new Edge(choice2, nextNode2));
		
		var nextNode3 = get(MyNodeLabels.Fight.toString());
		var choice3 = new PlayerInteraction(MyChoiceLabels.Fight.toString(), MyStoryEntities.npc1, Icons.sword, "Fight");
		node.add(new Edge(choice3, nextNode3));
		
		var nextNode4 = get(MyNodeLabels.Town1.toString());
		var choice4 = new PlayerInteraction(MyChoiceLabels.Leave.toString(), MyStoryEntities.npc1, Icons.exit, "Go back to town");
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
		var choice = new PlayerInteraction(MyChoiceLabels.Upgrade.toString(), MyStoryEntities.blacksmith, Icons.forge, "Upgrade your weapon.");
		node.add(new Edge(choice, nextNode));
		
		var choice4 = new PlayerInteraction(MyChoiceLabels.goToTown.toString(), MyStoryEntities.npc1, Icons.exit, "Exit Store");
		var nextNode4 = get(MyNodeLabels.Town1.toString());
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
		var choice = new PlayerInteraction(MyChoiceLabels.Upgrade.toString(), MyStoryEntities.alchemist, Icons.book, "Want this old book, its taking up space in my shop?");
		node.add(new Edge(choice, nextNode));
		var choice4 = new PlayerInteraction(MyChoiceLabels.goToTown.toString(), MyStoryEntities.npc1, Icons.exit, "Exit Store");
		var nextNode4 = get(MyNodeLabels.Town1.toString());
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
		var nextNode2 = get(MyNodeLabels.LoudAndObnoxiousTree.toString());
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
		var nextNode2 = get(MyNodeLabels.LoudAndObnoxiousTree.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	@BuilderMethod
	public void Tree() {
		var node = get(MyNodeLabels.LoudAndObnoxiousTree.toString());

		var choice3 = new DialogChoice("Lookign through the spyglass, you see a parrot flying up in the tree.");
		
		var choice1 = new DialogChoice("Grab him?");
		var nextNode1 = get(MyNodeLabels.Dock1.toString());
		node.add(new Edge(choice1, nextNode1));
		var choice2 = new DialogChoice("Go home?");
		var nextNode2 = get(MyNodeLabels.Dock.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	//Jaedan Curcio Code
	public void CastleGate() {
		var node = get(MyNodeLabels.CastleGate.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.CastleGate.toString(), MyStoryEntities.gaurd, Icons.city, "Return to the City");
		var nextNode1 = get(MyNodeLabels.City.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.CastleGate.toString(), MyStoryEntities.gaurd, Icons.coins, "Bribe the Gaurd");
		var nextNode2 = get(MyNodeLabels.BribeTheGuard1.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(MyChoiceLabels.CastleGate.toString(), MyStoryEntities.gaurd, Icons.draw, "Fight the Gaurd");
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
		
		var choice = new DialogChoice("Progress to next room");
		var nextNode = get(MyNodeLabels.MainHallUnsafe.toString());
		
		node.add(new Edge(choice, nextNode));
	}
	
	public void MainHall1() {
		var node = get(MyNodeLabels.MainHallUnsafe.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe.toString(), MyStoryEntities.gaurd, Icons.coins, "Bribe the Gaurd");
		var nextNode1 = get(MyNodeLabels.BribeTheGuard2.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe.toString(), MyStoryEntities.gaurd, Icons.draw, "Fight the Gaurd");
		var nextNode2 = get(MyNodeLabels.FightTheGuard.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	public void GuardBribe2() {
		var node = get(MyNodeLabels.BribeTheGuard2.toString());
		
		var choice = new DialogChoice("Progress to next room");
		var nextNode = get(MyNodeLabels.MainHallUnsafe2.toString());
		
		node.add(new Edge(choice, nextNode));
	}
	
	public void MainHall2() {
		var node = get(MyNodeLabels.MainHallUnsafe2.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe2.toString(), MyStoryEntities.gaurd, Icons.coins, "Bribe the Gaurd");
		var nextNode1 = get(MyNodeLabels.BribeTheGuard3.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe2.toString(), MyStoryEntities.gaurd, Icons.draw, "Fight the Gaurd");
		var nextNode2 = get(MyNodeLabels.FightTheGuard.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	public void GuardBribe3() {
		var node = get(MyNodeLabels.BribeTheGuard3.toString());
		
		var choice = new DialogChoice("Progress to next room");
		var nextNode = get(MyNodeLabels.MainHallUnsafe3.toString());
		
		node.add(new Edge(choice, nextNode));
	}
	public void MainHall3() {
		var node = get(MyNodeLabels.MainHallUnsafe3.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe3.toString(), MyStoryEntities.gaurd, Icons.coins, "Bribe the Gaurd");
		var nextNode1 = get(MyNodeLabels.BribeTheGuard4.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.MainHallUnsafe3.toString(), MyStoryEntities.gaurd, Icons.draw, "Fight the Gaurd");
		var nextNode2 = get(MyNodeLabels.FightTheGuard.toString());
		node.add(new Edge(choice2, nextNode2));
	}
	
	public void GuardBribe4() {
		var node = get(MyNodeLabels.BribeTheGuard4.toString());
		
		var choice = new DialogChoice("Progress to Throne Room");
		var nextNode = get(MyNodeLabels.ThroneRoom.toString());
		
		node.add(new Edge(choice, nextNode));
	}
	
	public void atThroneRoom() {
		var node = get(MyNodeLabels.ThroneRoom.toString());
		
		var choice1 = new PlayerInteraction(MyChoiceLabels.ThroneRoom.toString(), MyStoryEntities.king, Icons.coins, "Buy your land back");
		var nextNode1 = get(MyNodeLabels.LandEnding.toString());
		node.add(new Edge(choice1, nextNode1));
		
		var choice2 = new PlayerInteraction(MyChoiceLabels.FightKing.toString(), MyStoryEntities.king, Icons.draw, "Fight the King");
		var nextNode2 = get(MyNodeLabels.FightKing.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(MyChoiceLabels.ThroneRoom.toString(), MyStoryEntities.king, Icons.castle, "Buy the kingdom");
		var nextNode3 = get(MyNodeLabels.BuyKingdom.toString());
		node.add(new Edge(choice3, nextNode3));
	   
	
	}
	
	public void KingFight() {
		var node = get(MyNodeLabels.FightKing.toString());
		
		var choice1 = new DialogChoice("You won!");
		var nextNode = get(MyNodeLabels.LandEnding.toString());
		
		node.add(new Edge(choice1, nextNode));
		
	}
	
	public void BuyKingdom() {
		var node = get(MyNodeLabels.BuyKingdom.toString());
		var choice = new DialogChoice("Buy the Kingdom");
		var nextNode = get(MyNodeLabels.KindomEnding.toString());
		
		node.add(new Edge(choice, nextNode));
	}
	*/
}
