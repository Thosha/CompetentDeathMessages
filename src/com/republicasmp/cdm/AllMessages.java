package com.republicasmp.cdm;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public abstract class AllMessages {
	public final static Message allMessages[] = {
		// the way this works is:
		// new Message(template, player damage cause, entity type that killed the player, material)
		// and leave the things that don't matter as "null"
		// the material could be a block or a held item
		// so to keep that from becoming an issue, use EntityType.PLAYER as the entity type for things where
		// a player killed another player
		// don't forget commas after each one except the last one
		
		// thanks for these, sicknote!
		new Message("Cleanup on aisle 12, we seem to have spilled some <victim>", DamageCause.FALL, null, null),
		new Message("<victim> can't break the laws of physics", DamageCause.FALL, null, null),
		new Message("<victim> couldn't keep it up", DamageCause.FALL, null, null),
		new Message("<victim> forgot to drink Red Bull", DamageCause.FALL, null, null),
		
		new Message("<killer>'s rod was too much for <victim> to handle", null, Material.STICK, EntityType.PLAYER),
		
		new Message("<victim>'s relationship with the squid could never last", DamageCause.DROWNING, null, null),
		new Message("<victim> drowned", DamageCause.DROWNING, null, null),
		new Message("<victim> forgot how to swim", DamageCause.DROWNING, null, null),
		new Message("<victim> must have tried on concrete shoes", DamageCause.DROWNING, null, null),
		
		// ...and now for mathphreak's
		new Message("<victim> was left for dead", null, null, EntityType.ZOMBIE),
		new Message("The cacti ate <victim>", null, Material.CACTUS, null),
		new Message("<killer> pushed <victim> off a cliff", DamageCause.FALL, null, EntityType.PLAYER),
		new Message("<victim> got witch slapped", null, null, EntityType.WITCH),
		new Message("<victim> went up in flames", DamageCause.FIRE, null, null),
		new Message("<victim> was a great conductor of electricity", DamageCause.LIGHTNING, null, null),
		new Message("<victim> was smited by an admin", DamageCause.CUSTOM, null, null),
		new Message("<victim> died, so everyone should yell at Prod again", DamageCause.CUSTOM, null, null),
		new Message("<victim> forgot to pack a lunch", DamageCause.STARVATION, null, null)
	};
	
	public final static Message genericMessage = new Message("<victim> died mysteriously", null, null, null);
}
