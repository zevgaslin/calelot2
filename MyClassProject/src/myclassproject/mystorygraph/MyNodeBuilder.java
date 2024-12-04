package myclassproject.mystorygraph;

import java.util.List;
//import myclassproject.mystorygraph.MyNodeLabels;
//import myclassproject.mystorygraph.FadeOut;
//import myclassproject.mystorygraph.HideNarration;
//import myclassproject.mystorygraph.SetPosition;


import static myclassproject.mystorygraph.MyStoryEntities.*;
//import static myclassproject.questexample.QuestStoryEntities.cottage;
//import static myclassproject.questexample.QuestStoryEntities.player;

import com.storygraph.*;

import java.util.List;
import com.actions.*;
import com.actions.utility.ShowCredits;
import com.sequences.*;
//import myclassproject.questexample.NodeLabels;

public class MyNodeBuilder extends NodeBuilder {
	public MyNodeBuilder(List<Node> list) {
		super(list);
	}

	/**
	 * Write a method for each node. Use get to get a reference to the node using
	 * its label. The method adds Camelot actions that execute in order when
	 * visiting that node. These methods must have a BuilderMethod annotation.
	 */

	
// Joshua Haddad
	@BuilderMethod
	public void rootActions() {
		var root = get(MyNodeLabels.root.toString());
		root.clearSequence();
		root.add(new CreateAll(List.of(farm, town, city, blackSmith, castleCrossroads, port, ruins, greatHall,
				forestPath, dungeon, alchemyShop, hallway, storage, sword, coin, evilBook, apple, bread, grapes, magnifyingGlass, bird, parrot))
				.add(new CreateCharacterSequence(player)).add(new CreateCharacterSequence(bandit))
				.add(new CreateCharacterSequence(npc1)).add(new CreateCharacterSequence(npc2))
				.add(new CreateCharacterSequence(blacksmith)).add(new CreateCharacterSequence(alchemist))
				.add(new CreateCharacterSequence(king)).add(new CreateCharacterSequence(gaurd))
				.add(new CreateCharacterSequence(pirate)).add(new CreateCharacterSequence(merchant))
				.add(new SetPosition(bandit, dungeon))
				.add(new SetPosition(npc1, town)).add(new SetPosition(npc2, town))
				.add(new SetPosition(blacksmith, blackSmith)).add(new SetPosition(alchemist, alchemyShop))
				.add(new SetPosition(king, greatHall))
				.add(new SetPosition(gaurd, bradge))
				.add(new SetPosition(pirate, port)).add(new SetCameraFocus(player))
				.add(new SetPosition(merchant, storage))
		.add(new SetPosition(merchant, storage)).add(new SetPosition(bandit, dungeon)).add(new ShowMenu()));
	}
	//test
// Joshua Haddad
	@BuilderMethod
	public void FarmNarration() {
		var node = get(MyNodeLabels.FarmNar.toString());
		node.add(new FadeOut()).add(new SetPosition(player, farm)).add(new HideMenu()).add(new HideNarration()).add(new FadeIn())
		.add(new NarrationSequence("The evil king Bartholomew hath raised taxes upon thy farm, and you could not afford the new fees. As such, Bartholomew sent his goons to repossess your family farm! You awaken at the front of your empty farm, your family gone after you could no longer provide for them. If you want to get your family and your life back, you must get to the king and take back everything that was taken from you. You have 10 health and 0 coins. When you see this sign: '~', an action is mandatory. You know what to do next. \n"));
			}
	@BuilderMethod
	public void FarmActions() {
		var node = get(MyNodeLabels.FarmAct.toString());
		node.add(new HideNarration()).add(new EnableInput());
			}
	@BuilderMethod
	public void TownActions() {
		var node = get(MyNodeLabels.Town1.toString());
		node.add(new HideDialog()).add(new SetPosition(npc1, townStall)).add(new SetPosition(npc2, townLog)).add(new FadeOut()).add(new SetPosition(player, town)).add(new FadeIn());
			}
	@BuilderMethod 
	public void returntoTown() {
		var node = get(MyNodeLabels.Town2.toString());
		node.add(new HideDialog()).add(new HideDialog()).add(new HideNarration());
	}


