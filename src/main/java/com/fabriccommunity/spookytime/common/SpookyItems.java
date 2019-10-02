package com.fabriccommunity.spookytime.common;

import com.fabriccommunity.spookytime.SpookyTime;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpookyItems
{
    public static Item PUMPCOWN_SPAWN_EGG;
  
    public static Item DECEASED_DIRT;
    public static Item DECEASED_GRASS_BLOCK;
    public static Item DECEASED_SAND;
    public static Item DECEASED_GRAVEL;

    public static void init() {
        PUMPCOWN_SPAWN_EGG = register("pumpcown_spawn_egg", new SpawnEggItem(SpookyEntities.PUMPCOWN, 8273166, 14912029, new Item.Settings().group(ItemGroup.MISC)));
      
        DECEASED_DIRT = register("deceased_dirt", new BlockItem(SpookyBlocks.DECEASED_DIRT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        DECEASED_GRASS_BLOCK = register("deceased_grass_block", new BlockItem(SpookyBlocks.DECEASED_GRASS_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        DECEASED_SAND = register("deceased_sand", new BlockItem(SpookyBlocks.DECEASED_SAND, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        DECEASED_GRAVEL = register("deceased_gravel", new BlockItem(SpookyBlocks.DECEASED_GRAVEL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }

    private static Item register(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(SpookyTime.MODID, name), item);
    }

    private SpookyItems() {
        // NO-OP
    }
}
