package com.moustacheminer.sshcraft.init;

import com.moustacheminer.sshcraft.Configuration;
import com.moustacheminer.sshcraft.items.ItemCheese;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
  @GameRegistry.ObjectHolder(Configuration.MODID + ":cheese")
  public static ItemCheese itemCheese;
  
  @SideOnly(Side.CLIENT)
  public static void initModels() {
    itemCheese.initModel();
  }
}
