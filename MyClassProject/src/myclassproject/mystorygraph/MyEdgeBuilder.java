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
		var node = get(MyNodeLabels.root.toString());
		var nextNode = get(MyNodeLabels.Town.toString());
		var choice = new PlayerInteraction(ChoiceLabels.GoToCity.toString(), npc1, Icons.talk, "Head into the city to get money, you look broke.");
		node.add(new Edge(choice, nextNode));
	}
	
	@BuilderMethod
	public void atTown() {
		var node = get(NodeLabels.atCottage.toString());
		var nextNode = get(NodeLabels.banditTalk.toString());
		var nextNode = get(NodeLabels.banditTalk.toString());
		var nextNode = get(NodeLabels.banditTalk.toString());
		var choice = new PlayerInteraction(ChoiceLabels.TalkToBandit.toString(), bandit, Icons.talk,
					"Talk to the questgiver.");
		node.add(new Edge(choice, nextNode));
	}
	public void at Town() {
		var node = get(NodeLabels.Town.toString());

		var choice1 = new KeyboardChoice(KeyboardChoice.Keys.Inventory);
		var nextNode1 = get(NodeLabels.inventory.toString());
		node.add(new Edge(choice1, nextNode1));

		var choice2 = new PlayerInteraction(ChoiceLabels.Leave.toString(), cottageDoor, Icons.exit, "Go to the city");
		var nextNode2 = get(NodeLabels.atCity.toString());
		node.add(new Edge(choice2, nextNode2));
		
		var choice2 = new PlayerInteraction(ChoiceLabels.Leave.toString(), cottageDoor, Icons.exit, "Go to the city");
		var nextNode2 = get(NodeLabels.atCity.toString());
		node.add(new Edge(choice2, nextNode2));
	}
}
