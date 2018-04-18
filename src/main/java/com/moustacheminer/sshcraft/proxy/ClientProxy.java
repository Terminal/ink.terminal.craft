package com.moustacheminer.sshcraft.proxy;

import com.moustacheminer.sshcraft.init.ModBlocks;
import com.moustacheminer.sshcraft.init.ModItems;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy implements CommonProxy {
  @SubscribeEvent
  public static void registerModels(ModelRegistryEvent event) {
    ModBlocks.initModels();
    ModItems.initModels();
  }
}
