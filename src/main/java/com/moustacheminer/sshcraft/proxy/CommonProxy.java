package com.moustacheminer.sshcraft.proxy;

import com.moustacheminer.sshcraft.blocks.BlockConsole;
import com.moustacheminer.sshcraft.init.ModBlocks;
import com.moustacheminer.sshcraft.items.ItemCheese;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public interface CommonProxy {
  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> event) {
    event.getRegistry().register(new BlockConsole());
  }
  
  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    event.getRegistry().register(new ItemCheese());
    event.getRegistry().register(new ItemBlock(ModBlocks.blockConsole).setRegistryName(ModBlocks.blockConsole.getRegistryName()));
  }
}
