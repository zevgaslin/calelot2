package myclassproject.mystorygraph;


import com.entities.*;
import com.enums.*;
import com.entities.Characters;
import com.entities.Furniture;
import com.entities.Item;
import com.entities.Place;
import com.enums.BodyTypes;
import com.enums.Clothing;
import com.enums.Colors;
import com.enums.FurnitureTypes;
import com.enums.HairStyle;
import com.enums.ItemTypes;
import com.enums.PlaceTypes;

public final class MyStoryEntities {
	//Create an instance of Character, Place, Furniture, and Item classes 
	//for each of the characters, places, furniture, and items in your story
	//Make that instance public static final
	//e.g. public static final Characters player = new Characters("Player", BodyTypes.D, Clothing.Peasant, HairStyle.Short, Colors.Black, 6);
	//You can access these instances in your EdgeBuilder and NodeBuilder classes by importing:
	//import static myclassproject.mystorygraph.MyStoryEntities.*;

	//Test

	
	public static final Place town = new Place("Town", PlaceTypes.Camp);
	public static final Place farm = new Place("Farm", PlaceTypes.Farm);
	public static final Place city = new Place("City", PlaceTypes.City);
	public static final Place dungeon = new Place("Dungeon", PlaceTypes.Dungeon);
	public static final Place forestPath = new Place("ForestPath", PlaceTypes.ForestPath);
	public static final Place ruins = new Place("Ruins", PlaceTypes.Ruins);
	public static final Place alchemyShop = new Place("AlchemyShop", PlaceTypes.AlchemyShop);
	public static final Place blackSmith = new Place("BlackSmith", PlaceTypes.Blacksmith);
	public static final Place castleCrossroads = new Place("CastleCrossroads", PlaceTypes.CastleCrossroads);
	public static final Place hallway = new Place("Hallway", PlaceTypes.Hallway);
	public static final Place greatHall = new Place(" GreatHall", PlaceTypes.GreatHall);
	public static final Place port = new Place("Port", PlaceTypes.Port);
	public static final Place storage = new Place("Storage", PlaceTypes.Storage);
	public static final Place bridge = new Place("Bridge", PlaceTypes.Bridge);
	public static final Item sword = new Item("Sword", ItemTypes.Sword);
	public static final Item coin = new Item("Coin", ItemTypes.Coin);
	public static final Item evilBook = new Item("EvilBook", ItemTypes.EvilBook);
	public static final Item magnifyingGlass = new Item("MagnifyingGlass", ItemTypes.MagnifyingGlass);
	public static final Item apple = new Item("Apple", ItemTypes.Apple);
	public static final Item bread = new Item("Bread", ItemTypes.Bread);
	public static final Item grapes = new Item("Grapes", ItemTypes.PurplePotion);
	public static final Item compass = new Item("Compass", ItemTypes.Compass);
	public static final Characters player = new Characters("Player", BodyTypes.D, Clothing.Peasant, HairStyle.Short, Colors.Black, 6);
	public static final Characters bandit = new Characters("Bandit", BodyTypes.F, Clothing.Bandit, HairStyle.Bald, Colors.Black, 4);
	public static final Characters npc1 = new Characters("NPC1", BodyTypes.F, Clothing.Peasant, HairStyle.Spiky, Colors.Black, 4);
	public static final Characters npc2 = new Characters("NPC2", BodyTypes.H, Clothing.Peasant, HairStyle.Short, Colors.Black, 4);
	public static final Characters blacksmith = new Characters("Blacksmith", BodyTypes.D, Clothing.LightArmour, HairStyle.Mage_Full, Colors.Black, 4);
	public static final Characters alchemist = new Characters("Alchemist", BodyTypes.C, Clothing.Merchant, HairStyle.Ponytail, Colors.Brown, 4);
	public static final Characters king = new Characters("King", BodyTypes.B, Clothing.King, HairStyle.Short, Colors.Black, 4);
	public static final Characters gaurd = new Characters("Gaurd", BodyTypes.F, Clothing.HeavyArmour, HairStyle.Bald, Colors.Black, 4);
	public static final Characters pirate = new Characters("Pirate", BodyTypes.H, Clothing.Peasant, HairStyle.Musketeer_Full, Colors.Brown, 4);
	public static final Characters merchant = new Characters("Merchant", BodyTypes.B, Clothing.Merchant, HairStyle.Long, Colors.Brown, 4);
	public static final Furniture farmExit = new Furniture(farm, FurnitureTypes.Exit);
	public static final Furniture townStall = new Furniture(town, FurnitureTypes.Stall);
	public static final Furniture townLog = new Furniture(town, FurnitureTypes.RightLog);
	public static final Furniture SouthEnd = new Furniture(bridge, FurnitureTypes.SouthEnd);


}