package com.fabriccommunity.spookytime.world.layer;

import com.fabriccommunity.spookytime.world.SpookyBiomeGroup;

import net.minecraft.world.biome.layer.InitLayer;
import net.minecraft.world.biome.layer.LayerRandomnessSource;

public enum SetBiomeGroupsLayer implements InitLayer {
	INSTANCE;
	
	@Override
	public int sample(LayerRandomnessSource rand, int x, int z) {
		return SpookyBiomeGroup.pickRandomBiomeGroup(rand);
	}
}
