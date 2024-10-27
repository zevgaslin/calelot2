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
	public void rootEdges() {
		//Example:
		//var root = get(NodeLabels.root.toString());
		//var choice = new MenuChoice(MenuChoice.Options.Start);
		//var nextNode = get(NodeLabels.atCottage.toString());
		//root.add(new Edge(choice, nextNode));
	}
	@BuilderMethod
	public void atTown() {
		var node = get(NodeLabels.Town.toString());

		var choice1 = new CloseNarrationChoice(ChoiceLabels.Wall.toString(), campLog, Icons.coins, "Go to the Begging Spot");
		var nextNode1 = get(NodeLabels.BeggingSpot.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.GeneralStore.toString(), campStall, Icons.door, "Go to the General Store");
		var nextNode2 = get(NodeLabels.TownGeneralStore.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(ChoiceLabels.Gate.toString(), campExit, Icons.bridge, "Go to the City");
		var nextNode3 = get(NodeLabels.Gate.toString());
		node.add(new Edge(choice3, nextNode3));
	}
	

	@BuilderMethod
	public void atTownGeneralStore() {
		var node = get(NodeLabels.GeneralStoreActions.toString());

		var choice1 = new PlayerInteraction(ChoiceLabels.Apple.toString(), storageBarrel , Icons.apple, "Purchase Apple ");
		var nextNode1 = get(NodeLabels.Apple.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.Twinkie.toString(), storageChest, Icons.bread, "Purchase Twinkie");
		var nextNode2 = get(NodeLabels.Twinkie.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice3 = new PlayerInteraction(ChoiceLabels.VerySourGrapes.toString(), storageShelf, Icons.chickenleg, "Purchase Very Sour Grapes");
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
	
	
	
}