		//Town general Store
	@BuilderMethod
	public void AppleTalk() {
		var node= get(MyNodeLabels.AppleTalk.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Would you like to purchase this apple for 1 coin"),List.of ("Yes","No")));
	}
	
	@BuilderMethod
	public void AppleTalkYes() {
		var node= get(MyNodeLabels.AppleTalkYes.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Wonderful"),List.of ("Continue"))).add(new Take(player, apple, npc1));
	}
	@BuilderMethod
	public void AppleTalkNo() {
		var node= get(MyNodeLabels.AppleTalkNo.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Then scram"),List.of ("Continue")));
	}

	
	@BuilderMethod
	public void BreadTalk() {
		var node= get(MyNodeLabels.BreadTalk.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Would you like to purchase this fresh bread for 5 coins"),List.of ("Yes","No")));
	}
	
	
	@BuilderMethod
	public void BreadTalkYes() {
		var node= get(MyNodeLabels.BreadTalkYes.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Wonderful"),List.of ("Continue"))).add(new Take(player, bread, npc1));
	}
	@BuilderMethod
	public void BreadTalkNo() {
		var node= get(MyNodeLabels.BreadTalkNo.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Then scram!"),List.of ("Continue")));
	}
	
	@BuilderMethod
	public void GrapesTalk() {
		var node= get(MyNodeLabels.GrapesTalk.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Would you like to purchase these scrumptious grapes for 10 coins"),List.of ("Yes","No")));
	}
	
	@BuilderMethod
	public void GrapesTalkYes() {
		var node= get(MyNodeLabels.GrapesTalkYes.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Wonderful"),List.of ("Continue"))).add(new Take(player, grapes, npc1));
	}
	@BuilderMethod
	public void GrapesTalkNo() {
		var node= get(MyNodeLabels.GrapesTalkNo.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Then scram!"),List.of ("Continue")));
	}
	
	//NPC 2
	
	@BuilderMethod
	public void PickPocket() {
		var node= get(MyNodeLabels.PickPocket1.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new WalkTo(player,npc2)).add(new Take(player, coin, npc2)).add(new DialogSequence(player, npc2, List.of("What a Lovely Day! (Pickpocket 20 coins)"),List.of ("Continue")));
	} 
	@BuilderMethod
	public void Kill() {
		var node= get(MyNodeLabels.Kill1.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new WalkTo(player,npc2)).add(new DialogSequence(player, npc2, List.of("A scuffle ensues ~10 Health Required to Win & Escape~","Reward: 20 Coins"),List.of ("Win","Lose"))).add(new Attack(player,npc2,true));
	}

	
	//Bridge
	
	@BuilderMethod
	public void Bradge() {
		var node= get(MyNodeLabels.Bradge.toString());		
		node/*.add(new SetPosition(gaurd, EastEnd))*/.add(new FadeOut()).add(new SetPosition(player, bradge)).add(new FadeIn())
		.add(new HideDialog()).add(new HideNarration());
	}
	
	
	@BuilderMethod
	public void GuardTalk() {
		var node= get(MyNodeLabels.GuardTalk.toString());		
		node.add(new HideDialog()).add(new WalkTo(player,gaurd))
		.add(new DialogSequence(player, gaurd, List.of("Halt!!! Pay me 20 coins to pass"),List.of("Fine","No")));
	}
		
	@BuilderMethod
	public void guardTalkYes() {
		var node= get(MyNodeLabels.GuardTalkYes.toString());		
		node.add(new HideDialog()).add(new DialogSequence(player, gaurd, List.of("Thanks"),List.of ("Continue")));
	}
	@BuilderMethod
	public void guardTalkNo() {
		var node= get(MyNodeLabels.GuardTalkNo.toString());		
		node.add(new HideDialog()).add(new DialogSequence(player, gaurd, List.of("Then scram!"),List.of ("Continue")));
	}
	
	
	
//Zev Gaslin
	@BuilderMethod
	public void CityNar() {
		var node = get(MyNodeLabels.CityNar.toString());
		node.add(new HideDialog()).add(new DisableInput()).add(new FadeOut()).add(new SetPosition(npc1 , Plant)).add(new SetPosition(npc2, city, "Alley")).add(new SetPosition(player, city)).add(new FadeIn())
		.add(new NarrationSequence(
				"As you pass through the pearly gates, you are taken aback by the hustle and bustle of the beautiful Camelot City. You are excited by the prospect of exploring every corner of the mysterious new location, but you know you must focus on your ultimate goal; getting your land back.\n"));
	}
	@BuilderMethod
	public void CityAct() {
		var node = get(MyNodeLabels.CityAct.toString());
		node.add(new HideDialog()).add(new HideNarration()).add(new EnableInput());
		
	}
	
	@BuilderMethod
	public void AppleTalk1() {
		var node= get(MyNodeLabels.AppleTalk1.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Oh, hi! nice to see you again. Would you like to purchase this delicious apple for 1 coin"),List.of ("Yes","No")));
	}
	
	@BuilderMethod
	public void AppleTalkYes1() {
		var node= get(MyNodeLabels.AppleTalkYes1.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Wonderful"),List.of ("Continue"))).add(new Take(player, apple, npc1));
	}
	@BuilderMethod
	public void AppleTalkNo1() {
		var node= get(MyNodeLabels.AppleTalkNo1.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Then scram!"),List.of ("Continue")));
	}

	
	@BuilderMethod
	public void BreadTalk1() {
		var node= get(MyNodeLabels.BreadTalk1.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Oh, hi! Nice to see you again. Would you like to purchase this crispy bread for 5 coins"),List.of ("Yes","No")));
	}
	
	
	@BuilderMethod
	public void BreadTalkYes1() {
		var node= get(MyNodeLabels.BreadTalkYes1.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Wonderful"),List.of ("Continue"))).add(new Take(player, bread, npc1));
	}
	@BuilderMethod
	public void BreadTalkNo1() {
		var node= get(MyNodeLabels.BreadTalkNo1.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Then scram!"),List.of ("Continue")));
	}
	
	@BuilderMethod
	public void GrapesTalk1() {
		var node= get(MyNodeLabels.GrapesTalk1.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Oh, hi! Nice to see you again. Would you like to purchase these juicy grapes for 10 coins"),List.of ("Yes","No")));
	}
	
	@BuilderMethod
	public void GrapesTalkYes1() {
		var node= get(MyNodeLabels.GrapesTalkYes1.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("Wonderful"),List.of ("Continue"))).add(new Take(player, grapes, npc1));
	}
	@BuilderMethod
	public void GrapesTalkNo1() {
		var node= get(MyNodeLabels.GrapesTalkNo1.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new DialogSequence(player, npc1, List.of("I hate you. You are the bane of my existence. You can't afford grapes? Seriously? I just saw you rob that guy for like 20 coins, and you can't give me 10 for some grapes? Are you kidding me? You disgust me, get out of my sight."),List.of ("Continue")));
	}
	
	@BuilderMethod
	public void BlackSmithNar() {
		var node = get(MyNodeLabels.BlacksmithNar.toString());
		node.add(new FadeOut()).add(new SetPosition(player, blackSmith)).add(new FadeIn())
		.add(new NarrationSequence(
				"The smell of fire fills your nostrils as you enter the blacksmiths shop. 'Welcome to my humble forge', says the Blacksmith. 'Please, let me know if you would like to purchase any of my wares'."));
		
	}

	@BuilderMethod
	public void BlackSmithAct() {
		var node = get(MyNodeLabels.BlacksmithAct.toString());
		node.add(new HideNarration())
	.add(new Face(blacksmith, player))
	.add(new Face(player, blacksmith))
	.add(new Draw(player, sword))
	.add(new Take(blacksmith, sword, player))
	.add(new Dance(blacksmith))
	.add(new Give(blacksmith, sword, player));
	}
	//test
	@BuilderMethod
	public void PickPocket2() {
		var node= get(MyNodeLabels.PickPocket2.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new WalkTo(player,npc2)).add(new Take(player, coin, npc2)).add(new DialogSequence(player, npc2, List.of("Oh, you again. What a Lovely Day! (You steal 20 coins)"),List.of ("Continue")));
	} 
	@BuilderMethod
	public void Kill2() {
		var node= get(MyNodeLabels.Kill2.toString());		
		node.clearSequence();
		node.add(new HideDialog()).add(new WalkTo(player,npc2)).add(new Attack(player,npc2,true))
		.add(new DialogSequence(player, npc2, List.of("A scuffule ensues ~20 Health Required to Win & Escape~","Reward: 100 Coins"),List.of ("Win","Lose"))).add(new Attack(player,npc2,true));
	}

	
	@BuilderMethod
	public void AlchemistNar() {
		var node = get(MyNodeLabels.AlchemistNar.toString());
		node.add(new FadeOut())
		.add(new SetPosition(player, alchemyShop))
		.add(new SetPosition(alchemist, Whichloc))
		.add(new Face(alchemist, player))
		.add(new Face(player, alchemist))
		.add(new NarrationSequence(
				"You enter a small, dingy store on the outskirts of town to find a lady brewing potions in a cauldron in the corner of the shop. “What do you want, mortal?”, says the lady, who appears to be the store’s owner."))
		.add(new FadeIn());
		
	}
	@BuilderMethod
	public void AlchemistAct() {
		var node = get(MyNodeLabels.AlchemistAct.toString());
		node.add(new HideNarration()).add(new HideDialog());
	}
	@BuilderMethod
	public void WhichTalk() {
		var node = get(MyNodeLabels.WhichTalk.toString());
		node.add(new HideDialog()).add(new WalkTo(player,alchemist)).add(new DialogSequence(player, alchemist, List.of("Would you like a cursed book? ~Warning, may be cursed~"),List.of ("Yes","No")));
	}
	@BuilderMethod
	public void WhichTalkYes() {
		var node = get(MyNodeLabels.WhichTalkYes.toString());
		node.add(new HideDialog()).add(new DialogSequence(player, alchemist, List.of("HeHeHeHeHeHe"),List.of ("Continue"))).add(new Take(player, evilBook, alchemist));

	}
	@BuilderMethod
	public void WhichTalkNo() {
		var node = get(MyNodeLabels.WhichTalkNo.toString());
		node.add(new HideDialog()).add(new DialogSequence(player, alchemist, List.of("Aw Shucks"),List.of ("Continue")));
	}
	
	@BuilderMethod
	public void Wish() {
		var node = get(MyNodeLabels.Wish.toString());
		node.add(new HideDialog()).add(new DisableInput()).add(new WalkTo(player, fountain)).add(new NarrationSequence("The Fountain explodes into a brilliant light ~You recieve 100 BILLION COINS~")).add(new Pickup(player, coin));
	}
	
	@BuilderMethod
	public void DungeonNar() {
		var node = get(MyNodeLabels.Youdied.toString());
		node.add(new HideDialog()).add(new FadeOut()).add(new SetPosition(player,dungeon)).add(new NarrationSequence(
				"You awaken in a cage in the middle of a damp, dark room. You can barely make out the faces of one other prisoner in the dim light of the candlestick on the warden’s desk. You decide its best to use your magic time travel powers to go back to right when you lost your farm"))
		.add(new FadeIn());
	}
	@BuilderMethod
	public void Crossroads() {
		var node = get(MyNodeLabels.Crossroads.toString());
		node.add(new HideDialog()).add(new FadeOut()).add(new SetPosition(player,castleCrossroads))
		.add(new FadeIn());
	
	}
	
	@BuilderMethod
	public void DockNar() {
		var node = get(MyNodeLabels.DockNar.toString());
		//node.add(new SetPosition(npc1, port, "BigStall"));
		node.add(new HideDialog()).add(new FadeOut()).add(new SetPosition(player, port)).add(new SetPosition(pirate, Bigship)).add(new FadeIn()).add(new NarrationSequence("You are greeted by the smell of sea mist and rum as you enter the dock at the edge of town. \nYou see an intimidating swashbuckler sitting by his ship, as well as local city goers fishing off of the dock. \n"));
	}
	@BuilderMethod
	public void DockAct() {
		var node = get(MyNodeLabels.Dock.toString());
		node.add(new HideNarration()).add(new HideDialog()).add(new EnableInput());
	}
	@BuilderMethod
	public void DockDialouge() {
		var node = get(MyNodeLabels.DockTalk.toString());
		node.add(new HideDialog()).add(new DialogSequence(player, pirate, List.of("Argh! Are ye a pirate?"), List.of("Yar!","Nar...")));
	}
	@BuilderMethod
	public void PirateFightTalk() {
		var node = get(MyNodeLabels.PirateFight1.toString());
		node.add(new SetPosition(pirate, port, "BigShip"));
		node.add(new DialogSequence(player, pirate,List.of("I do not believe ye landlubber! Face me in combat to prove your pirate prowess!"),List.of("Win","Lose")));
		
	}
	@BuilderMethod
	public void PirateFightAct() {
		var node = get(MyNodeLabels.PirateFight2.toString());
		node.add(new HideDialog()).add(new Face(pirate, player)).add(new Draw(pirate, sword)).add(new Draw(player, sword)).add(new Attack(player, pirate, true)).add(new Die(pirate));
		node.add(new NarrationSequence("Congrats you have bested the pirate captain in fair combat! Arg! Ye are a true pirate'"+"You sail away from your past life, with nothing but the open ocean and your new mateys surrounding you. You may not have gotten your farm back, but you’ve found a new purpose exploring and pillaging the seven seas."));
	}
	
	@BuilderMethod
	public void PirateWin() {
		var node = get(MyNodeLabels.PirateEnding.toString());
		node.add(new HideNarration());
		node.add(new ShowCredits());
	}
	
	
	@BuilderMethod
	public void NoActions() {
		var node = get(MyNodeLabels.No.toString());
		node.add(new DialogSequence(player, pirate, List.of("Do ye want to be? I could always use some more crew."), List.of("Yes","No")));
	}
	
	@BuilderMethod
	public void TooBadActions() {
		var node = get(MyNodeLabels.TooBad.toString());
		node.add(new DialogSequence(player, pirate, List.of("Then get off me dock land lubber! >:("), List.of("Continue")));
	}
	
	@BuilderMethod
	public void ArgActions() {
		var node = get(MyNodeLabels.Arg.toString());
		node.add(new DialogSequence(player, pirate, List.of("If ye wants to be a pirate first you must go find my lost parrot" + "I think he's somewhere in the forest you should go look for him there"+ "Here this spy glass will help you find him"), List.of("Go to forest")));
	}
	@BuilderMethod
	public void PirateForest() {
		var node = get(MyNodeLabels.PirateForest.toString());
		node.add(new HideDialog()).add(new Face(pirate, player)).add(new Draw(pirate, magnifyingGlass)).add(new Give(pirate,magnifyingGlass,player)).add(new FadeOut()).add(new SetPosition(player,forestPath)).add(new FadeIn()).add(new NarrationSequence("You head into the forest to look for the lost parrot"+"You hear a strange voice coming from that tree in front of you"));	
	}
	@BuilderMethod
	public void PirateTree() {
		var node = get(MyNodeLabels.PirateTree.toString());
		node.add(new HideNarration()).add(new SetPosition(player, forestPath)).add(new EnableInput()).add(new EnableInput());
	}
	@BuilderMethod
	public void FindDaBirb() {
		var node = get(MyNodeLabels.FindBird.toString());
		node.add(new SetPosition(parrot, pirateTree));
	}
	@BuilderMethod
	public void TalkToBirb() {
		var node = get(MyNodeLabels.TalkBird.toString());
		node.add(new Face(parrot,player));
		node.add(new DialogSequence(player, parrot, List.of("Hi my name is Parrot. Can you bring me back to the pirate please"), List.of("Yes","No")));
	}
	@BuilderMethod
	public void PirateGoodEnd() {
		var node = get(MyNodeLabels.PirateGoodEnding.toString());
		node.add(new HideDialog()).add(new FadeOut()).add(new SetPosition(player, Bigship));
		node.add(new SetPosition(pirate, Bigship));
		node.add(new SetPosition(parrot, Bigship));
		node.add(new FadeIn());
		}
	@BuilderMethod
	public void PirateGoodEndTalk() {
		var node = get(MyNodeLabels.TalkPirateAboutBird.toString());
		node.add(new Face(pirate,player));
		node.add(new DialogSequence(player, pirate, List.of("You found my parrot! Thank you!"), List.of("Join Pirates")));
	}
	@BuilderMethod
	public void PirateGoodEndTalkFin() {
		var node = get(MyNodeLabels.PirateEnd2.toString());
		node.add(new NarrationSequence("You sail off into the sunset. The end"));
	}
	


	

	
		
		
		
		
	

	}

/*
//Jaedan Curcio
	@BuilderMethod
	public void TownBeggingActions() {
		var node = get(MyNodeLabels.BeggingSpot.toString());
		node.add(new WalkTo(player, town, "RightLog"));
		node.add(new HideMenu()).add(new EnableInput());
		node.add(new NarrationSequence(
				"While in your begging spot, a citizen crosses your path. Would you like to beg for coins, attempt to fight him, or attempt to pickpocket him?"));
	}

//Joshua Haddad
	@BuilderMethod
	public void TownGeneralStoreActions() {
		var node = get(MyNodeLabels.TownGeneralStore.toString());
		node.add(new NarrationSequence(
				"You enter a small general store tha seems to be falling apart at the seams and smells of mold and must. You approach the manic store owner. Would you like to purchase anything?"));
		node.add(new FadeIn());
		node.add(new Face(merchant, player));
		node.add(new Face(player, merchant));
		node.add(new Draw(player, coin));
		node.add(new Draw(merchant, apple));
		node.add(new Take(merchant, coin, player));
		node.add(new Take(player, apple, merchant));
	}

	@BuilderMethod
	public void GeneralStoreActions() {
		var node = get(MyNodeLabels.GeneralStore.toString());
		node.add(new NarrationSequence(
				"You walk into the city’s general store and are greeted by a cat meowing at your feet. “Ah, welcome!”, says the store’s owner. “Feel free to shop around for as long as you’d like, and let me know if you see anything that strikes your fancy!”"));
		node.add(new FadeIn());
		node.add(new Face(merchant, player));
		node.add(new Face(player, merchant));
		node.add(new Draw(player, coin));
//node.add(new Draw(merchant,bread));
		node.add(new Take(merchant, coin, player));
//node.add(new Take(player,bread,merchant));
	}

	@BuilderMethod
	public void BlacksmithActions() {
		var node = get(MyNodeLabels.Blacksmith.toString());
		node.add(new NarrationSequence(
				"The smell of fire fills your nostrils as you enter the blacksmiths shop. “Welcome to my humble forge”, says the Blacksmith. “Please, let me know if you’d like to purchase any of my wares”."));
		node.add(new FadeIn());
		node.add(new Face(blacksmith, player));
		node.add(new Face(player, blacksmith));
		node.add(new Draw(player, sword));
		node.add(new Take(blacksmith, sword, player));
		node.add(new Dance(blacksmith));
		node.add(new Give(blacksmith, sword, player));
	}

	@BuilderMethod
	public void AlchemyActions() {
		var node = get(MyNodeLabels.Alchemy.toString());
		node.add(new NarrationSequence(
				"You enter a small, dingy store on the outskirts of town to find a lady brewing potions in a cauldron in the corner of the shop. “What do you want, mortal?”, says the lady, who appears to be the store’s owner."));
		node.add(new FadeIn());
		node.add(new Face(alchemist, player));
		node.add(new Face(player, alchemist));
		node.add(new Draw(player, coin));
		node.add(new Draw(alchemist, evilBook));
		node.add(new NarrationSequence("Warning: This book is evil"));
		node.add(new FadeIn());
		node.add(new Take(player, evilBook, alchemist));
	}

	@BuilderMethod
	public void DungeonActions() {
		var node = get(MyNodeLabels.Dungeon.toString());
		node.add(new SetPosition(bandit, dungeon));
		node.add(new NarrationSequence(
				"You awaken in a cage in the middle of a damp, dark room. You can barely make out the faces of one other prisoner in the dim light of the candlestick on the warden’s desk. “Ah it looks another poor unfortunate soul has awoken from his slumber!”, says the warden. “The only way out of here is to fight your way out! If you lose, you die!” You lock eyes with the other prisoner, ready for battle."));
		node.add(new FadeIn());
		node.add(new Face(bandit, player));
		node.add(new Face(player, bandit));
		node.add(new Draw(player, sword));
		node.add(new Draw(bandit, sword));
	}

	@BuilderMethod
	public void FightPrisonerActions() {
		var node = get(MyNodeLabels.Fight.toString());
		node.add(new NarrationSequence(
				"You ready your weapon against this poor prisoner. He looks to have been here for awhile and is fairly weak."));
		node.add(new Attack(player, bandit, true));
		node.add(new Die(bandit));
		node.add(new Dance(player));
		node.add(new NarrationSequence(
				"You knock him down in one blow. You've earned your freedom... but at what cost?"));
		node.add(new SetPosition(player, city));
	}

	@BuilderMethod
	public void gateActions() {
		var node = get(MyNodeLabels.Gate.toString());
//node.add(new SetPosition(gaurd, bridge));
		node.add(new NarrationSequence(
				"You approach a decrepit gate at the edge of town. A large, burly man carrying a sword blocks the exit with his carriage. “Everyone who leaves this town has to go through me. For 20 coins, I’ll take you to the city. If you don’t, get out of my sight.” Do you pay, leave, or take your chances in a fight?"));
		node.add(new Face(gaurd, player));
		node.add(new Face(player, gaurd));
		node.add(new Draw(player, coin));
		node.add(new Take(gaurd, coin, player));
		node.add(new SetPosition(player, city));
	}

	@BuilderMethod
	public void CastleGateActions() {
		var node = get(MyNodeLabels.CastleGate.toString());
		node.add(new SetPosition(gaurd, castleCrossroads));
		node.add(new NarrationSequence(
				"You approach an opulant castle at the edge of the city. There you are faced with a guard standing guard at the moat entrance."));
		node.add(new Face(gaurd, player));
		node.add(new Face(player, gaurd));
		node.add(new Draw(player, coin));
		node.add(new Take(gaurd, coin, player));
		node.add(new SetPosition(player, hallway));
	}

// Jaedan Curcio
	@BuilderMethod
	public void CityBeggingSpotActions() {
		var node = get(MyNodeLabels.BeggingSpot.toString());
		node.add(new WalkTo(player, city, "Alley2"));
		node.add(new HideMenu()).add(new EnableInput());
		node.add(new NarrationSequence(
				"While in your begging spot, a citizen crosses your path. Would you like to beg for coins, attempt to fight him, or attempt to pickpocket him?"));
	}

	@BuilderMethod
	public void FightActions() {
		var node = get(MyNodeLabels.Fight.toString());
		node.add(new Attack(player, npc1, true));
		node.add(new Die(npc1));
		node.add(new Dance(player));
	}

	@BuilderMethod
	public void BegForCoinsActions() {
		var node = get(MyNodeLabels.BegForCoins.toString());
		node.add(new NarrationSequence("The stranger relents, and gives you the coins you asked for."));
	}

	@BuilderMethod
	public void AttemptPickpocketActions() {
		var node = get(MyNodeLabels.AttemptPickPocket.toString());
		node.add(new NarrationSequence(
				"You are caught by the stranger! He draws his sword at you, and prepares to attack!"));
		node.add(new Face(npc1, player)).add(new Draw(npc1, sword)).add(new Attack(npc1, player, true))
				.add(new Die(player));
	}

	@BuilderMethod
	public void ForestActions() {
		var node = get(MyNodeLabels.Forest.toString());
		node.add(new WalkTo(player, forestPath, "DirtPile"));
	}

	@BuilderMethod
	public void FountainActions() {
		var node = get(MyNodeLabels.Fountain.toString());
		node.add(new NarrationSequence(
				"There is an evil book shaped hole in the fountain. Would you like to add your evil book?"));
		node.add(new EnableInput());
		node.add(new Draw(player, evilBook));
	}

	@BuilderMethod
	public void InfiniteGoldActions() {
		var node = get(MyNodeLabels.InfiniteGold.toString());
		node.add(new NarrationSequence("The fountain erupts with gold, giving you seemingly an infinite amount!"));
	}

//Zev Gaslin
 */

/*
	@BuilderMethod
	public void PirateFightActions() {
		var node = get(MyNodeLabels.PirateFight.toString());
		node.add(new SetPosition(pirate, port, "BigShip"));
		node.add(new NarrationSequence(
				"Pirate: 'I don't believe ye landlubber! Face me in combat to prove your pirate prowess!'"));
		node.add(new Face(pirate, player)).add(new Draw(pirate, sword)).add(new Draw(player, sword))
				.add(new Attack(player, pirate, true)).add(new Die(pirate));
		node.add(new NarrationSequence("Pirate: 'Congrats you have bested thepirate captain in fair combat!\n+"
				+ "Arg! Ye are a true pirate'"));
	}

	@BuilderMethod
	public void PirateEndingActions() {
		var node = get(MyNodeLabels.PirateEnding.toString());
		node.add(new NarrationSequence(
				"You sail away from your past life, with nothing but the open ocean and your new mateys surrounding you. You may not have gotten your farm back, but you’ve found a new purpose exploring and pillaging the seven seas.\n"
						+ "\n" + "\n" + "\n" + "The End"));
	}

	@BuilderMethod
	public void NoActions() {
		var node = get(MyNodeLabels.No.toString());
		node.add(new NarrationSequence("Do ye want to be? I could always use some more crew."));
	}

	@BuilderMethod
	public void TooBadActions() {
		var node = get(MyNodeLabels.TooBad.toString());
		node.add(new NarrationSequence("Then get off me dock land lubber! >:("));
	}

	@BuilderMethod
	public void ArgActions() {
		var node = get(MyNodeLabels.Arg.toString());
		node.add(new NarrationSequence(
				"If ye wants to be a pirate, first you must go find my lost parrot. Here, this spy glass will help you find him."));
	}

	@BuilderMethod
	public void LoudAndObnoxiousTreeActions() {
		var node = get(MyNodeLabels.LoudAndObnoxiousTree.toString());
		node.add(new NarrationSequence(
				"You see something flying up in the tree. If only you had a spyglass, you could see what it is."));
	}

	@BuilderMethod
	public void LookThroughSpyglassActions() {
		var node = get(MyNodeLabels.LookThroughSpyglass.toString());
		node.add(new NarrationSequence("You see a parrot flying up in the tree."));
	}

	@BuilderMethod
	public void GrabHimActions() {
		var node = get(MyNodeLabels.GrabHim.toString());
		node.add(new NarrationSequence("You have a parrot now!"));
	}

//Jaedan Curcio
	@BuilderMethod
	public void YouDiedTownActions() {
		var node = get(MyNodeLabels.YouDiedTown.toString());
		node.add(new FadeOut());
		node.add(new NarrationSequence(
				"You took too much damage and passed out. A rude peasant found your body and dragged you back to town stealing a portion of your gold"));
		node.add(new SetPosition(player, town));
		node.add(new FadeIn());
	}

	@BuilderMethod
	public void YouDiedCityActions() {
		var node = get(MyNodeLabels.YouDiedCity.toString());
		node.add(new FadeOut());
		node.add(new NarrationSequence(
				"You took too much damage and passed out. You wake up in a mysterious, damp stone room."));
		node.add(new SetPosition(player, dungeon));
		node.add(new FadeIn());
	}

	@BuilderMethod
	public void ThroneRoomActions() {
		var node = get(MyNodeLabels.ThroneRoom.toString());
		node.add(new WalkTo(player, king));
		node.add(new NarrationSequence(
				"Who dares come into the great throne room of the great king, king Bartholomew the great?!?! State your buisness immediately or face my wrath!"));
	}

	@BuilderMethod
	public void FightKingActions() {
		var node = get(MyNodeLabels.FightKing.toString());
		node.add(new Face(player, king)).add(new Draw(king, sword)).add(new Draw(player, sword))
				.add(new NarrationSequence("Now, you die!")).add(new Attack(player, king, true)).add(new Die(king))
				.add(new Dance(player));
	}

	@BuilderMethod
	public void BuyYourLandBackActions() {
		var node = get(MyNodeLabels.BuyYourLandBack.toString());
		node.add(new NarrationSequence(
				"Very well, you have earned enough money to buy your land back. Capitalism wins yet again!"));
	}

	@BuilderMethod
	public void BuyKingdomActions() {
		var node = get(MyNodeLabels.BuyKingdom.toString());
		node.add(new NarrationSequence(
				"Really, you would be willing to buy this kingdom off me? King Bartholomew asked nervously. Honestly, I never did like being king always... I really just did it for the money. King Bartholomew gingerly paces back and forth across the room while nodding, becoming more and more certain with each step. Yes. I will sell you my kingdom."));
	}

//Zev Gaslin
	@BuilderMethod
	public void BribeTheGuard1Actions() {
		var node = get(MyNodeLabels.BribeTheGuard1.toString());
		node.add(new SetPosition(gaurd, hallway));
		node.add(new NarrationSequence("The guard happily takes your coins letting you into the Castle."));
	}

	@BuilderMethod
	public void MainHallActions() {
		var node = get(MyNodeLabels.MainHallUnsafe.toString());
		node.add(new NarrationSequence(
				"Disgused as a Castle Guard, you walk across the main hall briskly into the throne room."));
	}

	@BuilderMethod
	public void MainHallUnsafeActions() {
		var node = get(MyNodeLabels.MainHallUnsafe.toString());
		node.add(new NarrationSequence(
				"Another guard is standing guard not letting you progress further into the Castle (1/3)"));
	}

	@BuilderMethod
	public void BribeTheGuard2Actions() {
		var node = get(MyNodeLabels.BribeTheGuard2.toString());
		node.add(new NarrationSequence("The guard happily takes your coins letting you into the Castle."));
	}

	@BuilderMethod
	public void MainHallUnsafe2Actions() {
		var node = get(MyNodeLabels.MainHallUnsafe2.toString());
		node.add(new NarrationSequence("As you walk further into the Castle yet another guard blocks your path (2/3)"));
	}

	@BuilderMethod
	public void BribeTheGuard3Actions() {
		var node = get(MyNodeLabels.BribeTheGuard3.toString());
		node.add(new NarrationSequence("The guard happily takes your coins letting you even furhter into the Castle."));
	}

	@BuilderMethod
	public void MainHallUnsafe3Actions() {
		var node = get(MyNodeLabels.MainHallUnsafe3.toString());
		node.add(new NarrationSequence(
				"A final guard stands in the way of letting you acsess the kings thrown room. (3/3)"));
	}

	@BuilderMethod
	public void BribeTheGuard4Actions() {
		var node = get(MyNodeLabels.BribeTheGuard4.toString());
		node.add(new NarrationSequence("The guard happily takes your coins letting you into the throne room."));
	}

	@BuilderMethod
	public void FightTheGuardActions() {
		var node = get(MyNodeLabels.FightTheGuard.toString());
		node.add(new NarrationSequence("You won the fight taking and wearing the guards armor."));
	}

//Jaedan Curcio
	@BuilderMethod
	public void LandEndingActions() {
		var node = get(MyNodeLabels.LandEnding.toString());
		node.add(new FadeOut());
		node.add(new NarrationSequence(
				"You return to your farm, living out the rest of your days in peace. The king never dared approach your lands again. In the far future you sit on your porch at sunset, rocking back and fourth, proud to have this clod of earth to call your own.\n"
						+ "\n" + "The End."));
		node.add(new CreditsSequence(
				"Game coded and written by Zev Gaslin, Josh Haddad, and Jaedan Curcio.\n Look out for Adventures of Grungus 2: Electric Boogaloo in Blockbuster stores near you."));
	}

	@BuilderMethod
	public void KingdomEndingActions() {
		var node = get(MyNodeLabels.KindomEnding.toString());
		node.add(new FadeOut());
		node.add(new NarrationSequence(
				"King Bartholomew abdicates his throne, giving you full ownership of the kingdom and all its properties. King Bartholomew leaves, never to be seen again, having spent the rest of his life in a state of quite solitude on a farm in the furthest recesses of the countryside.\n"
						+ "\n"
						+ "Meanwhile, you are absolutely terrible at running your newly found kindom. Begging and farming were your main areas of expertise. You find yourself wholeheartedly unable to perform the managerial tasks required to be king. Due to your shortcomings, you quickly run the kingdom into anarchy and die unceremoniously of a heart attack due to the stress during a peasant revolt outside your castle.\n"
						+ "\n" + "The end."));
		node.add(new CreditsSequence(
				"Game coded and written by Zev Gaslin, Josh Haddad, and Jaedan Curcio.\n Look out for Adventures of Grungus 2: Electric Boogaloo in Blockbuster stores near you."));
	}
	*/

