package com.jubiman.mmt.trinket;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.staticBuffs.armorBuffs.trinketBuffs.TrinketBuff;
import necesse.inventory.InventoryItem;
import necesse.inventory.item.trinketItem.TrinketItem;

public class NecromancersBrooch extends TrinketItem {
	public NecromancersBrooch() {
		super(Rarity.LEGENDARY, 1000);
	}

	@Override
	public TrinketBuff[] getBuffs(InventoryItem item) {
		return new TrinketBuff[]{(TrinketBuff) BuffRegistry.getBuff("necromancersbrooch")};
	}
}
